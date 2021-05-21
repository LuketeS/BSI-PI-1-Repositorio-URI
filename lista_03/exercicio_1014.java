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
        int X = leitura.nextInt();
        double Y = leitura.nextDouble();
        double consumo_medio = X/Y;
        System.out.println(String.format("%.3f",consumo_medio)+" km/l");
 
    }
 
}