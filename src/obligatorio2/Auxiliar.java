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
            
            switch (aIngresar) {
                case "barrio":
                    //Chequeo que no sea menor que 1 o mayor que 10, si lo es se muestra mensaje de error
                    if (datoIngresado < 1 || datoIngresado > 10) {
                        System.out.println("Por favor ingrese un barrio entre 1 y 10");
                        verificador = false;
                    }
                    break;
                    
                case "caloria":
                    if (datoIngresado < 1 || datoIngresado > 900) {
                        System.out.println("Por favor ingrese calorias entre 1 y 900");
                        verificador = false;
                    }
                    break;
                    
                case "tipo":
                    if (datoIngresado < 1 || datoIngresado > 8) {
                        System.out.println("Por favor ingrese un tipo entre 1 y 8");
                        verificador = false;
                    }
                    break;
                    
                case "costo":
                    if (datoIngresado < 1) {
                        System.out.println("Por favor ingrese un costo mayor a 0");
                        verificador = false;
                    }
                    break;
                    
                case "dia":
                    if (datoIngresado < 1 || datoIngresado > 31) {
                        System.out.println("Por favor ingrese un dia entre 1 y 31");
                        verificador = false;
                    }
                    break;
                    
                case "hora":
                    if (datoIngresado < 8 || datoIngresado > 18) {
                        System.out.println("Por favor ingrese una hora entre 8 y 18");
                        verificador = false;
                    }
                    break;
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
    
    //Menu principal
    public int menu() {
        int opcion;

        System.out.println("Digite la opcion que desea");
        System.out.println("-----------------------------");
        System.out.println("1) Registrar cliente");
        System.out.println("2) Registrar mensajero");
        System.out.println("3) Registrar plato");
        System.out.println("4) Registrar pedido");
        System.out.println("5) Consulta pedidos");
        System.out.println("6) Menu");
        System.out.println("7) Planilla de envio");
        System.out.println("8) Consulta de tipo");
        System.out.println("9) Salir");
        System.out.println("-----------------------------");
        System.out.print("Opcion: ");

        opcion = ingresarNumero("menu");

        return opcion;
    }
}
