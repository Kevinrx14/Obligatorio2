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
    
    public void platosMasPedidos(int unDia) {
        ArrayList<Pedido> pedidosPorDia = new ArrayList<>();
        ArrayList<Integer> indicesMasPedidos = new ArrayList<>();
        int i;
        int masPedido = 0;
        int sumaDePedidos =0;      
        
        //Lleno array temporal con todos los pedidos del dia seleccionado
        for(i = 0; i < this.getListaPedidos().size(); i++) {
            if(this.getListaPedidos().get(i).getDia() == unDia) {
                pedidosPorDia.add(new Pedido(this.getListaPedidos().get(i).getPlato(),
                            this.getListaPedidos().get(i).getCliente(),
                            this.getListaPedidos().get(i).getDia(),
                            this.getListaPedidos().get(i).getHora(),
                            this.getListaPedidos().get(i).getMensajero())
                    );
            }
        }
        
        //Recorro todos los platos
        for (i = 0; i < this.getListaPlatos().size(); i++) {
            //Recorro los platos que se pidieron el dia ingresado
            for (int x = 0; x < pedidosPorDia.size(); x++) {
                //Sumo todos los pedidos del plato en i
                if (this.getListaPlatos().get(i).getCodigo().equals(pedidosPorDia.get(x).getPlato().getCodigo())) {
                    sumaDePedidos++;
                }
            }
            if (sumaDePedidos > masPedido) {
                indicesMasPedidos.clear();
                indicesMasPedidos.add(i);
                masPedido = sumaDePedidos;
            } else {
                if (sumaDePedidos == masPedido) {
                    indicesMasPedidos.add(i);
                }
            }
            sumaDePedidos = 0;
        }

        System.out.println("El plato/s mas pedido/s el dia " + unDia + " es/son:");
        for (i = 0; i < indicesMasPedidos.size(); i++) {
            System.out.println(this.getListaPlatos().get(indicesMasPedidos.get(i)) + "\n");
        }
    }
    
    public ArrayList ordenarLista(ArrayList unaLista) {
        Collections.sort(unaLista);
        return unaLista;
    }
    
    public void planillaEnvios(int indiceMensajero, int unDia) {
        ArrayList<Pedido> pedidosDelDia = new ArrayList<>();
        int i;
        String ciMensajero = this.getListaMensajeros().get(indiceMensajero).getCi();
        
        if(!this.getListaPedidos().isEmpty()) {
            for(i = 0; i < this.getListaPedidos().size(); i++) {
                if(this.getListaPedidos().get(i).getMensajero().getCi().equals(ciMensajero) && this.getListaPedidos().get(i).getDia() == unDia) {
                    pedidosDelDia.add(new Pedido(this.getListaPedidos().get(i).getPlato(),
                                this.getListaPedidos().get(i).getCliente(),
                                this.getListaPedidos().get(i).getDia(),
                                this.getListaPedidos().get(i).getHora(),
                                this.getListaPedidos().get(i).getMensajero())
                        );
                }
            }

            this.ordenarLista(pedidosDelDia);
            this.mostrarContenido(pedidosDelDia, "Pedidos");
        } else {
            System.out.println("No hay pedidos registrados");
        }
    }
    
    public void consultaTipo(){
        int indexTipo;
        int i;
        int[] tipo = new int[8];
        int mayor = 0;
        int largoLista;
        
        if(!this.getListaPedidos().isEmpty()) {
            largoLista = this.getListaPedidos().size();
            //Llenar el array tipo
            for(i = 0; i < largoLista; i++){
                indexTipo = (this.getListaPedidos().get(i).getPlato().getTipo())-1;
                tipo[indexTipo] += 1;
            }
            //Guardar el mas pedido
            for(i = 0; i < 8; i++) {
                if (tipo[i] > mayor) {
                    mayor = tipo[i];
                }
            }
            //Mostrar el tipo/s mas pedido/s
            for(i = 0; i < 8; i++) {
                if (tipo[i] == mayor) {
                    System.out.println("El tipo de plato " + (i+1) + " fue el mas pedido");
                }
            }
        } else {
            System.out.println("No hay pedidos registrados");
        }
    }
}
