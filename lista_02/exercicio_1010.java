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
        int cod1,num_pecas1,cod2,num_pecas2;
        double valor_peca1,valor_peca2,VALOR_A_PAGAR;
        cod1 = leitura.nextInt();
        num_pecas1 = leitura.nextInt();
        valor_peca1 = leitura.nextDouble();
        cod2 = leitura.nextInt();
        num_pecas2 = leitura.nextInt();
        valor_peca2 = leitura.nextDouble();
        VALOR_A_PAGAR = num_pecas1*valor_peca1 + num_pecas2*valor_peca2;
        System.out.println("VALOR A PAGAR: R$ "+ String.format("%.2f",VALOR_A_PAGAR));
    }
 
}