import java.util.Scanner;

public class Repetitiva2 {
   
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Coordenada x: ");
        int x = leitor.nextInt();
        
        System.out.print("Coordenada y: ");
        int y = leitor.nextInt();
        
        while (x != 0 && y != 0){
        
            
            if(x > 0 && y > 0){
                System.out.println("Primeiro quadrante!");
            }
            else if (x > 0 && y < 0){
                System.out.println("Quarto quadrante!");
            }
            else if(x < 0 && y < 0){
                System.out.println("Terceiro quadrante!");
            }
            else if (x < 0 && y > 0){
                System.out.println("Segundo quadrante!");
            }
            
            
            x = leitor.nextInt();
            y = leitor.nextInt();
        }
        leitor.close();
    }   
        
    
}
