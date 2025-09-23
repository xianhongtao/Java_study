package Experience2;

import java.util.Scanner;

public class SwitchBonusCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入当月利润（元）：");
        double profit = input.nextDouble();
        double bonus = 0;

        int grade = (int) (profit / 100000);
        switch (grade) {
            case 0:
                bonus = profit * 0.1;
                break;
            case 1:
                bonus = 100000 * 0.1 + (profit - 100000) * 0.075;
                break;
            case 2:
            case 3:
                bonus = 100000 * 0.1 + 100000 * 0.075 + (profit - 200000) * 0.05;
                break;
            case 4:
            case 5:
                bonus = 100000 * 0.1 + 100000 * 0.075 + 200000 * 0.05 + (profit - 400000) * 0.03;
                break;
            case 6:
            case 7:
            case 8:
            case 9:
                bonus = 100000 * 0.1 + 100000 * 0.075 + 200000 * 0.05 + 200000 * 0.03 + (profit - 600000) * 0.015;
                break;
            default:
                if (profit > 1000000) {
                    bonus = 100000 * 0.1 + 100000 * 0.075 + 200000 * 0.05 + 200000 * 0.03 + 400000 * 0.015
                            + (profit - 1000000) * 0.01;
                }
                break;
        }

        input.close();

        System.out.println("应发奖金总数：" + String.format("%.2f", bonus) + "元");
    }
}
