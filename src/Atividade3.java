import java.util.Scanner;
public class Atividade3{

    static Scanner input = new Scanner(System.in);
    public static void main (String[] args){
        int maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;

        System.out.print("\nDigite a quantidade de números de um conjunto: ");
        int n = Integer.parseInt(input.nextLine());

        for(int i = 1; i <= n; i++){
            System.out.print("\nDigite o "+i+"º número: ");
            int numero = Integer.parseInt(input.nextLine());
            
               if(numero > maior){
                maior = numero;

             } else if (numero < menor){
                menor = numero;

             }
        }

        apresentaValores(maior, menor);
                
    }


    static void apresentaValores(int maiorNum, int menorNum){
        System.out.print("\nO maior número é: "+maiorNum+
                         "\nE o menor número é: "+menorNum+"\n\n");

    }

   
}