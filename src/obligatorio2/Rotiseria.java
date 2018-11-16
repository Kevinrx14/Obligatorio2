//Kevin Rinaldi (240179)
//Ex compañero Andres Martinez (184534)
package obligatorio2;
import java.util.*;

public class Rotiseria {
    Auxiliar auxiliar = new Auxiliar();
    private ArrayList<Plato> listaPlato = new ArrayList<>();
    private ArrayList<Cliente> listaCliente = new ArrayList<>();
    private ArrayList<Pedido> listaPedido = new ArrayList<>();
    private ArrayList<Mensajero> listaMensajero = new ArrayList<>();
    
    public ArrayList<Plato> getListaPlato() {
        return listaPlato;
    }
    
    public ArrayList<Cliente> getListaCliente() {
        return listaCliente;
    }
    
    public ArrayList<Pedido> getListaPedido() {
        return listaPedido;
    }
    
    public ArrayList<Mensajero> getListaMensajero() {
        return listaMensajero;
    }
    
}
