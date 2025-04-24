import java.util.Scanner;
import java.util.ArrayList;

public class ArrayMathNew {
    private static ArrayList<Integer> dimensions;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 输入维度信息
        System.out.print("请输入数组维度数n: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        dimensions = new ArrayList<>();
        System.out.println("请输入各维度大小（用空格分隔）: ");
        String[] dims = sc.nextLine().split(" ");
        for (String dim : dims) {
            dimensions.add(Integer.parseInt(dim));
        }
        
        // 创建n维数组
        System.out.println("\n请输入数组A的元素：");
        Object arrayA = createArray(0);
        inputArray(sc, arrayA, 0);
        
        System.out.println("\n请输入数组B的元素：");
        Object arrayB = createArray(0);
        inputArray(sc, arrayB, 0);
        
        // 计算结果
        System.out.println("\n和数组：");
        printArray(calculate(arrayA, arrayB, '+'), 0);
        
        System.out.println("\n差数组：");
        printArray(calculate(arrayA, arrayB, '-'), 0);
        
        System.out.println("\n积数组：");
        printArray(calculate(arrayA, arrayB, '*'), 0);
        
        sc.close();
    }

    // 递归创建多维数组
    private static Object createArray(int depth) {
        if (depth == dimensions.size() - 1) {
            return new double[dimensions.get(depth)];
        }
        Object[] array = new Object[dimensions.get(depth)];
        for (int i = 0; i < array.length; i++) {
            array[i] = createArray(depth + 1);
        }
        return array;
    }

    // 递归输入数组元素
    private static void inputArray(Scanner sc, Object array, int depth) {
        if (depth == dimensions.size() - 1) {
            double[] arr = (double[]) array;
            System.out.printf("输入 %d 个元素（用空格分隔）: ", arr.length);
            String[] values = sc.nextLine().split(" ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Double.parseDouble(values[i]);
            }
        } else {
            Object[] arr = (Object[]) array;
            for (int i = 0; i < arr.length; i++) {
                System.out.printf("第 %d 维第 %d 个元素：\n", depth+1, i+1);
                inputArray(sc, arr[i], depth + 1);
            }
        }
    }

    // 递归计算数组运算
    private static Object calculate(Object a, Object b, char op) {
        if (a instanceof double[]) {
            double[] arrA = (double[]) a;
            double[] arrB = (double[]) b;
            double[] result = new double[arrA.length];
            for (int i = 0; i < arrA.length; i++) {
                switch(op) {
                    case '+': result[i] = arrA[i] + arrB[i]; break;
                    case '-': result[i] = arrA[i] - arrB[i]; break;
                    case '*': result[i] = arrA[i] * arrB[i]; break;
                }
            }
            return result;
        } else {
            Object[] arrA = (Object[]) a;
            Object[] arrB = (Object[]) b;
            Object[] result = new Object[arrA.length];
            for (int i = 0; i < arrA.length; i++) {
                result[i] = calculate(arrA[i], arrB[i], op);
            }
            return result;
        }
    }

    // 递归打印数组
    private static void printArray(Object array, int depth) {
        if (array instanceof double[]) {
            double[] arr = (double[]) array;
            for (double num : arr) {
                System.out.printf("%.2f ", num);
            }
            System.out.println();
        } else {
            Object[] arr = (Object[]) array;
            for (Object obj : arr) {
                printArray(obj, depth + 1);
                if (depth < dimensions.size() - 2) {
                    System.out.println("----------------");
                }
            }
        }
    }
}
