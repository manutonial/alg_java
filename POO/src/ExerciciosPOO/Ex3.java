package ExerciciosPOO;

import java.util.Scanner;
import entitiesExercicios.Student;

public class Ex3 {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        Student student = new Student();
        
        student.name = leitor.nextLine();
        student.n1 = leitor.nextDouble();
        student.n2 = leitor.nextDouble();
        student.n3 = leitor.nextDouble();
        
        System.out.printf("FINAL GRADE = %.2f\n", student.finalGrade());
        System.out.println(student.passOrFail());
        
        leitor.close();
        
    }  
}
