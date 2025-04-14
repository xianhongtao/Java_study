import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入数组的大小: ");
        n = sc.nextInt();
        double[] arr = new double[n];
        System.out.println("请输入数组的元素: ");
        String input = sc.nextLine();
        sc.close();
        String[] inputArray = input.split(" ");
        for (int i = 0; i < inputArray.length; i++) {
            arr[i] = Double.parseDouble(inputArray[i]);
        }
        
    }
}
