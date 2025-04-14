import java.util.*;

public class ArrayManipulationDemo {
    public static void main(String[] args) {
        int n, index;
        double[] a;
        double num;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组的大小：");
        n = sc.nextInt();
        a = new double[n];
        System.out.println("请输入" + n +"个数,用空格分隔：");
        String input = sc.nextLine();
        sc.close();
        String[] inputArray = input.split(" ");
        for (int i = 0; i < inputArray.length; i++) {
            a[i] = Double.parseDouble(inputArray[i]);
        }
        System.out.println("最大值: " + GetArrayMax(a));
        System.out.println("最小值: " + GetArrayMin(a));
        num = a[0];
        index = GetArrayMaxIndex(a);
        a[0] = a[index];
        a[index] = num;
        System.out.println("交换最大值和第一个元素后的数组: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        num = a[a.length - 1];
        index = GetArrayMinIndex(a);
        a[a.length -1] = a[index];
        a[index] = num;
        System.out.println("交换最小值和最后一个元素后的数组: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static double GetArrayMax(double[] array) {
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    static int GetArrayMaxIndex(double[] array) {
        double max = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        return index;
    }
    static double GetArrayMin(double[] array) {
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
        
    }
    static int GetArrayMinIndex(double[] array) {
        double min = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }
}

