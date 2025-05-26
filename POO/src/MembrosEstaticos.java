import java.util.Scanner;
import util.Calculator;

public class MembrosEstaticos {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Enter radius: ");
        double radius = leitor.nextDouble();    
        
        double c = Calculator.circumference(radius);
        double v = Calculator.volume(radius);
        
        System.out.printf("Circunference: %.2f \n", c);
        System.out.printf("Volume: %.2f \n", v);
        System.out.printf("PI value: %.2f \n", Calculator.PI);
              
        
    }
    
}
