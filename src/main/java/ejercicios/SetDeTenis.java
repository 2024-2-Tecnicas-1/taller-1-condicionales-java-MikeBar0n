package ejercicios;

import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class SetDeTenis {
    public static String evaluar(int numVictoriasA, int numVictoriasB) {
        String resultado = "";
        if (numVictoriasA <=7 && numVictoriasB <= 7){
            if (numVictoriasA - numVictoriasB >= 2){
                if (numVictoriasA >=5 && numVictoriasB >=5){
                    resultado = "Ganó A";
                }else if(numVictoriasA >=5 && numVictoriasB <5){
                    resultado = "Inválido";
                }
            }else{
                resultado = "Aún no termina";
            }
            if (numVictoriasB - numVictoriasA >= 2){
                if (numVictoriasB >=5 && numVictoriasA >=5){
                    resultado = "Ganó B";
                }else if(numVictoriasB >=5 && numVictoriasA <5){
                    resultado = "Inválido";
                }
            }else{
                resultado = "Aún no termina";
            }
        }else{
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
