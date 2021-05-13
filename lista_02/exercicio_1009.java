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
        String nome;
        double salario_fixo,comissao,TOTAL,total_vendas;
        nome = leitura.next();
        salario_fixo = leitura.nextDouble();
        total_vendas = leitura.nextDouble();
        comissao = total_vendas * 0.15;
        TOTAL = salario_fixo + comissao;
        System.out.println("TOTAL = R$ "+ String.format("%.2f",TOTAL));
        
    }
 
}