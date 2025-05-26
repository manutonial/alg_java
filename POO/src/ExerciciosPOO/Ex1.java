package ExerciciosPOO;

import java.util.Scanner;
import entitiesExercicios.Retangulo;

public class Ex1 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        //usando o objeto
        Retangulo rect = new Retangulo();
        
        System.out.println("Enter rectangle width and height: ");
        rect.width = leitor.nextDouble();
        rect.height = leitor.nextDouble();
        
        System.out.printf("AREA: %.2f \n ", rect.area() );
        System.out.printf("PERIMETER: %.2f \n ", rect.perimeter() );
        System.out.printf("DIAGONAL: %.2f \n ", rect.diagonal() );
    }
    
}
