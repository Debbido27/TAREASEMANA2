
package TEMPERATURA;



import java.util.Scanner;

//Entradas, en este caso los farenheit, salida son los celsius, es igual a 64


//En genero la variable se llamara char, que voy a esperar a 1 bit
//desglose va el programa
//Prueba de escritorio, se hace el proceso a mano
public class TEMPERATURA {

    public static void main(String[] args) {
        
   
        Scanner entrada= new Scanner(System.in);
        
        System.out.print("Ingrese la primera temperatura en Fahrenheit: ");
        double Fare = entrada.nextDouble();
        
        double Cels =  (Fare - 32) * (5 / 9);
        System.out.println("El resultado en Celsius es: " + Cels);
        
    }
}

        
    
