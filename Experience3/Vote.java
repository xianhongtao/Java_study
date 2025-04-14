import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        int[] votes = new int[5];
        System.out.println("输入你想投票的人的编号，按下enter确认：\n1.刘亦菲\n2.佐藤爱\n3.范冰冰\n4.巩俐\n5.宋祖英");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 50; i++) {
            int vote = sc.nextInt();
            if (vote >= 1 && vote <= 5) {
                votes[vote - 1]++;
            } else {
                System.out.println("无效的投票，请重新输入。");
                i--; // 不计入有效投票
            }
        }
        sc.close();
        System.out.println("投票结果：");
        for (int i = 0; i < votes.length; i++) {
            System.out.println((i + 1) + ". " + votes[i] + "票");
        }
    }
}
