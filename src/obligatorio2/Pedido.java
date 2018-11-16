//Kevin Rinaldi (240179)
//Ex compañero Andres Martinez (184534)
package obligatorio2;

public class Pedido {

    private Plato plato;
    private Cliente cliente;
    private int hora;
    private int dia;
    private Mensajero mensajero;

    //Constructor de Pedido
    public Pedido() {
        this.setPlato(new Plato());
        this.setCliente(new Cliente());
        this.setDia(1);
        this.setHora(8);
        this.setMensajero(new Mensajero());
    }
    public Pedido(Plato unPlato, Cliente unCliente, int unDia, int unaHora, Mensajero unMensajero) {
        this.setPlato(unPlato);
        this.setCliente(unCliente);
        this.setDia(unDia);
        this.setHora(unaHora);
        this.setMensajero(unMensajero);
    }

    public Plato getPlato() {
        return plato;
    }

    public void setPlato(Plato unPlato) {
        plato = unPlato;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente unCliente) {
        cliente = unCliente;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int unaHora) {
        hora = unaHora;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int unDia) {
        dia = unDia;
    }
    
    public Mensajero getMensajero() {
        return mensajero;
    }
    
    public void setMensajero(Mensajero unMensajero) {
        mensajero = unMensajero;
    } 

    @Override
    public String toString() {
        return "**** Cliente ****" + "\n"
                + this.getCliente() + "\n"
                + "**** Plato ****" + "\n"
                + this.getPlato() + "\n"
                + "**** Pedido ****" + "\n"
                + "Dia del pedido: " + this.getDia() + "\n"
                + "Hora del pedido: " + this.getHora() + "\n"
                + "**** Mensajero ****" + "\n"
                + this.getMensajero();
    }

}
