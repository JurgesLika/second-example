package Excs;

public class MathUtils {
    public static double power(int a , int b){
        return Math.pow(a, b);
    }
    public static double factorial(int a){
        double product = 1;
        for (int i = 1; i < a; i++) {
            product *= i;
        }
        return product;
    }
}
