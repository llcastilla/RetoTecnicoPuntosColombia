package co.com.puntoscolombia.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class DetalleCompraPage {


    public static final Target VIAJEROS = Target.the("número de viajeros")
            .locatedBy("//div[contains(text(),'travelers')]");

    public static final Target PRECIO_POR_PERSONA = Target.the("precio por persona")
            .locatedBy("(//div[contains(text(),'$')])[1]");

    public static final Target DESCUENTO_FINAL = Target.the("total con descuento aplicado")
            .locatedBy("//div[contains(@class,'OrderSummary__row-6') and .//text()='Total']//strong");
}
