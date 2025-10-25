package co.com.puntoscolombia.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class GenericsPage {
    public static final Target BTN_CONTINUE = Target.the("Botón ok generico")
            .locatedBy("//button[@data-react-toolbox='button' and text()='Ok']");

    public static final Target BTN_SELECT_DESTINO = Target.the("Botón ok generico")
            .locatedBy("//button[normalize-space()='Select Destination']");

    public static final Target BTN_LOAD_MORE = Target.the("aca cargamos mas los vuelos")
            .locatedBy("//button[contains(@class, 'Gallery__cta-button')]");

    public static final Target BTN_APPLY = Target.the("aplicamos el codigo promocional")
            .locatedBy("//button[contains(., 'Apply')]");

    private GenericsPage() {


    }
}
