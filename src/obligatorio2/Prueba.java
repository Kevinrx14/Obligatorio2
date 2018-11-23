//Kevin Rinaldi (240179)
//Ex compañero Andres Martinez (184534)
package obligatorio2;

public class Prueba {
    public static void main(String args[]) {
        Auxiliar auxiliar = new Auxiliar();
        Rotiseria rotiseria = new Rotiseria();
        Mensajero mensajero = new Mensajero();
        Pedido pedido = new Pedido();
        Cliente cliente = new Cliente();
        Plato plato = new Plato();
        int opcionElegida;
        int indicePlato;
        int indiceCliente;
        int indiceMensajero;
        boolean verificadorMenuPrincipal = true;
        
        rotiseria.getListaClientes().add(new Cliente ("Kevin", "Bv Espana", 5));
        rotiseria.getListaClientes().add(new Cliente ("Juan", "Bv Artigas", 2));
        rotiseria.getListaClientes().add(new Cliente ("Pedro", "Chana", 1));
        rotiseria.getListaMensajeros().add(new Mensajero ("John Doe", "Chana", "12345678"));
        rotiseria.getListaMensajeros().add(new Mensajero ("Jane Doe", "Bv Espana", "23456789"));
        rotiseria.getListaPlatos().add(new Plato ("Hamburguesa", 250, 800, 6, false));
        rotiseria.getListaPlatos().add(new Plato ("Sopa", 100, 200, 2, true));
        rotiseria.getListaPlatos().add(new Plato ("Ensalada", 50, 100, 3, true));
        rotiseria.getListaPedidos().add(new Pedido(rotiseria.getListaPlatos().get(0),
                            rotiseria.getListaClientes().get(0),
                            11,
                            12,
                            rotiseria.getListaMensajeros().get(0))
                    );
        rotiseria.getListaPedidos().add(new Pedido(rotiseria.getListaPlatos().get(1),
                            rotiseria.getListaClientes().get(1),
                            11,
                            18,
                            rotiseria.getListaMensajeros().get(0))
                    );
        rotiseria.getListaPedidos().add(new Pedido(rotiseria.getListaPlatos().get(2),
                            rotiseria.getListaClientes().get(2),
                            11,                            
                            14,
                            rotiseria.getListaMensajeros().get(0))
                    );
        
        //Un Do para siempre estar en el menu hasta seleccionar la opcion salir
        do {
            opcionElegida = auxiliar.menu();
            //Menu principal
            switch (opcionElegida) {
                //Registrar de cliente
                case 1: {
                    System.out.println("Ingrese nombre del cliente");
                    cliente.setNombre(auxiliar.ingresarTexto());
                    System.out.println("Ingrese direccion del cliente");
                    cliente.setDireccion(auxiliar.ingresarTexto());
                    System.out.println("Ingrese barrio del cliente (1 - 10)");
                    cliente.setBarrio(auxiliar.ingresarNumero("barrio"));
                    
                    rotiseria.setCliente(cliente);
                    System.out.println("Cliente ingresado" + "\n");
                    break; }
                  
                //Registrar de mensajero
                case 2:
                    System.out.println("Ingrese nombre del mensajero");
                    mensajero.setNombre(auxiliar.ingresarTexto());
                    System.out.println("Ingrese direccion del mensajero");
                    mensajero.setDireccion(auxiliar.ingresarTexto());
                    System.out.println("Ingrese ci del mensajero");
                    mensajero.setCi(auxiliar.ingresarTexto());
                    
                    rotiseria.setMensajero(mensajero);
                    System.out.println("Mensajero ingresado" + "\n");
                    break;

                //Registrar de plato
                case 3:
                    System.out.println("Ingrese plato");
                    plato.setDescripcion(auxiliar.ingresarTexto());
                    System.out.println("Ingrese el costo del plato");
                    plato.setCosto(auxiliar.ingresarNumero("costo"));
                    System.out.println("Ingrese las calorias del plato (1 - 900)");
                    plato.setCaloria(auxiliar.ingresarNumero("caloria"));
                    System.out.println("Ingrese el tipo (1 - 8)");
                    plato.setTipo(auxiliar.ingresarNumero("tipo"));
                    System.out.println("Es apto para celiacos (Si/No)");
                    plato.setAptoCeliaco(auxiliar.ingresarBoolean());
                    
                    rotiseria.setPlato(plato);
                    System.out.println("Plato ingresado" + "\n");
                    break;

                //Registrar de pedido
                case 4:
                    if(!rotiseria.getListaClientes().isEmpty()) {
                        if(!rotiseria.getListaMensajeros().isEmpty()) {
                            if(!rotiseria.getListaPlatos().isEmpty()) {
                                indicePlato = auxiliar.seleccionarOpcionLista(rotiseria.getListaPlatos(), "Menu");
                                pedido.setPlato(rotiseria.getListaPlatos().get(indicePlato));
                                indiceCliente = auxiliar.seleccionarOpcionLista(rotiseria.getListaClientes(), "Clientes");
                                pedido.setCliente(rotiseria.getListaClientes().get(indiceCliente));
                                System.out.println("Ingresar dia del pedido (1 - 31)");
                                pedido.setDia(auxiliar.ingresarNumero("dia"));  
                                System.out.println("Ingresar hora de la entrega (8 - 18)");
                                pedido.setHora(auxiliar.ingresarNumero("hora"));
                                indiceMensajero = auxiliar.seleccionarOpcionLista(rotiseria.getListaMensajeros(), "Mensajeros");
                                pedido.setMensajero(rotiseria.getListaMensajeros().get(indiceMensajero));

                                rotiseria.setPedido(pedido);
                                System.out.println("Pedido realizado con exito" + "\n");
                            } else {
                                System.out.println("No hay platos registrados" + "\n");
                            }
                        } else {
                            System.out.println("No hay mensajeros registrados" + "\n");
                        }
                    } else {
                        System.out.println("No hay clientes registrados" + "\n");
                    }
                    break;

                //Consulta pedidos
                case 5:
                    auxiliar.mostrarPlatoMasPedido();
                    break;
                    
                //Menu de platos
                case 6:
                    auxiliar.ordenarLista(rotiseria.getListaPlatos());
                    auxiliar.mostrarContenido(rotiseria.getListaPlatos(), "Menu");
                    break;
                    
                //Planilla de envio
                case 7:
                    auxiliar.mostrarPlanillaEnvio();
                    break;
                    
                //Consulta de tipo
                case 8:
                    auxiliar.consultaTipo();
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
