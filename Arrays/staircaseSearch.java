public class staircaseSearch {
    public static boolean search(int matrix[][],int key ) {
        int row=matrix.length-1,col=0;

        while(row >= 0 && col < matrix[0].length){
            if (matrix[row][col]==key) {
                System.out.println("found key at "+row+" "+col);
                return true;
            }
            else if(key>matrix[row][col]){
                col++;
            }
            else{
                row--;
            }
        }
        System.out.println("key not found");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {
            { 1,  2,  3,  4,  5 },
            { 6,  7,  8,  9,  10 },
            { 11, 12, 13, 14, 15 },
            { 16, 17, 18, 19, 20 },
            { 21, 22, 23, 24, 30 }
        };
        

                search(matrix,30);
    }
}

