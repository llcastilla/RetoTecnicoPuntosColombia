package co.com.puntoscolombia.certificacion.tasks;

import co.com.puntoscolombia.certificacion.interactions.StopWatch;
import co.com.puntoscolombia.certificacion.models.Contacto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;

import java.nio.file.Path;

import static co.com.puntoscolombia.certificacion.userinterfaces.DatosClienteVueloPage.*;
import static co.com.puntoscolombia.certificacion.userinterfaces.FiltroPrecioVuelosPage.VALOR_FILTRO;
import static co.com.puntoscolombia.certificacion.userinterfaces.GenericsPage.BTN_APPLY;


public class DatosClienteVuelo implements Task {
    private final Contacto contacto;
    String rutaArchivo = System.getProperty("user.dir") + "/src/test/resources/documentos/descarga.jpg";

    public DatosClienteVuelo(Contacto contacto) {


        this.contacto = contacto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(contacto.getNombre()).into(NOMBRE_CLIENTE),
                Enter.theValue(contacto.getCorreo()).into(CORREO_CLIENTE),
                Enter.theValue(contacto.getSeguroSocial()).into(SEGURIDAD_SOCIAL_CLIENTE),
                Enter.theValue(contacto.getTelefono()).into(TELEFONO_CLIENTE),
                Upload.theFile(Path.of(rutaArchivo)).to(CARGAR_ARCHIVO_CLIENTE),
                Enter.theValue(contacto.getCodigoPromocional()).into(CODIGO_PROMOCIONAL_CLIENTE),
                Click.on(BTN_APPLY),
                Click.on(ACEPTAR_TERMINOS),
                StopWatch.inSeconds(2)
        );
    }

    public static DatosClienteVuelo checkout(Contacto contacto) {
        return Tasks.instrumented(DatosClienteVuelo.class,contacto);
    }
}
