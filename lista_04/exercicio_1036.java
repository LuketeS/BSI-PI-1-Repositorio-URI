import java.io.IOException;
 
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner leitura = new Scanner(System.in);
        double A = leitura.nextDouble();
        double B = leitura.nextDouble();
        double C = leitura.nextDouble();
        double delta,raiz1,raiz2,raizdelta ;
        delta =((B*B)-1*(4*A*C));
        raizdelta = Math.sqrt(delta);        
        if (delta<0){
            System.out.println("Impossivel calcular"); 
        }
        if(2*A ==0){
            System.out.println("Impossivel calcular"); 
        
        }
        else {
            raiz1 = (-1*B)+raizdelta/(2*A);
            raiz2 = (-1*B)-raizdelta/(2*A);
            System.out.println("R1 = "+String.format("%.5f",raiz1));
            System.out.println("R2 = "+String.format("%.5f",raiz2));
            
        }
    }
 
}