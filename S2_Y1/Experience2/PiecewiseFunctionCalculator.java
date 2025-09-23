package Experience2;

import java.util.Scanner;

public class PiecewiseFunctionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入x值: ");
        double x = scanner.nextDouble();
        double y;

        if (x < -1) {
            y = x;
        } else if (x < 10) {
            y = 2 * Math.pow(x, 2) - 1;
        } else {
            y = 3 * Math.sqrt(x) - 11;
        }

        System.out.printf("y=" + y);
        scanner.close();
    }
}
