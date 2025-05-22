import java.util.Scanner;

public class Condicionais2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um numero inteiro: ");
        int x = leitor.nextInt();
        
        if (x % 2 == 0){
            System.out.println("PAR");
        }
        else{
            System.out.println("IMPAR");
        }
    }
    
}
