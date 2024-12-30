package BackTracking;

public class gridWays4Dir {
    static void gridWays(int i, int j, int row, int col, String s, boolean isVisited[][]) {
        if (i < 0 || j < 0 || i > row || j > col || isVisited[i][j])
            return;

        if (i == row && j == col) {
            System.out.println(s);
            return;
        }

        isVisited[i][j] = true;

        gridWays(i, j + 1, row, col, s + "R", isVisited);
        gridWays(i + 1, j, row, col, s + "D", isVisited);
        gridWays(i, j - 1, row, col, s + "L", isVisited);
        gridWays(i - 1, j, row, col, s + "U", isVisited);

        isVisited[i][j] = false;

    }

    public static void main(String[] args) {
        int n = 3;
        int row = n - 1, col = n - 1;
        boolean[][] isVisited = new boolean[n][n];

        gridWays(0, 0, row, col, "", isVisited);
    }
}
