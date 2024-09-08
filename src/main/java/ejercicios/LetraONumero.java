
package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class LetraONumero {
    public static String evaluar(char caracter) {
        String tipoCaracter = "";
        int caracterCode = (int)caracter;
        
        if (caracterCode >= 65 && caracterCode <=90){
            tipoCaracter = "Es letra mayúscula";
        }else if(caracterCode >= 97 && caracterCode <= 122){
            tipoCaracter = "Es letra minúscula";
        }else if (caracterCode >= 48 && caracterCode <= 157){
            tipoCaracter = "Es número";
        }else{
            tipoCaracter = "No es letra ni número";
        }
        return tipoCaracter;
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Caracter:");
        char caracter = lector.next().charAt(0);
        
        String respuesta = evaluar(caracter);
        System.out.println(respuesta);
    }
}
