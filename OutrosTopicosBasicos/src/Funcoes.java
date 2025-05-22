import java.util.Scanner;

public class Funcoes {
    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);
       
        System.out.println("Enter three numbers: ");
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int c = leitor.nextInt();
        
        int higher = max(a, b, c);
        
        showResult(higher);
        
        leitor.close();
    }
    
    public static int max(int x, int y, int z){
        int aux; //essa variavel so existe nessa funcao
        if (x > y && x > z){
            aux = x;
        }
        else if (y > z && y > x){
            aux = y;
        }
        else{
            aux = z;
        }
        return aux;
    }
    
    public static void showResult(int value){
        System.out.println("Higher = " + value);
    }
    
}
