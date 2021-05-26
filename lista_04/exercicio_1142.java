import java.io.IOException;
import java.util.Scanner; 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
         Scanner leitura = new Scanner(System.in);
        int N = leitura.nextInt();
        int quantidade = 1;
	    for (int i = 0; i < N; i++) {
        for (int Num_linha = 0; Num_linha < 3; Num_linha++) {
            System.out.print(quantidade + " ");
            quantidade++;
	}
	    System.out.println("PUM");
        quantidade++;       
        }
 
    }
 
}