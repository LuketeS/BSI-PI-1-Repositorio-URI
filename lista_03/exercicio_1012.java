import java.io.IOException;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
import java.util.Scanner;
public class Main {
     public static void main(String[] args) throws IOException {
        Scanner leitura = new Scanner(System.in);
        double A = leitura.nextDouble();
        double B = leitura.nextDouble();
        double C = leitura.nextDouble();
        double TRIANGULO = (A*C)/2;
        double pi = 3.14159;
        double CIRCULO = pi*(C*C);
        double TRAPEZIO = ((A+B)*C)/2;
        double QUADRADO = B*B;
        double RETANGULO = A*B;
        System.out.println("TRIANGULO: "+ String.format("%.3f",TRIANGULO));
        System.out.println("CIRCULO: "+ String.format("%.3f",CIRCULO));
        System.out.println("TRAPEZIO: "+ String.format("%.3f",TRAPEZIO));
        System.out.println("QUADRADO: "+ String.format("%.3f",QUADRADO));
        System.out.println("RETANGULO: "+ String.format("%.3f",RETANGULO));
        }
 
}