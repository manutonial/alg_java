import java.util.Scanner;

public class ResolvendoSemPOO {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        double xA, xB, xC, yA, yB, yC;
        
        System.out.println("Enter them easures of triangle X: ");
        xA = leitor.nextDouble();
        xB = leitor.nextDouble();
        xC = leitor.nextDouble();
        
        System.out.println("Enter them easures of triangle Y: ");
        yA = leitor.nextDouble();
        yB = leitor.nextDouble();
        yC = leitor.nextDouble();
        
        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p* (p - xA) * (p - xB) * (p - xC));
                
        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p* (p - yA) * (p - yB) * (p - yC));
        
        System.out.printf("Triangle X area: %.4f \n", areaX);
        System.out.printf("Triangle Y area: %.4f \n", areaY);
        
        if (areaX > areaY){
            System.out.println("Larger area: X");
        }
        else{
            System.out.println("Larger area: Y");
        }
                
       leitor.close();
    }
    
}
