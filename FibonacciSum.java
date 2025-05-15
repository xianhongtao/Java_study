import java.util.Scanner;

public class FibonacciSum {
    public static void main(String[] args) {
        int Var1 = 0;
        int Var2 = 1;
        int totalSum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数列的项数：");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.print(Var1 + " ");
            totalSum += Var1;
            int sum = Var1 + Var2;
            Var1 = Var2;
            Var2 = sum;
        }
        sc.close();
        System.out.println("\n" + "数列的和为：" + totalSum);
    }
}