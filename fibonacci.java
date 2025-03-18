import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数列的项数：");
        int num = sc.nextInt();
        int[] result = new int[num];
        result[0] = 1;
        result[1] = 1;
        for (int i = 2; i < num; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        System.out.println("斐波那契数列的前" + num + "项是：");
        for (int i = 0; i < num; i++) {
            System.out.print(result[i] + " ");
        }
    }
}

