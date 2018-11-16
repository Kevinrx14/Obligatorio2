//Kevin Rinaldi (240179)
//Ex compañero Andres Martinez (184534)
package obligatorio2;
import java.util.*;

public class Auxiliar {
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
    
}
