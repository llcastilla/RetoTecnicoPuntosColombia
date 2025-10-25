package co.com.puntoscolombia.certificacion.tasks;

import co.com.puntoscolombia.certificacion.interactions.StopWatch;
import co.com.puntoscolombia.certificacion.models.DestinoCliente;
import co.com.puntoscolombia.certificacion.models.FiltroVuelo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

import static co.com.puntoscolombia.certificacion.userinterfaces.FiltroPrecioVuelosPage.SELECCIONAR_VUELO;
import static co.com.puntoscolombia.certificacion.userinterfaces.FiltroPrecioVuelosPage.VALOR_FILTRO;
import static co.com.puntoscolombia.certificacion.userinterfaces.GenericsPage.*;
import static co.com.puntoscolombia.certificacion.userinterfaces.ItinerarioDeVueloPage.*;


public class FiltroPrecioVuelos implements Task {
    private final FiltroVuelo filtroVuelo;

    public FiltroPrecioVuelos( FiltroVuelo filtroVuelo) {
        this.filtroVuelo = filtroVuelo;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(VALOR_FILTRO),
                SendKeys.of(Keys.CONTROL, "a").into(VALOR_FILTRO),
                SendKeys.of(Keys.DELETE).into(VALOR_FILTRO),
                Enter.theValue(filtroVuelo.getValor()).into(VALOR_FILTRO),
                Scroll.to(BTN_LOAD_MORE),
                Click.on(BTN_LOAD_MORE),
                Click.on(SELECCIONAR_VUELO.of(filtroVuelo.getPrecioVuelo()))





                );
    }

    public static FiltroPrecioVuelos precio(FiltroVuelo filtroVuelo) {
        return Tasks.instrumented(FiltroPrecioVuelos.class, filtroVuelo);
    }
}
