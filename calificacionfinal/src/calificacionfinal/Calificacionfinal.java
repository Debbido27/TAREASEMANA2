
package Calificacionfinal;
import java.util.Scanner;

public class Calificacionfinal {



    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        //INGRESO DE DATOS DE CALIFICACIONES DE PARCIALES, EXAMENES  TRABAJO FINAL
        System.out.print("Ingrese la primera calificacion parcial: ");
        double parcial1 = entrada.nextDouble();
        
        System.out.print("Ingrese la segunda calificacion parcial: ");
        double parcial2 = entrada.nextDouble();
        
        System.out.print("Ingrese la tercera calificacion parcial: ");
        double parcial3 = entrada.nextDouble();
        
        System.out.print("Ingrese la calificacion del examen final: ");
        double examenFinal = entrada.nextDouble();
        
        System.out.print("Ingrese la calificacion del trabajo final: ");
        double trabajoFinal = entrada.nextDouble();
        
        //Se saca el promedio de los parciales, y luego el promedio total, y se muestra en consola
        double promedioParciales = (parcial1 + parcial2 + parcial3) / 3;
        
        double calificacionFinal = (promedioParciales * 0.55) + (examenFinal * 0.30) + (trabajoFinal * 0.15);
        
        System.out.println("La calificación final es: " + calificacionFinal);
    }
}
