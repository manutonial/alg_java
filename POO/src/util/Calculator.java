package util;

public class Calculator {

    //uso do static no method, ai não precisa instanciar o objeto
    //utilizar quando tiver const, valor que nao muda.
    
    // final pois o valor de double nao muda
    public static final double PI = 3.14159;
    
    public static double circumference(double radius) {
    
        return 2.0 * PI * radius;
    }
    
    public static double volume(double radius) {
    
        return (4.0 * PI * Math.pow(radius, 3) ) / 3.0;
    }
}
