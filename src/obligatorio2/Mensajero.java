//Kevin Rinaldi (240179)
//Ex compañero Andres Martinez (184534)
package obligatorio2;

public class Mensajero {
    private String nombre;
    private String direccion;
    private String ci;
   
    public Mensajero() {
        this.setNombre("nombre");
        this.setDireccion("direccion");
        this.setCi("12345678");
    }
    public Mensajero(String unNombre, String unaDireccion, String unaCi) {
        this.setNombre(unNombre);
        this.setDireccion(unaDireccion);
        this.setCi(unaCi);
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

    public String getCi() {
        return ci;
    }

    public void setCi(String unaCi) {
        ci = unaCi.charAt(0) + "." + 
             unaCi.substring(1, 4) + "." + 
             unaCi.substring(4, 7) + "-" + 
             unaCi.charAt(7);
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getNombre()
                + "\n" + "Direccion: " + this.getDireccion()
                + "\n" + "CI: " + this.getCi();
    }
}
