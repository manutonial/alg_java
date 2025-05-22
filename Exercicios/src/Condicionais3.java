import java.util.Scanner;

public class Condicionais3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite o primeiro valor: ");
        int x = leitor.nextInt();
        
        System.out.print("Digite o segundo valor: ");
        int y = leitor.nextInt();
        
        if( x % y == 0 || y % x == 0){
            System.out.println("Sao multiplos");
        }
        else{
            System.out.println("Nao sao multiplos");
        }
        
    }
    
}
