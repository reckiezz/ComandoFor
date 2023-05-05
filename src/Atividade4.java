import java.util.Scanner;
public class Atividade4 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){

        int fatorialN1 = 1, fatorialN2 = 1;

        System.out.print("\nDigite um número 1: ");
        int n1 = Integer.parseInt(input.nextLine());

        System.out.print("\nDigite um número 2: ");
        int n2 = Integer.parseInt(input.nextLine());

        
        for(int i = 1; i <= n1; i++){
            fatorialN1 = fatorialN1 * i;

        }

        for(int i = 1; i <= n2; i++){
            fatorialN2 = fatorialN2 * i;
        }

        System.out.print("\nO fatorial do número 1 é igual a: "+fatorialN1+", e o fatorial do número 2 é: "+fatorialN2+", e a soma deles é igual a: "+(fatorialN1 + fatorialN2)+"\n\n");

        
    }
    
}
