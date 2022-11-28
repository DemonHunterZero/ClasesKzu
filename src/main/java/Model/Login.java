package Model;

public class Login {

    String Mascota = "Iris";

    public static void main(String[] args) {

        String Usuario = "Zero";
        String Password = "PenduloLunar";
        int pin = 20051989;



        /*solo los textos se comparan con el metodo .equals, en los demas casos se usa el operador logico "=="
         * el .equal toma en diferencia entre mayusculas y minusculas como en las contraseñas
         * Para casos en donde la mayus o miniscula no importen se usa .equalIgnoreCase */

        if(Usuario.equalsIgnoreCase("Zero")){
            System.out.println("Usuario Aceptado");
        }
        else
            System.out.println("Usuario Incorrecto");

        if(Password.equals("penduloLunar")){
            System.out.println("Password Correcto");
        }
        else
            System.out.println("Password Incorrecto");

        if(pin ==(20051989)){
            System.out.println("Pin Correcto");
        }
        else
            System.out.println("Pin Incorrecto");

        /*ahora otro ejemplo usando el codigo else if
         * sino se cumple la primera condicion, ira a la segunda
         * y sino se cumple la segunda ira a la tercera y asi
         * FRENARA CUANDO SE CUMPLE UNA DE TODAS LAS CONDICIONES
         * para negar se pone ! antes de Conocido
         *Ej: if(!Conocido1.equalsIgnoreCase("Tu novia")) */

        String Conocido1 = "Tu Novia";
        String Conocido2 = "Tu ex";
        String Conocido3 = "Tu amante";
        String Conocido4 = "El marido de tu amante";
        String Conocido5 = "Tu madre";

        if(Conocido1.equalsIgnoreCase("Tu novia")){
            System.out.println("Oh! que bien!");
        }
        else if (Conocido2.equalsIgnoreCase("Tu Ex")) {
            System.out.println("Oh! que mal!");
        }
        else if (Conocido3.equalsIgnoreCase("tu amante")) {
            System.out.println("Oh! que bien!");
        }
        else if (Conocido4.equalsIgnoreCase("el marido de tu amante")) {
            System.out.println("Oh! que mal!");
        }
        else if (Conocido5.equalsIgnoreCase("tu madre")) {
            System.out.println("Oh! que... bien???");
        }
        else {
            System.out.println("¿Entonces quien mierda es?");
        }

        /*and (&&) y or(||) son los operadores logicos
         * ahora lo usaremos para el ejemplo de login el operador and(&&)
         * Para el usuario no tomara en cuenta las mayusculas o minusculas
         * Para la contraseña tomara en cuenta las mayusculas o minusculas
         * Para el pin solo admitira valores enteros
         * Se deben cumplir correctamente las 3 condiciones (if) sino (else) denegara el acceso*/

        if (Usuario.equalsIgnoreCase("zero") && Password.equals("PenduloLunar") && pin == 20051989){
            System.out.println("Acceso Concedido");}
        else{
            System.out.println("Acceso Denegado");}

        /*ahora usaremos el operador logico or(||)
         * Si de cenar hay Pizza o Papas fritas entonces comere
         * Sino paso de cenar*/
        String Comida1 = "Pizza";
        String Comida2 = "Papas Fritas";

        if (Comida1.equalsIgnoreCase("Ensalada") || Comida2.equalsIgnoreCase("papas fritas")){
            System.out.println("Si, cenare");
        }
        else {
            System.out.println("No, gracias, paso de cenar hoy");
        }
        /*llamamos al metodo validarMascota, si el nombre de la mascota no coincide con el parametro mascota
        * inicializado al inicio de esta clase, imprimira un valor falso (false), en caso de que sea correcto imprimira
        * un verdadero (true)*/
        System.out.println(validarMascota("Iris"));

        /*ahora ponemos condicionantes consecutivos para validar un login; osea que pedimos un usuario una contraseña
        * y el pin*/
        if (Usuario.equalsIgnoreCase("Zero")){
            if (Password.equals("PenduloLunar")){
                if (pin==(20051989)){
                    System.out.println("Acceso Permitido");

                }
            }
        }
        /*Aqui tenemos una forma mas entendible para validar un usuario,contraseña,pin
        * No obstante no es el metodo mas "correcto" dado que asi no es tan escalable*/
        if (Usuario.equalsIgnoreCase("ZERO") && Password.equals("PenduloLunar") && pin==(20051989)) {
            System.out.println("Acceso Permitido");
        }
        else {
            System.out.println("Acceso Denegado");
        }
    }

    /*ahora usaremos el bootlean para validar una mascota. El If es para evaluar, si es correcto dara verdadero, sino
    * dara falso dado que solo son las unicas dos opciones que puede retornar un bootlean, por ende no necesita un
    * else */
    private static boolean validarMascota(String Mascota) {

        if (Mascota.equals(Mascota)){
            return true;
        }
        return false;

    }

}