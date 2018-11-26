//Kevin Rinaldi (240179)
//Ex compañero Andres Martinez (184534)
package obligatorio2;
import java.util.*;

public class Prueba {
    public static void main(String args[]) {
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
        
        rotiseria.getListaClientes().add(new Cliente ("John", "Cuareim 123", 5));
        rotiseria.getListaClientes().add(new Cliente ("Jane", "Mercedez 45", 5));
        rotiseria.getListaClientes().add(new Cliente ("Juan", "Chana 201", 1));
        rotiseria.getListaClientes().add(new Cliente ("Kevin", "Bv España 2400", 10));
        rotiseria.getListaClientes().add(new Cliente ("Maria", "Bv Artigas 1423", 7));
        rotiseria.getListaMensajeros().add(new Mensajero ("Pablo", "Guana 542", "23456789"));
        rotiseria.getListaMensajeros().add(new Mensajero ("Javier", "Arenal Grande 72", "73251432"));
        rotiseria.getListaPlatos().add(new Plato ("Sopa", 50, 200, 5, true));
        rotiseria.getListaPlatos().add(new Plato ("HAMBURGUESA", 150, 874, 8, false));
        rotiseria.getListaPlatos().add(new Plato ("papas fritas", 74, 498, 1, true));
        rotiseria.getListaPedidos().add(new Pedido(rotiseria.getListaPlatos().get(1),
                            rotiseria.getListaClientes().get(2),
                            7,
                            12,
                            rotiseria.getListaMensajeros().get(0))
                    );
        rotiseria.getListaPedidos().add(new Pedido(rotiseria.getListaPlatos().get(0),
                            rotiseria.getListaClientes().get(0),
                            11,
                            8,
                            rotiseria.getListaMensajeros().get(0))
                    );
        rotiseria.getListaPedidos().add(new Pedido(rotiseria.getListaPlatos().get(1),
                            rotiseria.getListaClientes().get(1),
                            11,                            
                            12,
                            rotiseria.getListaMensajeros().get(1))
                    );
        rotiseria.getListaPedidos().add(new Pedido(rotiseria.getListaPlatos().get(2),
                            rotiseria.getListaClientes().get(2),
                            7,
                            18,
                            rotiseria.getListaMensajeros().get(0))
                    );
        rotiseria.getListaPedidos().add(new Pedido(rotiseria.getListaPlatos().get(1),
                            rotiseria.getListaClientes().get(3),
                            11,
                            15,
                            rotiseria.getListaMensajeros().get(1))
                    );
        rotiseria.getListaPedidos().add(new Pedido(rotiseria.getListaPlatos().get(1),
                            rotiseria.getListaClientes().get(4),
                            31,                            
                            14,
                            rotiseria.getListaMensajeros().get(0))
                    );
        rotiseria.getListaPedidos().add(new Pedido(rotiseria.getListaPlatos().get(2),
                            rotiseria.getListaClientes().get(4),
                            31,                            
                            14,
                            rotiseria.getListaMensajeros().get(0))
                    );
        rotiseria.getListaPedidos().add(new Pedido(rotiseria.getListaPlatos().get(2),
                            rotiseria.getListaClientes().get(4),
                            31,                            
                            14,
                            rotiseria.getListaMensajeros().get(0))
                    );
        rotiseria.getListaPedidos().add(new Pedido(rotiseria.getListaPlatos().get(2),
                            rotiseria.getListaClientes().get(4),
                            31,                            
                            14,
                            rotiseria.getListaMensajeros().get(0))
                    );
        rotiseria.getListaPedidos().add(new Pedido(rotiseria.getListaPlatos().get(2),
                            rotiseria.getListaClientes().get(4),
                            31,                            
                            14,
                            rotiseria.getListaMensajeros().get(0))
                    );
        rotiseria.getListaPedidos().add(new Pedido(rotiseria.getListaPlatos().get(1),
                            rotiseria.getListaClientes().get(4),
                            31,                            
                            14,
                            rotiseria.getListaMensajeros().get(0))
                    );
        
        //Un Do para siempre estar en el menu hasta seleccionar la opcion salir
        do {
            opcionElegida = menu();
            //Menu principal
            switch (opcionElegida) {
                //Registrar de cliente
                case 1: {
                    System.out.println("Ingrese nombre del cliente");
                    cliente.setNombre(ingresarTexto());
                    System.out.println("Ingrese direccion del cliente");
                    cliente.setDireccion(ingresarTexto());
                    System.out.println("Ingrese barrio del cliente (1 - 10)");
                    cliente.setBarrio(ingresarNumero("barrio"));
                    
                    rotiseria.setCliente(cliente);
                    System.out.println("Cliente ingresado" + "\n");
                    break; }
                  
                //Registrar de mensajero
                case 2:
                    System.out.println("Ingrese nombre del mensajero");
                    mensajero.setNombre(ingresarTexto());
                    System.out.println("Ingrese direccion del mensajero");
                    mensajero.setDireccion(ingresarTexto());
                    System.out.println("Ingrese ci del mensajero");
                    mensajero.setCi(ingresarTexto());
                    
                    rotiseria.setMensajero(mensajero);
                    System.out.println("Mensajero ingresado" + "\n");
                    break;

                //Registrar de plato
                case 3:
                    System.out.println("Ingrese plato");
                    plato.setDescripcion(ingresarTexto());
                    System.out.println("Ingrese el costo del plato");
                    plato.setCosto(ingresarNumero("costo"));
                    System.out.println("Ingrese las calorias del plato (1 - 900)");
                    plato.setCaloria(ingresarNumero("caloria"));
                    System.out.println("Ingrese el tipo (1 - 8)");
                    plato.setTipo(ingresarNumero("tipo"));
                    System.out.println("Es apto para celiacos (Si/No)");
                    plato.setAptoCeliaco(ingresarBoolean());
                    
                    rotiseria.setPlato(plato);
                    System.out.println("Plato ingresado" + "\n");
                    break;

                //Registrar de pedido
                case 4:
                    if(!rotiseria.getListaClientes().isEmpty()) {
                        if(!rotiseria.getListaMensajeros().isEmpty()) {
                            if(!rotiseria.getListaPlatos().isEmpty()) {
                                indicePlato = seleccionarOpcionLista(rotiseria.getListaPlatos(), "Menu");
                                pedido.setPlato(rotiseria.getListaPlatos().get(indicePlato));
                                indiceCliente = seleccionarOpcionLista(rotiseria.getListaClientes(), "Clientes");
                                pedido.setCliente(rotiseria.getListaClientes().get(indiceCliente));
                                System.out.println("Ingresar dia del pedido (1 - 31)");
                                pedido.setDia(ingresarNumero("dia"));  
                                System.out.println("Ingresar hora de la entrega (8 - 18)");
                                pedido.setHora(ingresarNumero("hora"));
                                indiceMensajero = seleccionarOpcionLista(rotiseria.getListaMensajeros(), "Mensajeros");
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
                //Se ingresa un día y indica cuál/cuáles fueron los platos más pedidos en ese día.
                case 5:
                    mostrarPlatoMasPedido(rotiseria);
                    break;
                    
                //Menu de platos
                //Muestra la lista de platos ordenada por código
                case 6:
                    mostrarContenido(rotiseria.getListaPlatos(), "Menu");
                    break;
                    
                //Planilla de envio
                //Se elige el mensajero y se indica un día. Se emite su lista de pedidos de ese día, ordenada por número de barrio
                case 7:
                    mostrarPlanillaEnvio(rotiseria);
                    break;
                    
                //Consulta de tipo
                //Cuál/es es el tipo de plato que tiene más pedidos.
                case 8:
                    consultaTipo(rotiseria.getListaPedidos());
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
    
    //Metodo para ingresar texto
    public static String ingresarTexto() {
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
    public static int ingresarNumero(String aIngresar) {
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
    public static boolean ingresarBoolean() {
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
    public static int menu() {
        int opcion;

        System.out.println("Digite la opcion que desea");
        System.out.println("-----------------------------");
        System.out.println("1) Registrar cliente");
        System.out.println("2) Registrar mensajero");
        System.out.println("3) Registrar plato");
        System.out.println("4) Registrar pedido");
        System.out.println("5) Consulta de pedidos");
        System.out.println("6) Menu");
        System.out.println("7) Planilla de envio");
        System.out.println("8) Consulta de tipo");
        System.out.println("9) Salir");
        System.out.println("-----------------------------");
        System.out.print("Opcion: ");

        opcion = ingresarNumero("menu");

        return opcion;
    }
    
    public static int ingresarOpcionLista(int contadorLista) {
        int opcion;
        boolean verificador = true;
        
        do {
            opcion = ingresarNumero("lista");
            if (opcion <= contadorLista && opcion > 0) {
                verificador = false;
                opcion--;
            } else {
                System.out.print("Opcion no valida, por favor ingrese una nueva opcion: ");
            }
        } while(verificador == true);
        
        return opcion;
    }
    
    public static int seleccionarOpcionLista(ArrayList unaLista, String tipoLista) {
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
    
    public static void mostrarContenido(ArrayList unaLista, String tipoLista) {
        int contadorLista;
        int i;
        
        if (!unaLista.isEmpty()) {
            if (tipoLista.equals("Menu")) {
                ordenarLista(unaLista);
            }
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
    
    public static void mostrarPlanillaEnvio(Rotiseria rotiseria) {
        ArrayList<Pedido> pedidosDelDia = new ArrayList<>();
        int i;

        if(!rotiseria.getListaMensajeros().isEmpty()) {
            if(!rotiseria.getListaPedidos().isEmpty()) {
                int indiceMensajero = seleccionarOpcionLista(rotiseria.getListaMensajeros(), "Mensajeros");
                System.out.println("Ingrese dia de los pedidos");
                int diaPedido = ingresarNumero("dia");
                String ciMensajero = rotiseria.getListaMensajeros().get(indiceMensajero).getCi();
        
                for(i = 0; i < rotiseria.getListaPedidos().size(); i++) {
                    Pedido pedido = rotiseria.getListaPedidos().get(i);
                    if(
                        pedido.getMensajero().getCi().equals(ciMensajero) && 
                        pedido.getDia() == diaPedido
                            ) {
                        pedidosDelDia.add(pedido);
                    }
                }
        
                ordenarLista(pedidosDelDia);
            
                mostrarContenido(pedidosDelDia, "Pedidos");
            } else {
                System.out.println("No hay pedidos registrados");
            }
        } else {
            System.out.println("No hay mensajeros registrados");
        }
    }
    
    public static void mostrarPlatoMasPedido(Rotiseria rotiseria) {
        ArrayList<Pedido> pedidosPorDia = new ArrayList<>();
        ArrayList<Integer> indicesMasPedidos = new ArrayList<>();
        int i;
        int masPedido = 0;
        int sumaDePedidos =0;    
        
        if(!rotiseria.getListaPedidos().isEmpty()) {
            System.out.println("Ingrese el dia de un pedido");
            int diaPedido = ingresarNumero("dia");
            
            //Lleno array temporal con todos los pedidos del dia seleccionado
            for(i = 0; i < rotiseria.getListaPedidos().size(); i++) {
                if(rotiseria.getListaPedidos().get(i).getDia() == diaPedido) {
                    pedidosPorDia.add(rotiseria.getListaPedidos().get(i));
                }
            }

            //Recorro todos los platos
            for (i = 0; i < rotiseria.getListaPlatos().size(); i++) {
                //Recorro los platos que se pidieron el dia ingresado
                for (int x = 0; x < pedidosPorDia.size(); x++) {
                    //Sumo todos los pedidos del plato en i
                    if (rotiseria.getListaPlatos().get(i).getCodigo().equals(pedidosPorDia.get(x).getPlato().getCodigo())) {
                        sumaDePedidos++;
                    }
                }
                if (sumaDePedidos > masPedido) {
                    indicesMasPedidos.clear();
                    indicesMasPedidos.add(i);
                    masPedido = sumaDePedidos;
                } else {
                    if (sumaDePedidos == masPedido) {
                        if(masPedido > 0) {
                            indicesMasPedidos.add(i);
                        }
                    }
                }
                sumaDePedidos = 0;
            }

            if(!indicesMasPedidos.isEmpty()) {
                System.out.println("El plato/s mas pedido/s el dia " + diaPedido + " es/son:");
                for (i = 0; i < indicesMasPedidos.size(); i++) {
                    System.out.println(rotiseria.getListaPlatos().get(indicesMasPedidos.get(i)) + "\n");
                }
            } else {
                System.out.println("No hay pedidos el dia " + diaPedido);
            }
        } else {
            System.out.println("No se han realizado pedidos");
        }
    }
    
    public static void consultaTipo(ArrayList<Pedido> unaLista){
        int indexTipo;
        int i;
        int[] tipo = new int[8];
        int mayor = 0;
        int largoLista;
        
        if(!unaLista.isEmpty()) {
            ordenarLista(unaLista);
            largoLista = unaLista.size();
            //Llenar el array tipo
            for(i = 0; i < largoLista; i++){
                indexTipo = (unaLista.get(i).getPlato().getTipo())-1;
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
    
    public static ArrayList ordenarLista(ArrayList unaLista) {
        Collections.sort(unaLista);
        return unaLista;
    }
}