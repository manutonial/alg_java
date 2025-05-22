import java.util.Scanner;

public class RepetitivaFor2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        //numero de iteracoes
        int n = leitor.nextInt();
        
        //variaveis in or out
        int in = 0;
        int out = 0;
            
        for(int i = 0; i < n; i++) {
        
            int numero = leitor.nextInt();
            
            if(numero >= 10 && numero <= 20){
                
                in++;
            }
            else{
                
                out++;
            }
        }
        
        System.out.println(in + " in");
        System.out.println(out + " out");
       
    }
    
}
