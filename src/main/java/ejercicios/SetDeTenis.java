package ejercicios;

import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class SetDeTenis {
    public static String evaluar(int numVictoriasA, int numVictoriasB) {
        String resultado = "";
        
        if (numVictoriasA > 7 || numVictoriasB > 7) {
            resultado = "Inválido";
        }else if (numVictoriasA == 7 && numVictoriasB == 6) {
            resultado = "Ganó A";
        }else if (numVictoriasB == 7 && numVictoriasA == 6) {
            resultado = "Ganó B";
        }else if (numVictoriasA >= 6 && numVictoriasA - numVictoriasB >= 2) {
            resultado = "Ganó A";
        } else if (numVictoriasB >= 6 && numVictoriasB - numVictoriasA >= 2) {
            resultado = "Ganó B";
        }else if (numVictoriasA < 6 && numVictoriasB < 6) {
            resultado = "Aún no termina";
        }else {
            resultado = "Inválido";
        }
  
        return resultado;
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Los juegos ganador por A:");
        int numVictoriasA = lector.nextInt();
        System.out.print("Los juegos ganador por B:");
        int numVictoriasB = lector.nextInt();
        
        String respuesta = evaluar(numVictoriasA, numVictoriasB);
        System.out.println(respuesta);
    }
}
