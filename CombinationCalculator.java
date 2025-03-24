import java.util.Scanner;

public class CombinationCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter m: ");
        int m = scanner.nextInt();
        
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        long result = factorial(m) / (factorial(m-n) * factorial(n));
        System.out.println("C(" + m + "," + n + ") = " + result);
        
        scanner.close();
    }

    private static long factorial(int num) {
        if (num == 0) return 1;
        return num * factorial(num - 1);
    }
}
