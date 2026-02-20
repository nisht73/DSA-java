public class spiral {
    public static void printSpiral(int matrix[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while (startRow <= endRow && startCol <= endCol) {
           //top
           for(int j=startCol; j<=endCol; j++){
            System.out.print(matrix[startRow][j]+" ");
           } 

           //right
           for(int i =startRow+1; i<=endRow; i++){
             System.out.print(matrix[i][endCol]+" ");
           }

           //bottom
           for(int j=endCol-1; j>=startCol;j--){
             if(startRow==endRow){
                break;
             }
             System.out.print(matrix[endRow][j]+" ");
            }
           //left
           for(int i=endRow-1;i>=startRow+1;i--){
            if(startCol==endCol){
                break;
             }
             System.out.print(matrix[i][startCol]+" ");
           }

           startCol++;
           startRow++;
           endRow--;
           endCol--;
        }
        System.out.println();
    };
    public static void main(String args[]) {
        int matrix[][] = {
            {1, 2 , 3 , 4},
            {5, 6 , 7 , 8},
            {9, 10, 11, 12},
            {13, 14 , 15 , 16}
        };
        printSpiral(matrix);
    };
}

// without if conditions
// public class SpiralClean {

//     public static void printSpiral(int[][] matrix) {
//         int top = 0;
//         int bottom = matrix.length - 1;
//         int left = 0;
//         int right = matrix[0].length - 1;

//         while (top <= bottom && left <= right) {

//             // move right
//             for (int j = left; j <= right; j++) {
//                 System.out.print(matrix[top][j] + " ");
//             }
//             top++;

//             // move down
//             for (int i = top; i <= bottom; i++) {
//                 System.out.print(matrix[i][right] + " ");
//             }
//             right--;

//             // move left (only if row remains)
//             if (top <= bottom) {
//                 for (int j = right; j >= left; j--) {
//                     System.out.print(matrix[bottom][j] + " ");
//                 }
//                 bottom--;
//             }

//             // move up (only if column remains)
//             if (left <= right) {
//                 for (int i = bottom; i >= top; i--) {
//                     System.out.print(matrix[i][left] + " ");
//                 }
//                 left++;
//             }
//         }

//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int[][] matrix = {
//             {1, 2 , 3 , 4},
//             {5, 6 , 7 , 8},
//             {9, 10, 11, 12},
//             {13, 14 , 15 , 16}
//         };

//         printSpiral(matrix);
//     }
// }
