package co.com.puntoscolombia.certificacion.tasks;

import co.com.puntoscolombia.certificacion.interactions.StopWatch;
import co.com.puntoscolombia.certificacion.models.DestinoCliente;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.puntoscolombia.certificacion.userinterfaces.GenericsPage.BTN_CONTINUE;
import static co.com.puntoscolombia.certificacion.userinterfaces.GenericsPage.BTN_SELECT_DESTINO;
import static co.com.puntoscolombia.certificacion.userinterfaces.ItinerarioDeVueloPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class ItinerarioDeVuelo implements Task {
    private final DestinoCliente destinoCliente;

    public ItinerarioDeVuelo(DestinoCliente destinoCliente) {

        this.destinoCliente = destinoCliente;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SELECT_FECHA_IDA),
                Click.on(SELECT_FECHA_DIA_IDA.of(destinoCliente.getDiaIda())),
                Click.on(BTN_CONTINUE),
                Click.on(SELECT_FECHA_REGRESO),
                StopWatch.inSeconds(2),
                Click.on(SELECT_FECHA_DIA_REGRESO.of(destinoCliente.getDiaRegreso())),
                Click.on(BTN_CONTINUE),
                Click.on(CLICK_PASAJERO_ADULTO),
                Click.on(SELECT_PASAJERO.of(destinoCliente.getPasajeroAdulto())),
                Click.on(CLICK_PASAJERO_NINO),
                Click.on(SELECT_PASAJERO_NINO.of(destinoCliente.getPasajeroNino())),
                Click.on(BTN_SELECT_DESTINO)
        );
    }

    public static ItinerarioDeVuelo vuelo(DestinoCliente destinoCliente) {
        return Tasks.instrumented(ItinerarioDeVuelo.class, destinoCliente);
    }
}
