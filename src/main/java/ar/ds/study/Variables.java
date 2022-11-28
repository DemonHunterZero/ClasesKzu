package ar.ds.study;

public class Variables {

    /*clase DTO se usa para crear objetos con las propiedades del objeto creo...
    * aprender a diferenciar el TO de una entidad (buscar)
    * arquitectura, patrones de diseño*/

    private int numero1;

    public int numero2 = -20;

    public Variables() {
    }

    public Variables(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int suma(int num1, int num2)
    {return num1 + num2;}

    public int resta(int num1, int num2)
    {return num1 - num2;}

    public int division1(int num1, int num2)
    {return num1 / num2;}

    private int division2(int num1, int num2)
    {return num2 / num1;}

    /*creamos un metodo para que al llamarlo arroje una excepcion y se caiga*/
    public void retornarException() throws Exception{
        throw new Exception("me caigo porque quiero");
    }

    }


