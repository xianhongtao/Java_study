package Experience2;
//import java.util.Scanner;
public class Ex_Taylor {
    public static void main(String[] args) {
        double e = 1;
        int n , i = 1;
        n = 8;
        //Scanner input = new Scanner(System.in);
        //System.out.print("请输入精度，n的值（10^-n）：");
        //n = input.nextInt();
        //input.close();
        double var = 1;
        for (; ;){
            var *= i;
            if (1 / var < Math.pow(10, -n)){
                break;
            }
            e += 1 / var;
            i++;
        }
        System.out.println("e = " + e);
    }
}
