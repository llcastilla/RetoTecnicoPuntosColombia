package co.com.puntoscolombia.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class FiltroPrecioVuelosPage {

    public static final Target VALOR_FILTRO = Target.the("para seleccionar DIA")
            .locatedBy("(//input[@role='input' and contains(@class, 'theme__inputElement')])[8]");


    public static final Target SELECCIONAR_VUELO = Target.the("para seleccionar DIA")
            .locatedBy("//div[@class='theme__cardActions___1aHjq GalleryItem__cardActions___zE_tm']     [span[contains(., '{0}')]]     //button[normalize-space()='Book']");


    private FiltroPrecioVuelosPage() {

    }
}
