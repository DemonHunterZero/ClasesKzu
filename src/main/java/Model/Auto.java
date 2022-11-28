package Model;

public class Auto {
    private String color;

    private int Cantidaddepuertas;

    private int Cantidaddeventanas;

    private int Cantidadderuedas;
    /*si quisieramos que un valor fuera inmutable le damos un valor con = y no lo setteamos, solo le damos get*/

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCantidaddepuertas() {
        return Cantidaddepuertas;
    }

    public void setCantidaddepuertas(int cantidaddepuertas) {
        Cantidaddepuertas = cantidaddepuertas;
    }

    public int getCantidaddeventanas() {
        return Cantidaddeventanas;
    }

    public void setCantidaddeventanas(int cantidaddeventanas) {
        Cantidaddeventanas = cantidaddeventanas;
    }

    public int getCantidadderuedas() {
        return Cantidadderuedas;
    }

    public void setCantidadderuedas(int cantidadderuedas) {
        Cantidadderuedas = cantidadderuedas;
    }

    /*creo con un constructor un auto vacio*/
    public Auto() {
    }

    /*ahora creo con el constructor un auto con todos los parametros q me interesen*/
    public Auto(String color, int cantidaddepuertas, int cantidaddeventanas, int cantidadderuedas) {
        this.color = color;
        Cantidaddepuertas = cantidaddepuertas;
        Cantidaddeventanas = cantidaddeventanas;
        Cantidadderuedas = cantidadderuedas;
    }

    /*creamos un metodo para crear un auto de serie donde tomara los valores del auto estandar como si fuera un get*/
    public Auto retornarauto(){
        return new Auto();
    }
    /*creamos un metodo para que nos devuelve null*/
    public Auto retornarnull(){
        return null;
}


    @Override
    public String toString() {
        return "Auto{" +
                "color='" + color + '\'' +
                ", Cantidaddepuertas=" + Cantidaddepuertas +
                ", Cantidaddeventanas=" + Cantidaddeventanas +
                ", Cantidadderuedas=" + Cantidadderuedas +
                '}';
    }
}
