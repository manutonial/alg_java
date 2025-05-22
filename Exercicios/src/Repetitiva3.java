import java.util.Scanner;

public class Repetitiva3 {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o codigo: ");
        int codigo = leitor.nextInt();
        
        int alcool = leitor.nextInt();
        int gasolina = leitor.nextInt();
        int diesel = leitor.nextInt();
        
        while (codigo != 4){
            
            if (codigo == 1) {
            
                alcool = alcool + 1;
                
            }
            else if (codigo == 2) {
            
                gasolina = gasolina + 1;
            }
            else if (codigo == 3){
            
                diesel = diesel + 1;
            }
            
            codigo = leitor.nextInt();
        }  
        
        System.out.println("MUITO OBRIGADO!");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        
        leitor.close();
    }   
        
}
