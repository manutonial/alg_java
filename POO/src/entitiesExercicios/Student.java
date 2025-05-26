package entitiesExercicios;

public class Student {
    
    public String name;
    public double n1;
    public double n2;
    public double n3;
    public double max = 100.00;
    public double pass = 0.60;
    
    public double finalGrade() {
    
        return n1 + n2 + n3;
        
    }
    
    public String passOrFail() {
    
        double grade = finalGrade();
        double passingGrade = max * pass;
        
        if (grade >= passingGrade){
            return "PASS";
        }
        else{
        
            double pointsNeeded = passingGrade - grade;
            return String.format("FAILED \n MISSING %.2f", pointsNeeded);
        }
    }   
}
    

