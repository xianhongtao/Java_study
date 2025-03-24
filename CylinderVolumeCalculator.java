import java.util.Scanner;

public class CylinderVolumeCalculator {
    public static void main(String[] args) {
        double radius;    // 圆柱体底面半径
        double height;    // 圆柱体高度
        double volume;    // 圆柱体体积
        
        Scanner input = new Scanner(System.in);
        
        // 输入半径和高
        System.out.print("请输入圆柱体的底面半径: ");
        radius = input.nextDouble();
        
        System.out.print("请输入圆柱体的高度: ");
        height = input.nextDouble();
        
        // 计算体积
        volume = Math.PI * Math.pow(radius, 2) * height;
        
        // 输出结果（保留两位小数）
        System.out.printf("体积是：" + volume);
    }
}
