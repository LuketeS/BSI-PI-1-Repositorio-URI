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
        double VOLUME, R, pi;
        pi = 3.14159;
        R = leitura.nextDouble();
        VOLUME = (4/3.0) * pi * R * R * R; 
        System.out.println("VOLUME = "+ String.format("%.3f",VOLUME));
        
    }
 
}