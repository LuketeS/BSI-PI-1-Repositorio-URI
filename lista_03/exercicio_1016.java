import java.io.IOException;
 

import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner leitura = new Scanner(System.in);
        int distancia = leitura.nextInt();
        int minutos = ( 60 * distancia)/30;
        System.out.println(minutos+" minutos");
       
    }
 
}