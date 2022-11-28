package ar.ds.study.exceptions;

/*Con esta clase heredaremos gracias a "extends" los atributos de la clase Exception para asi poder personalizar
* nuestras exceptiones*/
public class LoginWithExceptions extends Exception{

    private String message;

    /*aqui vamos generate, constructor y tomamos la opcion de String Message
    * Nos dejaria algo asi, pero nosotros lo modificaremos para que solo arroje un mensaje
    * y no dos borrando la 3ra linea y quitando el segundo string dentro del parentesis*/

//    public LoginWithExceptions(String message, String message1) {
//        super(message);
//        this.message = message1;}

    public LoginWithExceptions(String message) {
        super(message);

    }
}
