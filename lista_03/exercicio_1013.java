import java.io.IOException;
 
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner leitura = new Scanner(System.in);
        int a = leitura.nextInt();
        int b = leitura.nextInt();
        int c = leitura.nextInt(); 
        int MaiorAB=(a+b+Math.abs(a-b))/2;
        int MaiorABC=(MaiorAB+c+Math.abs(MaiorAB-c))/2;
        System.out.println(MaiorABC+" eh o maior");
    }
 
}