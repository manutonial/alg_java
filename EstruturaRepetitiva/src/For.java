import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        //usar for quando sabe quantas vezes vai repetir
        
        //Fazer um programa que le um valor inteiro N e depois N numeros inteiros. Ao final
        //mostra a soma dos N numeros lidos
        
        System.out.print("Digite o valor N: ");
        int n = leitor.nextInt();
        int soma = 0;
        
        for( int i = 0; i < n; i++ ) {
            int x = leitor.nextInt();
            soma = soma + x;
          
        }
        
        System.out.println("Soma: " + soma);
        leitor.close();
    }
    
}
