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
        int A,B,PROD;
        A = leitura.nextInt();
        B = leitura.nextInt();
        PROD = A * B;
        System.out.println("PROD = "+PROD);
        
    }
 
}