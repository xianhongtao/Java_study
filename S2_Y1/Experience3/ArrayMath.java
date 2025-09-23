import java.util.Scanner;

public class ArrayMath {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入数组的大小: ");
        n = sc.nextInt();
        sc.nextLine();
        double[] arrA = new double[n], arrB = new double[n];
        System.out.println("请输入A数组的元素: ");
        String input = sc.nextLine();
        System.out.println("请输入B数组的元素: ");
        String input2 = sc.nextLine();
        sc.close();
        String[] inputArray = input.split(" ");
        String[] inputArray2 = input2.split(" ");
        for (int i = 0; i < inputArray.length; i++) {
            arrA[i] = Double.parseDouble(inputArray[i]);
            arrB[i] = Double.parseDouble(inputArray2[i]);
        }
        for(int i = 0; i < arrA.length; i++) {
            System.out.print(arrA[i] + arrB[i] + " ");   
        }
        System.out.println();
        for(int i = 0; i < arrA.length; i++) {
            System.out.print(arrA[i] - arrB[i] + " ");   
        }
        System.out.println();
        for(int i = 0; i < arrA.length; i++) {
            System.out.print(arrA[i] * arrB[i] + " ");   
        }
    }
}
