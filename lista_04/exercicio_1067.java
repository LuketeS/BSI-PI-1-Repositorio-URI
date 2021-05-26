import java.io.IOException;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner leitura = new Scanner(System.in);
        int valor = leitura.nextInt();
               
        for (int i = 1; i <= valor;  i = i + 2){
        System.out.println(i);
        }
        
 
    }
 
}