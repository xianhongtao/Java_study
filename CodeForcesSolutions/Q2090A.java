package CodeForcesSolutions;

import java.util.Scanner;

public class Q2090A {
    public static void main(String[] args) {
        String[] input;
        int x, y, a, loopLenth;
        Scanner sc = new Scanner(System.in);
        int caseInput = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < caseInput; i++) {
            input = sc.nextLine().split(" ");
            x = Integer.parseInt(input[0]);
            y = Integer.parseInt(input[1]);
            a = Integer.parseInt(input[2]);
            loopLenth = x + y;
            a = a % loopLenth;
            if (a < x) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        sc.close();
    }
}