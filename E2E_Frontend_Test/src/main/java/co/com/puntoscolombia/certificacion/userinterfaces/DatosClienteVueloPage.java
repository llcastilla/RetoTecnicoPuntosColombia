package co.com.puntoscolombia.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class DatosClienteVueloPage {


    public static final Target NOMBRE_CLIENTE = Target.the("ingresamos el nombre del cliente")
            .locatedBy("(//input[@role='input' and contains(@class, 'theme__inputElement')])[9]");


    public static final Target CORREO_CLIENTE = Target.the("ingresamos el correo del cliente")
            .locatedBy("(//input[@role='input' and contains(@class, 'theme__inputElement')])[10]");

    public static final Target SEGURIDAD_SOCIAL_CLIENTE = Target.the("ingresamos el seguro social del cliente")
            .locatedBy("(//input[@role='input' and contains(@class, 'theme__inputElement')])[11]");

    public static final Target TELEFONO_CLIENTE = Target.the("ingresamos el telefono del cliente")
            .locatedBy("(//input[@role='input' and contains(@class, 'theme__inputElement')])[12]");

    public static final Target CODIGO_PROMOCIONAL_CLIENTE = Target.the("ingresamos el codigo promocional del cliente")
            .locatedBy("(//input[@role='input' and contains(@class, 'theme__inputElement')])[13]");


    public static final Target CARGAR_ARCHIVO_CLIENTE = Target.the("subimos el archivo del cliente")
            .locatedBy("//input[@type='file']");


    public static final Target ACEPTAR_TERMINOS = Target.the("aceptamos los terminos y condiciones")
            .locatedBy("//label[span[text()='I agree to the terms and conditions']]/div[@data-react-toolbox='check']");

    private DatosClienteVueloPage() {

    }
}
