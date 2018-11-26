//Kevin Rinaldi (240179)
//Ex compañero Andres Martinez (184534)
package obligatorio2;
import java.util.*;

public class Rotiseria {
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
    
    public void setMensajero(Mensajero unMensajero) {
        this.getListaMensajeros().add(unMensajero);
    }
    
    public void setPlato(Plato unPlato) {
        this.getListaPlatos().add(unPlato);
    }
    
    public void setCliente(Cliente unCliente) {
        this.getListaClientes().add(unCliente);
    }
    
    public void setPedido(Pedido unPedido) {
        this.getListaPedidos().add(unPedido);
    }
}
