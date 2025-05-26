package ExerciciosPOO;

import java.util.Scanner;
import entitiesEstaticos.CurrencyConverter;

public class ExEstaticos {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("What is the dollar price? " + CurrencyConverter.DOLAR);
        
        System.out.print("How many dollars will be bought? ");
        CurrencyConverter.buyD = leitor.nextDouble();
        
        System.out.println("Amount to be paid in reais = " + CurrencyConverter.conversion());
        
    }
    
}
