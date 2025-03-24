public class Ex_Taylor {
    public static void main(String[] args) {
        double e = 1.0;
        double term = 1.0;
        int n = 1;
        
        while (term >= 1e-6) {
            term *= 1.0 / n;
            e += term;
            n++;
        }
        
        System.out.printf("e的近似值为: %.7f%n", e);
    }
}
