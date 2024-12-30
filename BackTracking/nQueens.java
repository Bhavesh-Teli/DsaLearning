package BackTracking;

public class nQueens {

static boolean isSafe (char board[][],int row,int col){
    for (int i = row; i >=0 ; i--) {
        if (board[i][col]=='Q') {
            return false;
        }
    }

    for (int i = row-1,j=col-1;i >=0 && j>=0; i--,j--) {
        if (board[i][j]=='Q') {
            return false;
        }
    }
    for (int i = row-1,j=col+1;i >=0 && j<board.length; i--,j++) {
        if (board[i][j]=='Q') {
            return false;
        }
    }
    return true;
}
    static void nquen(char board[][] ,int row){
        
        if (row==board.length) {
            prinBoard(board);
            count++;
            return;
        }
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board,row,col)) {
                board[row][col]='Q';
                nquen(board, row+1);
                board[row][col]='X';
            }
        }
    }

    static int count=0;
    static void prinBoard(char board[][]){
        System.out.println("----------Chess Board-----------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=5;
        char board[][]=new char[n][n];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j]='X';
            }

        }

        nquen(board, 0);
        System.out.println("total ways are "+count);
    }
    
}
