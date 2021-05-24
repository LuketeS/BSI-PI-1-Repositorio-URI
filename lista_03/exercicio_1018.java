import java.io.IOException;
 
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner leitura = new Scanner(System.in);
        int grana = leitura.nextInt();
        System.out.println(grana);
        System.out.println(grana/100+" nota(s) de R$ 100,00");
        grana = grana%100;
        System.out.println(grana/50+" nota(s) de R$ 50,00");
        grana = grana%50;
        System.out.println(grana/20+" nota(s) de R$ 20,00");
        grana = grana%20;
        System.out.println(grana/10+" nota(s) de R$ 10,00");
        grana = grana%10;
        System.out.println(grana/5+" nota(s) de R$ 5,00");
        grana = grana%5;
        System.out.println(grana/2+" nota(s) de R$ 2,00");
        grana = grana%2;
        System.out.println(grana/1+" nota(s) de R$ 1,00");
        
        
 
 
 
 
    }
 
}