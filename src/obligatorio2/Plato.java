//Kevin Rinaldi (240179)
//Ex compañero Andres Martinez (184534)
package obligatorio2;

public class Plato implements Comparable<Plato>{    
    private String codigo;
    private String descripcion = "";
    private int costo;
    private int caloria;
    private int tipo;
    private boolean aptoCeliaco;
    
    //Constructor de Plato
    public Plato(){
        this.setDescripcion("descripcion");
        this.setCodigo("descripcion");
        this.setCosto(1);
        this.setCaloria(1);
        this.setTipo(1);   
        this.setAptoCeliaco(false);
    }
    public Plato(String unaDescripcion, int unCosto, int unaCaloria, int unTipo, boolean apto){
        this.setDescripcion(unaDescripcion);
        this.setCodigo(unaDescripcion);
        this.setCosto(unCosto);
        this.setCaloria(unaCaloria);
        this.setTipo(unTipo);   
        this.setAptoCeliaco(apto);
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public void setCodigo(String unPlato) {
        int x;
        codigo = "";
        int largo = unPlato.length();
        unPlato = unPlato.toUpperCase();
        
        for (x = 0; x < largo && codigo.length() < 4; x++) {
            if (
                    unPlato.charAt(x) != 'A' 
                    && unPlato.charAt(x) != 'E'
                    && unPlato.charAt(x) != 'I'
                    && unPlato.charAt(x) != 'O'
                    && unPlato.charAt(x) != 'U'
                    && unPlato.charAt(x) != ' '
                ) { 
                codigo = codigo + unPlato.charAt(x);
            }
        }
        while (codigo.length() < 4) {
            codigo = codigo + '-';   
        }        
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public void setDescripcion(String unaDescripcion) {
        descripcion = unaDescripcion;
    }
    
    public int getCosto() {
        return costo;
    }
    
    public void setCosto(int unCosto) {
        costo = unCosto;
    }
    
    public int getCaloria() {
        return caloria;
    }
    
    public void setCaloria(int unaCaloria) {
        caloria = unaCaloria;
    }
    
    public int getTipo() {
        return tipo;
    }
    
    public void setTipo(int unTipo) {
        tipo = unTipo;
    }
    
    public String getAptoCeliaco() {
        String esApto;
        if (aptoCeliaco == true){
            esApto = "Si";
        } else {
            esApto = "No";
        }
        return esApto;
    }
    
    public void setAptoCeliaco(boolean esApto) {
        aptoCeliaco = esApto;
    }
    
    @Override
    public String toString(){
        return "Descripcion: " + this.getDescripcion() 
                + "\n" + "Codigo: " + this.getCodigo() 
                + "\n" + "Costo: " + this.getCosto() 
                + "\n" + "Calorias: " + this.getCaloria() 
                + "\n" + "Tipo: " + this.getTipo() 
                + "\n" + "Apto para celiacos: " + this.getAptoCeliaco();
    }
    
    @Override
    public int compareTo(Plato unPlato) {
        return this.getCodigo().compareTo(unPlato.getCodigo());
    }

}