package Experience2;

import java.util.Scanner;

public class AlternatingSeriesCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 8;
        System.out.print("请输入x的值：");
        double x = input.nextDouble();
        input.close();
        double total = 1;
        int index = 1;
        double current = 1;
        double current1 = 1;
        for (;;) {
            current1 *= index;
            current = Math.pow(-1, index - 1) * Math.pow(x, index) / current1;
            total += current;
            if (Math.abs(current) < Math.pow(10, -n)) {
                break;
            }
            index++;
        }
        System.out.println("结果是：" + total);
    }
}
