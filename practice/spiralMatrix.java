
public class spiralMatrix {
    static void spiral(int a[][] ){
        int startCol=0;
        int startRow=0;
        int endCol=a[0].length-1;
        int endRow=a.length-1;

        while (startCol<=endCol && startRow<=endRow) {
            for (int i = startCol; i <=endCol; i++) {
                System.out.print(a[startRow][i]+ " ");
            }
            for (int i = startRow+1; i <=endRow; i++) {
                System.out.print(a[i][endCol]+ " ");
            }
            for (int i = endCol-1; i >=startCol; i--) {
                System.out.print(a[endRow][i]+ " ");
            }
            for (int i = endRow-1; i >=startRow+1; i--) {
                System.out.print(a[i][startCol]+ " ");
            }
          
     
            startCol++;
            startRow++;
            endCol--;
            endRow--;
            
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3, 4,17 },
                 { 5, 6, 7, 8 ,18},
                { 9, 10, 11, 12 ,19},
                { 13, 14, 15, 16 ,20},
                { 26, 14, 15, 16 ,20} };

        spiral(matrix);
    }
}
