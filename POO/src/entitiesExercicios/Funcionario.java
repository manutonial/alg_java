package entitiesExercicios;

public class Funcionario {
    
    public String nome;
    public String cargo;
    public double salario;
    
    public String exibirDados(){
    
        return "Nome: " + nome + "\nCargo: " + cargo + " \nSalario: " + salario;
    }               
    
}
