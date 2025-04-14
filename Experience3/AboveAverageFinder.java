import java.util.Scanner;

public class AboveAverageFinder {
    public static void main(String[] args) {
        int n;
        double avarage = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入数组的大小: ");
        n = sc.nextInt();
        sc.nextLine();
        double[] arr = new double[n];
        System.out.println("请输入数组的元素: ");
        String input = sc.nextLine();
        sc.close();
        String[] inputArray = input.split(" ");
        for (int i = 0; i < inputArray.length; i++) {
            arr[i] = Double.parseDouble(inputArray[i]);
        }
        for(int i = 0; i < arr.length; i++) {
            avarage += arr[i];
        }
        avarage /= arr.length;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > avarage) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
