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
        int NUMBER, num_horas;
        float val_hora,SALARY;
        NUMBER = leitura.nextInt();
        num_horas = leitura.nextInt();
        val_hora = leitura.nextFloat();
        SALARY = (num_horas * val_hora);
        System.out.println("NUMBER = "+NUMBER);
        System.out.println("SALARY = U$ "+ String.format("%.2f",SALARY));
        
      
      
      
 
    }
 
}