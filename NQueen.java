import java.util.Scanner;

public class NQueen {
    static int n;
    static int solutions;

    public static void main(String[] args) {
        System.out.println("有几个皇后？");
        Scanner scanner = new Scanner(System.in);
        n = Integer.parseInt(scanner.nextLine());
        Boolean[][] chessPlate = new Boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                chessPlate[i][j] = false;
            }
        }
        solutions = 0;
        Step(chessPlate, 0);
        System.out.println(solutions);
    }

    static void Step(Boolean[][] chessPlate, int currentRow) {
        for (int currentColumn = 0; currentColumn < n; currentColumn++) {
            if (!chessPlate[currentRow][currentColumn]) {
                Boolean[][] newPlate = new Boolean[n][n];
                for (int i = 0; i < n; i++) {
                    newPlate[i] = chessPlate[i].clone();
                }
                if (currentRow == n - 1) {
                    solutions++;
                } else {
                    Step(MarkQueenAttacks(newPlate, currentRow, currentColumn), currentRow + 1);
                }
            }
        }
    }

    static Boolean[][] MarkQueenAttacks(Boolean[][] chessPlate, int x, int y) {
        for (int i = 0; i < chessPlate.length; i++) {
            chessPlate[x][i] = true;
        }
        for (int i = 0; i < chessPlate[0].length; i++) {
            chessPlate[i][y] = true;
        }
        int[] position = { x, y };
        for (; position[0] < chessPlate.length && position[1] < chessPlate[0].length;) {
            chessPlate[position[0]][position[1]] = true;
            position[0]++;
            position[1]++;
        }
        position = new int[] { x, y };
        for (; position[0] >= 0 && position[1] < chessPlate[0].length;) {
            chessPlate[position[0]][position[1]] = true;
            position[0]--;
            position[1]++;
        }
        position = new int[] { x, y };
        for (; position[0] < chessPlate.length && position[1] >= 0;) {
            chessPlate[position[0]][position[1]] = true;
            position[0]++;
            position[1]--;
        }
        position = new int[] { x, y };
        for (; position[0] >= 0 && position[1] >= 0;) {
            chessPlate[position[0]][position[1]] = true;
            position[0]--;
            position[1]--;
        }
        return chessPlate;
    }
}
