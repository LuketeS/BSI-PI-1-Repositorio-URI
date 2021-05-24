import java.io.IOException;
import java.util.Scanner;
public class Main {
     public static void main(String[] args) throws IOException {
        Scanner leitura = new Scanner(System.in);
        int total_dias = leitura.nextInt();
        int total_anos = total_dias/365;
        total_dias=total_dias%365;
        int total_meses = total_dias/30;
        total_dias=total_dias%30;
        System.out.println(total_anos+" ano(s)");
        System.out.println(total_meses+" mes(es)");
        System.out.println(total_dias+" dia(s)");
 
    }
 
}