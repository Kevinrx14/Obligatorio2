//Kevin Rinaldi (240179)
//Ex compañero Andres Martinez (184534)
package obligatorio2;
import java.util.*;

public class Rotiseria {
    Auxiliar auxiliar = new Auxiliar();
    private ArrayList<Plato> listaPlatos = new ArrayList<>();
    private ArrayList<Cliente> listaClientes = new ArrayList<>();
    private ArrayList<Pedido> listaPedidos = new ArrayList<>();
    private ArrayList<Mensajero> listaMensajeros = new ArrayList<>();
    
    public ArrayList<Plato> getListaPlatos() {
        return listaPlatos;
    }
    
    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }
    
    public ArrayList<Pedido> getListaPedidos() {
        return listaPedidos;
    }
    
    public ArrayList<Mensajero> getListaMensajeros() {
        return listaMensajeros;
    }
    
    public int ingresarOpcionLista(int contadorLista) {
        int opcion;
        boolean verificador = true;
        
        do {
            opcion = auxiliar.ingresarNumero("lista");
            if (opcion <= contadorLista && opcion > 0) {
                verificador = false;
                opcion--;
            } else {
                System.out.print("Opcion no valida, por favor ingrese una nueva opcion: ");
            }
        } while(verificador == true);
        
        return opcion;
    }
    
    public int seleccionarOpcionLista(ArrayList unaLista, String tipoLista) {
        int opcion;
        int contadorLista;

        contadorLista = unaLista.size();
        mostrarContenido(unaLista, tipoLista);
        switch (tipoLista) {
            case "Clientes":
                System.out.print("Seleccione al cliente: ");
                break;
                
            case "Menu":
                System.out.print("Seleccione el plato: ");
                break;
                
            case "Mensajeros":
                System.out.print("Seleccione al mensajero: ");
                break;
        }
        
        opcion = ingresarOpcionLista(contadorLista);
            
        return opcion;
    }
    
    public void mostrarContenido(ArrayList unaLista, String tipoLista) {
        int contadorLista;
        int i;
        
        if (!unaLista.isEmpty()) {
            contadorLista = unaLista.size();
            System.out.println("******** " + tipoLista + " ********");
            for(i = 0; i < contadorLista; i++){
                System.out.println("Opcion " + (i+1) + ":");
                System.out.println(unaLista.get(i));
                System.out.println("\n");
            }
            System.out.println("**************************");
        } else {
            System.out.println("No se encontraron registros");
        }
    }
    
}
