import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        //usa quando nao sabe quantas vezes vai repetir
        
        //Fazer um programa que le numeros inteiros ate o numero 0 ser lido
        //Ao final realizar a soma dos numeros lidos
        
        int x = leitor.nextInt();
        int soma = 0;
        
        while (x != 0) {
            soma += x;
            x = leitor.nextInt();
        }
        
        System.out.println("Soma : " + soma);
        
        Scanner close;
    }
    
}
