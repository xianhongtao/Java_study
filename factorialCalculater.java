import java.util.Scanner;

public class factorialCalculater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = sc.nextInt();
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        System.out.println(num + "的阶乘是：" + result);
        sc.close();
    }
}
