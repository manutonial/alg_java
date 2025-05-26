package ExerciciosPOO;

import java.util.Scanner;
import entitiesExercicios.Employee;

public class Ex2 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        Employee employee = new Employee();
        
        System.out.print("Name: ");
        employee.name = leitor.nextLine();
        
        System.out.print("Gross salary: ");
        employee.grossSalary = leitor.nextDouble();
        
        System.out.print("Tax: ");
        employee.tax = leitor.nextDouble();
        
        System.out.printf("Employee: %s, $ %.2f \n", employee.name, employee.netSalary());
        
        System.out.print("Which percentage to increase salary? ");
        employee.percentage = leitor.nextDouble();
        
        double newSalary = employee.netSalary() + employee.increaseSalary();
        
        System.out.printf("Updated data: %s, $ %.2f \n", employee.name, newSalary);
        
        leitor.close();
    }
    
}
