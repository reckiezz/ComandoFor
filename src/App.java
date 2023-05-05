import java.util.Scanner;
public class App {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        System.out.print("\nDigite um número inteiro: ");
        int n = Integer.parseInt(input.nextLine());

        apresentaBomDia(n);
    }

    static void apresentaBomDia(int num){
        for (int i = 1; i <= num ; i++ ) {
            System.out.print("\nBom dia "+i+"\n\n");
            
        }
    }
}
