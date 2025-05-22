import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        // do while entra no laco pelo menos 1 vez
        // primeiro executa comandos, e depois condicao
        
        // Fazer um programa pra ler uma temperatura em Celsius e mostrar o equivalente
        // em Fahrenheit. Pergunte se o usuario quer repetir ou nao.
        char resposta;
        do{
            System.out.print("Em celsius: ");
            double tempCelsius = leitor.nextDouble();
            double tempFahrenheit =  ( ( 9 * tempCelsius) / 5 ) + 32;
            
            System.out.print("Em fahrenheit: " + tempFahrenheit); 
            System.out.println(" \nDeseja repetir (s/n)?");
            resposta = leitor.next().charAt(0);
        } while (resposta != 'n');
                  
        
        
    }
    
}
