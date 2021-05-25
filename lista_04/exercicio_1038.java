import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner leitura = new Scanner(System.in);
        int codigo_item = leitura.nextInt();
        int qtd_item = leitura.nextInt();
        double total = 0;
        double valor = 0;
        if(codigo_item == 1){
        valor = 4.00*qtd_item;
        
        }
        if(codigo_item == 2){
        valor = 4.50*qtd_item;
        
        }
        if(codigo_item == 3){
        valor = 5.00*qtd_item;
        
        }
        if(codigo_item == 4){
        valor = 2.00*qtd_item;
        
        }
        if(codigo_item == 5){
        valor = 1.50*qtd_item;
        
        }
        
        System.out.println("Total: R$ "+String.format("%.2f",valor));
 
    }
 
}