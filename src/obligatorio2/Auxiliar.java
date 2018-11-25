//Kevin Rinaldi (240179)
//Ex compañero Andres Martinez (184534)
package obligatorio2;
import java.util.*;

public class Auxiliar {
    Rotiseria rotiseria = new Rotiseria();
    
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
    
    public int ingresarOpcionLista(int contadorLista) {
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
    
    public void mostrarPlanillaEnvio() {
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
    
    public void mostrarPlatoMasPedido() {
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
                        indicesMasPedidos.add(i);
                    }
                }
                sumaDePedidos = 0;
            }

            System.out.println("El plato/s mas pedido/s el dia " + diaPedido + " es/son:");
            for (i = 0; i < indicesMasPedidos.size(); i++) {
                System.out.println(rotiseria.getListaPlatos().get(indicesMasPedidos.get(i)));
            }

        } else {
            System.out.println("No se han realizado pedidos");
        }
    }
    
    public void consultaTipo(ArrayList<Pedido> unaLista){
        int indexTipo;
        int i;
        int[] tipo = new int[8];
        int mayor = 0;
        int largoLista;
        
        if(!rotiseria.getListaPedidos().isEmpty()) {
            largoLista = rotiseria.getListaPedidos().size();
            //Llenar el array tipo
            for(i = 0; i < largoLista; i++){
                indexTipo = (rotiseria.getListaPedidos().get(i).getPlato().getTipo())-1;
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
    
    public ArrayList ordenarLista(ArrayList unaLista) {
        Collections.sort(unaLista);
        return unaLista;
    }
}
