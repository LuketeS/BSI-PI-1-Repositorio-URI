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
        double A,B,MEDIA;
        A = leitura.nextDouble();
        B = leitura.nextDouble();
        MEDIA = (A*3.5 + B*7.5)/11;
        System.out.println("MEDIA = "+ String.format("%.5f",MEDIA));
        
    }
 
}