package clasificacionequipos;

import java.util.Scanner;

public class CLASIFICACIONEQUIPOS {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // Corregimos la sintaxis de nextInt
        System.out.println("Ingrese los partidos ganados por el equipo: ");
        int ganados = entrada.nextInt();
        
        System.out.println("Ingrese los partidos empatados por el equipo: ");
        int empatados = entrada.nextInt();
        
        System.out.println("Ingrese los partidos perdidos por el equipo: ");
        int perdidos = entrada.nextInt();
        
        // Calculamos el puntaje total
        int tablafinal = (ganados * 3) + (empatados * 1) + (perdidos * 0);
        
        // Mostramos el resultado final
        System.out.println("El resultado del equipo es: " + tablafinal);
    }
}
