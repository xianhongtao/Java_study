package CodeForcesSolutions;

import java.util.Scanner;

public class Q2074A {
    public static void main(String[] args) {
        String[] input;
        int l, r, d, u;
        Scanner sc = new Scanner(System.in);
        int caseInput = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < caseInput; i++) {
            input = sc.nextLine().split(" ");
            l = Integer.parseInt(input[0]);
            r = Integer.parseInt(input[1]);
            d = Integer.parseInt(input[2]);
            u = Integer.parseInt(input[3]);
            if (l == r && d == u && l == d) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
