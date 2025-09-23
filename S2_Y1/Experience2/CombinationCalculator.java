package Experience2;

import java.util.Scanner;

public class CombinationCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入n的值：");
        int n = input.nextInt();
        System.out.print("请输入m的值：");
        int m = input.nextInt();
        input.close();
        long total = 1;
        long upper = 1, lowerleft = 1, lowerright = 1;
        for (int i = 1; i <= m; i++) {
            upper *= i;
        }
        for (int i = 1; i <= m - n; i++) {
            lowerleft *= i;
        }
        for (int i = 1; i <= n; i++) {
            lowerright *= i;
        }
        total = upper / (lowerleft * lowerright);
        System.out.println("结果是：" + total);
    }
}
