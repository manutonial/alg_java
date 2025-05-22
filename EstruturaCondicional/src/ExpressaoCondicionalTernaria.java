import java.util.Scanner;

public class ExpressaoCondicionalTernaria 
{
    public static void main(String[] args) 
    {
        Scanner leitor = new Scanner(System.in);
        
        // (condicao) ? true : false
        //ex: (2 > 4) ? 50 : 80 --> 80
        
        double preco = 34.5;
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.5;
        
        System.out.println("O desconto eh: " + desconto);
       
    }
    
}
