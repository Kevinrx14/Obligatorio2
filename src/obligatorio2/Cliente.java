//Kevin Rinaldi (240179)
//Ex compañero Andres Martinez (184534)
package obligatorio2;

public class Cliente {

    private String nombre;
    private String direccion;
    private int barrio;

    //Constructor de cliente
    public Cliente() {
        this.setNombre(nombre);
        this.setDireccion(direccion);
        this.setBarrio(barrio);
    }
    public Cliente(String unNombre, String unaDireccion, int unBarrio) {
        this.setNombre(unNombre);
        this.setDireccion(unaDireccion);
        this.setBarrio(unBarrio);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String unNombre) {
        nombre = unNombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String unaDireccion) {
        direccion = unaDireccion;
    }

    public int getBarrio() {
        return barrio;
    }

    public void setBarrio(int unBarrio) {
        barrio = unBarrio;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getNombre()
                + "\n" + "Direccion: " + this.getDireccion()
                + "\n" + "Numero de barrio: " + this.getBarrio();
    }
}
