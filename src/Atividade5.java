import java.util.Scanner;
public class Atividade5 {
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args){

        System.out.print("\nDigite o número de elementos n: ");
        int n = Integer.parseInt(input.nextLine());

        System.out.print("\nDigite o número de elementos agrupados p: ");
        int p = Integer.parseInt(input.nextLine());

        int fatorialN = calculaFatorial(n);

        int fatorialP = calculaFatorial(p);

        int fatorialNmenosP = calculaFatorial(n-p);

        int combinaçoes = calculaCombinaçoes(fatorialNmenosP, fatorialN, fatorialP);

        apresentaResultado(combinaçoes);


    }

    static int calculaFatorial(int num){
        int fatorialN = 1;
        for(int i = 1; i <= num; i++){
            fatorialN = fatorialN * i;

        }
        return fatorialN;
    }

    static int calculaCombinaçoes(int fatorialNP, int fatorialN, int fatorialP){
        return  fatorialN / (fatorialP * fatorialNP);

    }

    static void apresentaResultado(int resultado){
        System.out.print("\nO número de combinações é: "+resultado+"\n\n");
    }
}
