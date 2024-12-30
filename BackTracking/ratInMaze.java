package BackTracking;

public class ratInMaze {
    static void solution(int i, int j, int row, int col, String s, int[][] maze) {
        if (i < 0 || j < 0 || i > row || j > col)
            return;
        if (i == row && j == col) {
            System.out.println(s);
            count++;
            return;
        }
        if (maze[i][j] == 0)
            return;
        if (maze[i][j] == -1)
            return;
        maze[i][j] = -1;

        solution(i, j + 1, row, col, s + "R", maze);
        solution(i + 1, j, row, col, s + "D", maze);
        solution(i, j- 1, row, col , s + "L", maze);
        solution(i- 1, j, row , col, s + "U", maze);

        maze[i][j] = 1;
    }

    static int count = 0;

    public static void main(String[] args) {

        // int[][] maze = {
        //         { 1, 0, 0, 0, 0 },
        //         { 1, 1, 0, 1, 0 },
        //         { 0, 1, 1, 1, 0 },
        //         { 0, 0, 0, 1, 0 },
        //         { 1, 1, 1, 1, 1 }
        // };
        int[][] maze = {
            {1, 0, 1, 1 },
            {1, 1, 1, 1 },
            {1, 1, 0, 1 },
        };
        int n = 3;
        int row = maze.length - 1, col = maze[0].length-1 ;

        solution(0, 0, row, col, "", maze);
        System.out.println("Total paths: " + count);
    }
}
