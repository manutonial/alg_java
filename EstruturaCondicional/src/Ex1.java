import java.util.Scanner;

public class Ex1 
{
    public static void main(String[] args) 
    {
        Scanner leitor = new Scanner(System.in);
        
        double valor = 50;
        
        System.out.println("Quantos minutos a pessoa consumiu");
        int minutos = leitor.nextInt();
        
        if (minutos > 100)
        {
            //usando atribuicao cumulativa para resumir o codigo (+= ao inves de valor = valor + ... )
            valor +=(minutos - 100) * 2;
            
        }
            System.out.printf("O valor da conta foi: R$ %.2f \n", valor);
    }
    
}
