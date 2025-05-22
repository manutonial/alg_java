
public class PontoFlutuante 
{
    public static void main(String[] args) {
        
        double x = 10.35784;
        String nome = "Maria";
        int idade = 31;
        double renda =4000.0;
        System.out.println(x);
        
        // controlar casas decimais (printf)
        // %n quebra linha
        System.out.printf("%.2f \n", x);
        
        // com 4 casas 
        System.out.printf("%.4f ", x);
        
        // concatenar na mesma linhha
        System.out.printf("%s tem %d anos e ganha %.2f reais \n", nome, idade, renda);
       
    }
    
}
