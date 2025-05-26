package ExerciciosPOO;

import java.util.Scanner;
import entitiesExercicios.Funcionario;
public class Ex4 {
    
    public static void main(String[] args) {
           
        Scanner leitor = new Scanner(System.in);
        
        Funcionario func = new Funcionario();
        
        func.nome = leitor.nextLine();
        func.cargo = leitor.nextLine();
        func.salario = leitor.nextDouble();
        
        System.out.println(func.exibirDados());
        
    }
    
}
