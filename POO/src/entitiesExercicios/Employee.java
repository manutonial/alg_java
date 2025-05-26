package entitiesExercicios;

public class Employee {
    
    public String  name;
    public double grossSalary;
    public double tax;
    public double percentage;
    
    public double netSalary(){
    
        return grossSalary - tax;
    }
    
    public double increaseSalary(){

        return (grossSalary / 100) * percentage;
    }    
    
    
}
