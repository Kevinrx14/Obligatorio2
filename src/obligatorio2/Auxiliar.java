//Kevin Rinaldi (240179)
//Ex compañero Andres Martinez (184534)
package obligatorio2;
import java.util.*;

public class Auxiliar {
    //Metodo para ingresar texto
    public String ingresarTexto() {
        Scanner input = new Scanner(System.in);
        String datoIngresado;
        boolean verificador;

        do {
            verificador = true;

            datoIngresado = input.nextLine();
            //Chequeo que el texto ingresado no sea vacio
            if (datoIngresado.isEmpty()) {
                System.out.println("Por favor ingrese un texto");
                verificador = false;
            }
        } while (verificador == false);

        return datoIngresado;
    }
    
        //Metodo para ingresar numero
    public int ingresarNumero(String aIngresar) {
        Scanner input = new Scanner(System.in);
        int datoIngresado;
        boolean verificador;
        
        do {
            verificador = true;
            
            try {
                datoIngresado = input.nextInt();
                input.nextLine();
            } //Si el dato ingresado no es un int entra en la exception, 
            //muestra el mensaje de error y la variable se setea en 0
            catch (InputMismatchException exception) {
                System.out.println("El valor ingresado no es numerico");
                datoIngresado = 0;
            }
        } while(verificador == false);
        return datoIngresado;
    }
    
    //Metodo para ingresar un booleano
    public boolean ingresarBoolean() {
        Scanner input = new Scanner(System.in);
        boolean devolucion = false;
        boolean verificador;
        String datoIngresado;

        //Verifica si se ingreso si o no
        do {
            verificador = true;

            datoIngresado = input.nextLine();
            datoIngresado = datoIngresado.toLowerCase();

            switch (datoIngresado) {
                case "si":
                    devolucion = true;
                    break;

                case "no":
                    devolucion = false;
                    break;

                default:
                    System.out.println("El valor ingresado no es correcto, por favor ingrese Si/No");
                    System.out.println("\n");
                    verificador = false;
                    break;
            }
        } while (verificador == false);

        return devolucion;
    }
}
