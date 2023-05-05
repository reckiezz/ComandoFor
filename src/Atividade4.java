import java.util.Scanner;
public class Atividade4 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        
        int n1 = leiaValores("1");

        int n2 = leiaValores("2");
            
        int fatorialNum1 = calculaFatorial(n1);
       
        int fatorialNum2 = calculaFatorial(n2);  

        apresentaFatorial(fatorialNum1, fatorialNum2);

        
    }

    static int calculaFatorial(int n){
        int fatorialN = 1;
        for(int i = 1; i <= n; i++){
            fatorialN = fatorialN * i;

        }
        return fatorialN;
    }

    static void apresentaFatorial(int fatorialNum1, int fatorialNum2){
        System.out.print("\nO fatorial do número 1 é igual a: "+fatorialNum1+", e o fatorial do número 2 é: "+fatorialNum2+", e a soma deles é igual a: "+(fatorialNum1 + fatorialNum2)+"\n\n");
    }

    static int leiaValores(String texto){
        System.out.print("\nDigite o número "+texto+": ");
        return Integer.parseInt(input.nextLine());
    }
    
}
