import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner leitura = new Scanner(System.in);
        String palavra1 = leitura.next();
        String palavra2 = leitura.next();
        String palavra3 = leitura.next();        
        if (palavra1.equals("vertebrado")  && palavra2.equals("ave") && palavra3.equals("carnivoro")) {
            System.out.print("aguia");
        }
        if (palavra1.equals("vertebrado") && palavra2.equals("ave") && palavra3.equals("onivoro")) {
            System.out.print("pomba");
        }
        if (palavra1.equals("vertebrado") && palavra2.equals("mamifero") && palavra3.equals("onivoro")) {
            System.out.print("homem");
        }
        if (palavra1.equals("vertebrado") && palavra2.equals("mamifero") && palavra3.equals("herbivoro")) {
            System.out.print("vaca");
        }  
        if (palavra1.equals("invertebrado") && palavra2.equals("inseto") && palavra3.equals("hematofago")) {
            System.out.print("pulga");
        }
        if (palavra1.equals("invertebrado") && palavra2.equals("inseto") && palavra3.equals("herbivoro")) {
            System.out.print("lagarta");
        }
        if (palavra1.equals("invertebrado") && palavra2.equals("anelideo") && palavra3.equals("hematofago")) {
            System.out.print("sanguessuga");
        }
        if (palavra1.equals("invertebrado") && palavra2.equals("anelideo") && palavra3.equals("onivoro")) {
            System.out.print("minhoca");        
        }
    }
 
}