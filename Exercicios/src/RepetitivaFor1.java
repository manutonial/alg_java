import java.util.Scanner;

public class RepetitivaFor1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int x = leitor.nextInt();
        
        for(int i = 1; i < x; i++) {
            
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }   
    }
}
