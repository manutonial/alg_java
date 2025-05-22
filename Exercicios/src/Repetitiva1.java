import java.util.Scanner;

public class Repetitiva1 {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner (System.in);
        
        int senha = leitor.nextInt();

        while(senha != 2002)
        {
            System.out.println("Senha incorreta");
            senha = leitor.nextInt();
        }
        
        //quando sair do laco
        System.out.println("Acesso permitido");
        
        leitor.close();
    }
    
}
