package co.com.puntoscolombia.certificacion.stepdefinitions;

import co.com.puntoscolombia.certificacion.models.Customer;
import co.com.puntoscolombia.certificacion.questions.CalcularDescuento;
import co.com.puntoscolombia.certificacion.tasks.DatosClienteVuelo;
import co.com.puntoscolombia.certificacion.tasks.FiltroPrecioVuelos;
import co.com.puntoscolombia.certificacion.tasks.ItinerarioDeVuelo;
import co.com.puntoscolombia.certificacion.userinterfaces.MainPagePage;
import co.com.puntoscolombia.certificacion.utils.dataPruebas;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.webdriver.SerenityWebdriverManager;

import static co.com.puntoscolombia.certificacion.utils.WordsToRemember.CUSTOMER_DATA;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class CrearViajeEnLineaStep {

    @After
    public static void CloseDriver() {
        SerenityWebdriverManager.inThisTestThread().getCurrentDriver().quit();
    }

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
        Actor actor = OnStage.theActorCalled("actor");
        actor.wasAbleTo(Open.browserOn().the(MainPagePage.class));
    }

    @Given("el usuario ingresa los datos del viaje desde {}")
    public void elUsuarioIngresaLosDatosDelViajeDesdeDataViajePrecio(String prolife) {
        theActorInTheSpotlight().remember(CUSTOMER_DATA, dataPruebas.getCustomerDataWith(prolife));

    }
    @When("aplica el filtro de precios y selecciona el destino parametrizado")
    public void aplicaElFiltroDePreciosYSeleccionaElDestinoParametrizado() {
        Customer customer = theActorInTheSpotlight().recall(CUSTOMER_DATA);

        theActorInTheSpotlight().attemptsTo(
                ItinerarioDeVuelo.vuelo(customer.getDestinoCliente()),
                FiltroPrecioVuelos.precio(customer.getFiltroVuelo())
        );

    }
    @And("completa los datos del formulario y realiza el pago")
    public void completaLosDatosDelFormularioYRealizaElPago() {

        Customer customer = theActorInTheSpotlight().recall(CUSTOMER_DATA);

        theActorInTheSpotlight().attemptsTo(
                DatosClienteVuelo.checkout(customer.getContacto())
        );
    }
    @Then("el sistema muestra la confirmación del viaje agendado exitosamente")
    public void elSistemaMuestraLaConfirmaciónDelViajeAgendadoExitosamente() {

        theActorInTheSpotlight().should(
                seeThat("el descuento aplicado es correcto", CalcularDescuento.esCorrecto())
        );

    }




}
