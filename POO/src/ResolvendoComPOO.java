import java.util.Scanner;

//chamando a classe
import entities.Triangle;

public class ResolvendoComPOO {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
         
        //instanciando o objeto
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();
        
        System.out.println("Enter the measures of Triangle x: ");
        
        //armazenando dados no objeto x
        x.a = leitor.nextDouble();
        x.b = leitor.nextDouble();
        x.c = leitor.nextDouble();
        
        System.out.println("Enter the measures of Triangle y: ");
        
        //armazenando inputs no objeto y
        y.a = leitor.nextDouble();
        y.b = leitor.nextDouble();
        y.c = leitor.nextDouble();
        
        //area do triangulo x
        double areaX = x.area();
        
        //area do triangulo y
        double areaY = y.area();
        
        System.out.printf("Triangle X area: %.4f\n", areaX);
        System.out.printf("Triangle Y area: %.4f\n", areaY);
        
        if (areaX > areaY){
            System.out.println("Larger area: X");
        }
        else if(areaX == areaY){
            System.out.println("Equal area");
        }
        else{
            System.out.println("Larger area: Y");
        }
                
       leitor.close();
           
    }
    
}
