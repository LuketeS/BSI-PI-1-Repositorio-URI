import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner leitura = new Scanner(System.in);
        int A = leitura.nextInt();
        int B = leitura.nextInt();
        int C = leitura.nextInt();
        int D = leitura.nextInt();
        if(B>C && D>A && C+D>A+B && C>0 && D>0 && A%2 ==0){
            System.out.println("Valores aceitos");
        }
        else{
         System.out.println("Valores nao aceitos"); 
        } 
    }
}