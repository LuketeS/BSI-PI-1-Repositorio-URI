import java.io.IOException;
 
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner leitura = new Scanner(System.in);
        int segundos = leitura.nextInt();
        int total_horas = segundos/3600;
        segundos = segundos%3600;
        int total_min = segundos/60;
        segundos = segundos%60;
        System.out.println(total_horas+":"+total_min+":"+segundos);
 
 
    }
 
}