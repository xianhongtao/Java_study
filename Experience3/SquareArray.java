public class SquareArray {
    public static void main(String[] args) {
        int[][] arr = new int[10][10];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
        System.out.println("原始数组:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int diagonalSum = 0; 
        for (int i = 0; i < arr.length; i++) {
            diagonalSum += arr[i][i];
        }
        System.out.println("主对角线元素之和: " + diagonalSum);
        int maxBuffer = 0, minBuffer = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > maxBuffer) {
                    maxBuffer = arr[i][j];
                }
                if (arr[i][j] < minBuffer) {
                    minBuffer = arr[i][j];
                }
            }
        }
        System.out.println("最大值: " + maxBuffer);
        System.out.println("最小值: " + minBuffer);
    }
}
