import java.util.Scanner;

public class BitaBit {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int mask = 0b100000;
        int n = leitor.nextInt();
        
        if ( (n & mask) != 0  ){
            System.out.println("6 bit eh true!");
        }
        else{
            System.out.println("6 bit eh falso");
        }
    }
    
}
