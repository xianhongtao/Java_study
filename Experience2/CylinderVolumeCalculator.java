package Experience2;

import java.util.Scanner;

public class CylinderVolumeCalculator {
    public static void main(String[] args) {
        double radius;
        double height;
        double volume;

        Scanner input = new Scanner(System.in);

        System.out.print("请输入圆柱体的底面半径: ");
        radius = input.nextDouble();

        System.out.print("请输入圆柱体的高度: ");
        height = input.nextDouble();

        volume = Math.PI * Math.pow(radius, 2) * height;

        System.out.printf("体积是：" + volume);

        input.close();
    }
}
