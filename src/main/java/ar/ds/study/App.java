package ar.ds.study;

import Model.Auto;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

/**Hello world!**/
public class App {
    /*Clase1: */
    public static void main(String[] args)

    {
        //se usa (//) para hacer comentarios de una sola linea
        /*y se usa (ctrl+shit+/) para hacer comentarios de varias lineas
        * o tambien puedes escribir asi ("/"* comentario *"/") pero sin las "" */

            /*Aca inicializaremos algunas variables, primero diremos de que tipo es, int, boolean, string, etc y luego
            * con el = la inicilizaremos y le daremos un valor concorde al tipo de variable que estamos creando*/
            int numerouno = 1;
            int numerodos = 2;
            int primernumeroentero = 0;
            boolean verdad = true;
            boolean mentira = false;
            String nombre = "Alan"; //el string si o si va entre ""
            String saludo = "Hola manga de hijos de p...";

            //iniciare variables de ejemplo de menor a mayor capacidad numerica o complejidad
            byte losnumerosmaschicos = 120; //va desde -128 a 128
            char numeritos = 59; //va desde 0 hasta 65535
            short numeroschicos = -32768; // va desde -32768 a 32767
            int numeromenorint = -2147483648; //va desde -2147483648 a 2147483647
            long billgatemoney = 1336518512L; //va desde -9223372036854775808 a 9223372036854775807
            double pi = 3.141592653589793238462; //Números en coma flotante de doble precisión
            float altura = 1.85f; //estara bien esto?

            /*a float y double a veces por defecto puede salir que pertenece a otro tipo de variable
            pero puedes determinar que se guarde en memoria poniendo le letra f o d (de float o double)
            al final del valor*/

            /*cuando ponemos final antes del tipo de variable le determinamos al sistema que dicho valor sera una constante
            * y no podra ser modificada en el curso de la ejecucion por lo tanto podria ser llamada con el get, pero no
            * podria ser modificada con el set*/

            final int CargadorDeUnRevolver = 6;

    //ahora imprimiremos por consola dos de las variables que hemos inicializado. En este caso nombre y altura.
            System.out.println(altura);
            System.out.println(nombre);
            System.out.println(saludo);

    //ahora imprimiremos con consolta usando concadenacion y haciendo saltos de linea
    // el \n permite un salto de linea dentro de un string
            System.out.println(saludo + "\n mi nombre es \n" + nombre );

    //tambien podemos imprimir por consola algun mensaje en string
            System.out.println("Larga vida a la matriarca!!!");

    //tambien podemos concadenar un mensaje con una variable
            System.out.println("Mi altura es " + altura + " metros");



            final int PRIMER_VALOR_DE_LA_SUMA = 1;

            System.out.println("Hello World!");

            Variables variables = new Variables();

            int resultado = variables.suma(PRIMER_VALOR_DE_LA_SUMA, 80);

            System.out.println("variable" + resultado);

            System.out.println("numero1 privado: " + variables.getNumero1());
            System.out.println("numero2 privado: " + variables.getNumero2());

            variables.setNumero1(20);
            variables.setNumero2(22);

            System.out.println("numero1 privado: " + variables.getNumero1());
            System.out.println("numero2 privado: " + variables.getNumero2());

            variables = new Variables(70, 80);

            System.out.println("numero1 privado: " + variables.getNumero1());
            System.out.println("numero2 privado: " + variables.getNumero2());


            /*aqui empieza la tarea que nos dejo el jefe*/
            System.out.println(variables.resta(10, 22));
            System.out.println(variables.division1(200, 10));

            int resultado01 = variables.resta(70, 20);
            int resultado02 = variables.division1(500, 5);
            System.out.println(resultado01);
            System.out.println(resultado02);

            System.out.println(multiplicacion(22, 2, 1));

        {
            ///////////////////////////////////////////////////////////////////////////////////////////////////
            /*Clase 3*/

            /*creamos una nueva instancia de la clase auto*/
            Auto auto1 = new Auto();
            System.out.println("auto ["+ auto1 +"]");

            /*tomamos con get las propiedades y valores del auto*/
            auto1.getCantidaddepuertas();
            auto1.getCantidadderuedas();
            auto1.getCantidaddeventanas();
            auto1.getColor();

            System.out.println("auto ["+ auto1 +"]");

            /*Setteamos un auto y asi cambiamos los valores de la clase auto*/
            auto1.setCantidaddepuertas(5);
            auto1.setCantidadderuedas(4);
            auto1.setCantidaddeventanas(6);
            auto1.setColor("Red");

            System.out.println("auto ["+ auto1 +"]");

            /*creamos ahora una lista de autos (al imprimirlo estara vacio)*/
            List<Auto> autoList = new ArrayList<Auto>();
            System.out.println("autolist [" + autoList + "]");

            /*Agregamos un auto a la lista*/
            autoList.add(auto1);
            System.out.println("autolist [" + autoList + "]");

            /*crearemos un nuevo auto para agregar luego a la lista*/

            /*mas correcto seria decir que creamos una nueva instancia de la clase Auto
            llamada auto2 y tomamos y cambiamos el valor de sus propiedades con el comando Set*/
            Auto auto2 = new Auto();
            auto2.setCantidaddepuertas(4);
            auto2.setCantidadderuedas(6);
            auto2.setCantidaddeventanas(6);
            auto2.setColor("Grey");

            autoList.add(auto2);
            System.out.println("autolist [" + autoList + "]");

            Auto auto3 = new Auto();
            auto3.setCantidaddepuertas(2);
            auto3.setCantidadderuedas(4);
            auto3.setCantidaddeventanas(4);
            auto3.setColor("Crimson");

            autoList.add(auto3);
            System.out.println("autolist [" + autoList + "]");

            /*ahora vamos a borrar el primer auto de la lista (el primero de la lista arranca con el index 0)
             * (si quisieramos borrar el segundo auto de la lista seria index 1*/

            autoList.remove(0);
            System.out.println("autolist [" + autoList + "]");


            /*tambien se puede borrar no desde el index de la lista sino el objeto con autoList.remove objet auto1,auto2,etc
             * al borrar los dos autos, uno desde la lista y otro como objeto la lista quedara solo con un auto en este caso*/
            autoList.remove(auto2);
            System.out.println("autolist [" + autoList + "]");

            /*si deseo que me muestre un elemento del index puedo usar el comando SOUT y colocar autolist.get (numero del index)
             * al solo quedarme un auto en la lista el primero de la lista es el index0 que en este caso seria el auto3*/
            System.out.println("autolist [" + autoList.get(0) + "]");

            /*si quiero borrar o limpiar la lista se usa este comando: autolist.clear*/
            autoList.clear();
            System.out.println("autolist [" + autoList + "]");

            /*en este caso me debe devolver un auto con el metodo retornar auto vacio*/
            System.out.println("retornarauto [" + auto2.retornarauto() + "]");

            System.out.println("retornarnull [" +auto3.retornarnull() + "]");

            /*creo un auto con propiedades a traves del constructor que cree en la clase Auto*/
            Auto autoConPropiedades = new Auto("Orange",5,6,8);
            System.out.println("autoConPropiedades [" + autoConPropiedades + "]");

            /*tambien puedo settear las ruedas de este nuevo auto*/
            autoConPropiedades.setCantidadderuedas(6);
            System.out.println("autoConPropiedades [" + autoConPropiedades + "]");

        /*deberia tirarme error null pointer pero no lo hace sino que tira error exception por el try catch exception.
        Se programo asi para que el programa no caiga...*/
                obtenerAutos();
        }


    }

        int protonumero01 = 33;
        int protonumero02 = 66;
        int protonumero03 = 104;

    {
        System.out.println(multiplicacion(protonumero01, protonumero02, protonumero03));
    }

    private static int multiplicacion(int protonumero01, int protonumero02, int protonumero03)
    {return protonumero01 * protonumero03;}




    ///////////////////////////////////////////////////////////////////////////
    /*Clase 4 IF ELSE y TRY CATCH EXCEPTION*/

    private static List<Auto>obtenerAutos() {
        List<Auto> miLista = null;
        /*al llamar al metodo miLista mediante toString le suelta que la lista es nula, no existe entonces da un error,
        pero es capturado por try (catch) y usando el metodo exception lo excluye para que le programa no caiga
        y luego imprime el error con sout. Si se borra el siguiente comentario tiraria el error*/

        //  System.out.println(miLista.toString());

        //Variables var = new Variables(); (ejemplo kzu)

        try{
            System.out.println(miLista.toString());
            //var.retornarException(); (ejemplo kzu)
        }
        catch (Exception e) {
            System.out.println("[Exception] Error al intentar asignar un valor a la lista de auto [" + e.getMessage() + "]");
        }
        return miLista;

    }

}



