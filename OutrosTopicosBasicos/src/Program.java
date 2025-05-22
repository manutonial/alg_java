
public class Program {
    public static void main(String[] args) {
       
        String original = "abcde FGHIJ ABC abc DEFG  ";
        
        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(1);
        String s05 = original.substring(1, 10);
        String s06 = original.replace('a', 'x');
        String s07 = original.replace ("abc", "xy");
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");
        
        System.out.println("Original: - " + original + "-");
        System.out.println("toLowerCase: - " + s01 + "-");
        System.out.println("toUpperCase: - " + s02 + "-");
        System.out.println("trim: - " + s03 + "-");  //trim elimina os espacos em branco
        System.out.println("substring(1): - " + s04 + "-");
        System.out.println("substring(1, 10): - " + s05 + "-");
        System.out.println("replace: - " + s06 + "-"); // troca 'a' por 'x'
        System.out.println("repalace2: - " + s07 + "-");
        System.out.println("Index of 'bc' " + i);
        System.out.println("Last Index of 'bc' " + j);
    }
    
}
