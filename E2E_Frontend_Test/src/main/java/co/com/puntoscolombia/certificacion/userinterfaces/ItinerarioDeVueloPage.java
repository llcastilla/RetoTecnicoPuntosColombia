package co.com.puntoscolombia.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ItinerarioDeVueloPage {

    public static final Target SELECT_FECHA_IDA = Target.the("para seleccionar DIA")
            .locatedBy("(//input[contains(@class, 'WhiteDatePicker__inputElement')])[1]");


    public static final Target SELECT_FECHA_DIA_IDA = Target.the("FECHA para seleccionar DIA DE IDA")
            .locatedBy("//div[@data-react-toolbox='day']/span[text()='{0}']/parent::div");


    public static final Target SELECT_FECHA_REGRESO = Target.the("FECHA para seleccionar DIA de regreso")
            .locatedBy("(//input[contains(@class, 'WhiteDatePicker__inputElement')])[2]");


    public static final Target SELECT_FECHA_DIA_REGRESO = Target.the("FECHA para seleccionar DIA de regreso")
            .locatedBy("//div[@data-react-toolbox='day']/span[text()='{0}']/parent::div");

    public static final Target CLICK_PASAJERO_ADULTO = Target.the("aca selecionamos los pasajeros adultos")
            .locatedBy("(//input[contains(@class, 'WhiteDropDown__inputInputElement')])[1]");

    public static final Target SELECT_PASAJERO = Target.the("aca selecionamos los pasajeros adultos")
            .locatedBy("(//ul[contains(@class, 'WhiteDropDown__values')])[1]//li[normalize-space(text())='{0}']");


    public static final Target CLICK_PASAJERO_NINO = Target.the("aca selecionamos los pasajeros niños")
            .locatedBy("(//input[contains(@class, 'WhiteDropDown__inputInputElement')])[2]");

    public static final Target SELECT_PASAJERO_NINO = Target.the("aca selecionamos los pasajeros adultos")
            .locatedBy("(//ul[contains(@class, 'WhiteDropDown__values')])[2]//li[normalize-space(text())='{0}']");


    private ItinerarioDeVueloPage() {

    }
}
