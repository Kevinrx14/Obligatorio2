//Kevin Rinaldi (240179)
//Ex compañero Andres Martinez (184534)
package obligatorio2;
import java.util.*;

public class Prueba {
    public static void main(String args[]) {
        Auxiliar auxiliar = new Auxiliar();
        Rotiseria rotiseria = new Rotiseria();
        String nombreCliente;
        String direccionCliente;
        String nombreMensajero;
        String direccionMensajero;
        String ciMensajero;
        String descripcionPlato;
        int opcionElegida;
        int barrioCliente;
        int costoPlato;
        int caloriaPlato;
        int tipoPlato;                    
        boolean verificadorMenuPrincipal = true;
        boolean aptoCeliacoPlato;
        
        //Un Do para siempre estar en el menu hasta seleccionar la opcion salir
        do {
            opcionElegida = auxiliar.menu();
            //Menu principal
            switch (opcionElegida) {
                //Registrar de cliente
                case 1:
                    System.out.println("Ingrese nombre del cliente");
                    nombreCliente = auxiliar.ingresarTexto();
                    System.out.println("Ingrese direccion del cliente");
                    direccionCliente = auxiliar.ingresarTexto();
                    System.out.println("Ingrese barrio del cliente (1 - 10)");
                    barrioCliente = auxiliar.ingresarNumero("barrio");
                    
                    rotiseria.getListaCliente().add(new Cliente (nombreCliente, direccionCliente, barrioCliente));                    
                    break;
                  
                //Registrar de mensajero
                case 2:
                    System.out.println("Ingrese nombre del mensajero");
                    nombreMensajero = auxiliar.ingresarTexto();
                    System.out.println("Ingrese direccion del mensajero");
                    direccionMensajero = auxiliar.ingresarTexto();
                    System.out.println("Ingrese ci del mensajero");
                    ciMensajero = auxiliar.ingresarTexto();
                    
                    rotiseria.getListaMensajero().add(new Mensajero (nombreMensajero, direccionMensajero, ciMensajero));
                    break;

                //Registrar de plato
                case 3:
                    System.out.println("Ingrese plato");
                    descripcionPlato = auxiliar.ingresarTexto();
                    System.out.println("Ingrese el costo del plato");
                    costoPlato = auxiliar.ingresarNumero("costo");
                    System.out.println("Ingrese las calorias del plato (1 - 900)");
                    caloriaPlato = auxiliar.ingresarNumero("caloria");
                    System.out.println("Ingrese el tipo (1 - 8)");
                    tipoPlato = auxiliar.ingresarNumero("tipo");
                    System.out.println("Es apto para celiacos (Si/No)");
                    aptoCeliacoPlato = auxiliar.ingresarBoolean();
                    
                    rotiseria.getListaPlato().add(new Plato (descripcionPlato, costoPlato, caloriaPlato, tipoPlato, aptoCeliacoPlato));
                    break;

                //Registrar de pedido
                case 4:
                   
                    break;

                //Consulta pedidos
                case 5:
                    
                    break;
                    
                //Menu de platos
                case 6:
                    
                    break;
                    
                //Planilla de envio
                case 7:
                    
                    break;
                    
                //Consulta de tipo
                case 8:
                    
                    break;
                     
                //Terminar
                case 9:
                    verificadorMenuPrincipal = false;
                    break;
                    
                //Si la opcion no esta entre 1 y 9 muestra este mensaje de error
                default:
                    System.out.println("Opcion ingresada no es valida");
                    System.out.println("\n");
                    break;
            }
        } while (verificadorMenuPrincipal == true);
    }
}
