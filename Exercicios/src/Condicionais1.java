import java.util.Scanner;

public class Condicionais1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite um numero real: ");
        int x = leitor.nextInt();
        
        if (x < 0){
            System.out.println("NEGATIVO");
        }
        else if (x == 0) {
            System.out.println("NAO NEGATIVO");
        }
        else{
            System.out.println("NAO NEGATIVO");
        }
        
        leitor.close();
        
    }
    
}
