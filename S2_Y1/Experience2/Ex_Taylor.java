package Experience2;

//import java.util.Scanner;
public class Ex_Taylor {
    public static void main(String[] args) {
        double e = 1;
        int n, i = 1;
        n = 8;
        // Scanner input = new Scanner(System.in);
        // System.out.print("请输入精度，n的值（10^-n）：");
        // n = input.nextInt();
        // input.close();
        double counter = 1;
        for (;;) {
            counter *= i;
            if (1 / counter < Math.pow(10, -n)) {
                break;
            }
            e += 1 / counter;
            i++;
        }
        System.out.println("e = " + e);
    }
}
