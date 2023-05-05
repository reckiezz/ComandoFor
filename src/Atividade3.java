import java.util.Scanner;
public class Atividade3{

    static Scanner input = new Scanner(System.in);
    public static void main (String[] args){

        System.out.print("\nDigite a quantidade de números de um conjunto: ");
        int n = Integer.parseInt(input.nextLine());

        for(int i = 1; i <= n; i++){
            System.out.print("\nDigite o "+i+"º número: ");
            int numero = Integer.parseInt(input.nextLine());
        }
        
    }

   
}