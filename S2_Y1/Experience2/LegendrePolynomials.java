package Experience2;

import java.util.Scanner;

public class LegendrePolynomials {
    public static void main(String[] args) {
        int n;
        double x, result;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入n的值（非负整数）:");
        n = sc.nextInt();
        System.out.println("请输入x的值（实数）:");
        x = sc.nextDouble();
        sc.close();
        result = f(n, x);
        System.out.println("勒让德多项式P的结果=" + result);
    }

    static double f(int n, double x) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return x;
        } else if (n >= 1) {
            double P_n_minus_1 = f(n - 1, x);
            double P_n_minus_2 = f(n - 2, x);
            return ((2 * n - 1) * x * P_n_minus_1 - (n - 1) * P_n_minus_2) / n;
        }
        return 0;
    }
}