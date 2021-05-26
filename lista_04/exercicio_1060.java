import java.io.IOException;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner leitura = new Scanner(System.in);
        int quantidade = 0;
        for (int i=0; i < 6; i++) {
        	double valor = leitura.nextDouble();
        	if (valor > 0) quantidade++;
        }
        System.out.println(quantidade + " valores positivos");
    
 
    }
 
}