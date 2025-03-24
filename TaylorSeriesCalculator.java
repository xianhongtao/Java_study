import java.util.Scanner;

public class TaylorSeriesCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入x的值：");
        double x = input.nextDouble();
        input.close();
        
        double sum = 1.0;  // 初始值为1（首项）
        double term = x;    // 第二项x
        int n = 1;         // 当前项的阶乘分母
        
        // 当项的绝对值大于1e-8时继续计算
        while (Math.abs(term) > 1e-8) {
            sum += term;       // 累加当前项
            n++;              // 更新阶乘分母
            // 计算下一项：(-1)^(n+1) * x^n / n!
            term = (-x / n) * term; 
        }
        
        // 输出结果保留10位小数
        System.out.printf("计算结果为：%.10f%n", sum);
    }
}
