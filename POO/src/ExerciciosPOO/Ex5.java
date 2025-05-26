package ExerciciosPOO;

import java.util.Scanner;
import entitiesExercicios.Produto;

public class Ex5 {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        Produto prod = new Produto();
        
        prod.nome = leitor.nextLine();
        prod.preco = leitor.nextDouble();
        prod.quantidade = leitor.nextInt();
        
        System.out.println(prod.exibirDados());
        
        System.out.println("Adicione ao estoque: ");
        int quantidadeAdicionar = leitor.nextInt();
        prod.adicionarProdutos(quantidadeAdicionar);
        
        System.out.println("\n---  Produto Atualizado ---");
        System.out.println(prod.exibirDados());
        
        System.out.println("Retire do estoque: ");
        int quantidadeRetirar = leitor.nextInt();
        prod.removerProdutos(quantidadeRetirar);
        
        System.out.println("\n---  Produto Atualizado ---");
        System.out.println(prod.exibirDados());
    }   
}
