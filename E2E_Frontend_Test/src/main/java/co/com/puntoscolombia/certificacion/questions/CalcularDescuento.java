package co.com.puntoscolombia.certificacion.questions;


import co.com.puntoscolombia.certificacion.userinterfaces.DetalleCompraPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class CalcularDescuento implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        // Capturar los valores directamente del DOM (de forma segura y dinámica)
        String viajerosText = Text.of(DetalleCompraPage.VIAJEROS).answeredBy(actor).trim();
        String precioText = Text.of(DetalleCompraPage.PRECIO_POR_PERSONA).answeredBy(actor).trim();
        String totalFinalText = Text.of(DetalleCompraPage.DESCUENTO_FINAL).answeredBy(actor).trim();

        // Validación inicial para detectar vacíos o nulos
        if (viajerosText.isEmpty() || precioText.isEmpty() || totalFinalText.isEmpty()) {
            throw new AssertionError("Error: uno o más valores están vacíos.\n" +
                    "VIAJEROS: [" + viajerosText + "]\n" +
                    "PRECIO POR PERSONA: [" + precioText + "]\n" +
                    "TOTAL FINAL: [" + totalFinalText + "]");
        }

        // Limpieza de caracteres no numéricos y conversión
        int viajeros = Integer.parseInt(viajerosText.replaceAll("[^0-9]", ""));
        double precioPorPersona = Double.parseDouble(precioText.replaceAll("[^0-9.]", ""));
        double totalFinal = Double.parseDouble(totalFinalText.replaceAll("[^0-9.]", ""));

        // Cálculos
        double totalSinDescuento = viajeros * precioPorPersona;
        double descuentoCalculado = totalSinDescuento - totalFinal;
        double porcentajeDescuento = (descuentoCalculado / totalSinDescuento) * 100;

        // Logs visibles en consola y reporte Serenity
        System.out.println("============== VALIDACIÓN DE DESCUENTO DINÁMICO ==============");
        System.out.println("Viajeros capturados: " + viajerosText + " → " + viajeros);
        System.out.println("Precio por persona: $" + precioPorPersona);
        System.out.println("Total sin descuento: $" + totalSinDescuento);
        System.out.println("Total final mostrado: $" + totalFinal);
        System.out.println("Descuento calculado: $" + descuentoCalculado);
        System.out.println("Porcentaje de descuento: " + String.format("%.2f", porcentajeDescuento) + "%");
        System.out.println("==============================================================");

        // Validación final
        return descuentoCalculado > 0 && totalFinal < totalSinDescuento;
    }

    public static CalcularDescuento esCorrecto() {
        return new CalcularDescuento();
    }
}