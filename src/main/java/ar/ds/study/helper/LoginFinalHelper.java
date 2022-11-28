package ar.ds.study.helper;
import ar.ds.study.exceptions.LoginWithExceptions;
public class LoginFinalHelper
{
    public static void main( String[] args ) {
        String usuario = "DemonHunterZero";
        String contraseña = "SumireLove";
        System.out.println("Logiando...");


        try{
            if (validarLogin(usuario,contraseña)){
                System.out.println("Acceso Concedido");
            }
            else {
                System.out.println("Acceso Denegado");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
    /*Se configura para que validarUsuario sea string y tire (Throw) un error si la longitud es
    igual o menor a 4 caracteres, de ser asi arrojara un mensaje*/

    private static void validarUsuario(String usuario) throws LoginWithExceptions {
        if (usuario.length() <=4){
            throw new LoginWithExceptions("El usuario debe tener al menos 5 caracteres");
        }

    }
    /*Si la contraseña tiene menos de 8 o ("||") mas de 15 caracteres arrojara el error*/
    private static void validarContraseña(String contraseña) throws LoginWithExceptions {
        if (contraseña.length() <8 || contraseña.length() >15){
            throw new LoginWithExceptions("El contraseña debe tener mas de 8 caracteres y menos de 15");
        }

    }
    private static boolean validarLogin(String usuario, String contraseña) {
        try{
            validarUsuario(usuario);
            validarContraseña(contraseña);
        }
        catch (LoginWithExceptions e){
            System.out.println(e);
            return false;
        }
        return true;
    }
}
