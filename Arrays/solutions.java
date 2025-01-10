
import java.io.*;
import java.util.*;
public class solutions {

    // Function to return a list of integers denoting spiral traversal of matrix.
    static void spirallyTraverse(int mat[][]) {
        // code here
        int startRow=0;
        int startCol=0;
        int endRow=mat.length-1;
        int endCol=mat[0].length-1;
        
        while(startRow<=endRow && startCol<=endCol){
            for(int j=startCol;j<=endCol;j++){
                System.out.print(mat[startRow][j]+" , ");
            }
             for(int j=startRow+1;j<=endRow;j++){
                System.out.print(mat[j][endCol]+" , ");
            }
             for(int j=endCol-1;j>=startCol;j--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(mat[endRow][j]+" , ");
            }
             for(int j=endRow-1;j>startRow;j--){
                if(startCol == endCol){
                    break;
                }
                System.out.print(mat[j][startRow]+" , ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int matrix[][] = {
            { 1, 2, 3, 4,17 },
             { 5, 6, 7, 8 ,18},
            { 9, 10, 11, 12 ,19},
            { 13, 14, 15, 16 ,20},
            { 26, 14, 15, 16 ,20} };

    spirallyTraverse(matrix);
    }
}
