
package calculadorabp;
    
    import java.util.Scanner;

public class CALCULADORABP {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese la base del rectangulo: ");
        double base = entrada.nextDouble();
        
        System.out.print("Ingrese la altura del rectangulo: ");
        double altura = entrada.nextDouble();
        
        double perimetro = 2 * (base + altura);
        double area = base * altura;
        
        System.out.println("El perimetro del rectangulo es: " + perimetro);
        System.out.println("El área del rectangulo es: " + area);
    }
}

    
