package co.com.puntoscolombia.certificacion.exeptions;

public class CouldNotReadTheJsonExeption extends Exception{

    public CouldNotReadTheJsonExeption(String mensaje, Throwable e){
        super(mensaje, e);
    }
}
