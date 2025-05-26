package entitiesExercicios;

public class Produto {
    
    public String nome;
    public double preco;
    public int quantidade;
    
    public double valorTotalEmEstoque() {
    
        return preco * quantidade;
    }
    
    public void adicionarProdutos(int quantidade) {
    
        this.quantidade += quantidade;
    }
    
    public void removerProdutos(int quantidade) {
    
        this.quantidade -= quantidade;
    }
    
    public String exibirDados() {
    
        return "Nome: " + nome + "\n Preco: " + preco +
                "\n Quantidade: " + quantidade + 
                "\n Valor total: " + valorTotalEmEstoque();
    }
    
    
    
}
