// imports necessary libraries
import java.util.ArrayList;
import java.util.List;

public class spiral_matrix {
    // method to return elements of matrix in spiral order
    public List<Integer> spiralOrder(int[][] matrix) {
        // list stores elements in spiral order
        List<Integer> result = new ArrayList<>();
        // creates boundaries for temp matrix
        int rowStart = 0, rowEnd = matrix.length - 1;
        int colStart = 0, colEnd = matrix[0].length - 1;
        // traverses matrix in spiral order while temp matrix is valid
        while (rowStart <= rowEnd && colStart <= colEnd) {
            // traverse left to right along top row
            for (int i = colStart; i <= colEnd; i++) result.add(matrix[rowStart][i]);
            rowStart++; // moves top boundary
            // traverse top to bottom along rightmost col
            for (int i = rowStart; i <= rowEnd; i++) result.add(matrix[i][colEnd]);
            colEnd--; // moves right boundary
            // check if can traverse from right to left along bottom row
            if (rowStart <= rowEnd) for (int i = colEnd; i >= colStart; i--) result.add(matrix[rowEnd][i]);
            rowEnd--; // moves bottom boundary
            // check if can traverse from bottom to top along leftmost col
            if (colStart <= colEnd) for (int i = rowEnd; i >= rowStart; i--) result.add(matrix[i][colStart]);
            colStart++; // moves left boundary
        }
        return result; // return list of elements in spiral order
    }

    public static void main(String[] args) {
        // first test case finding spiral order of elements in matrix
        spiral_matrix matrix = new spiral_matrix();
        List<Integer> m1 = matrix.spiralOrder(new int[][]{{1, 2, 3},{4, 5, 6},{7, 8, 9}});
        System.out.println("Spiral order of first matrix: " + m1); // prints out elements in spiral order

        // second test case finding spiral order of elements in matrix
        spiral_matrix matrix2 = new spiral_matrix();
        List<Integer> m2 = matrix2.spiralOrder(new int[][]{{1, 2, 3, 4},{5, 6, 7, 8},{9, 10, 11, 12}});
        System.out.println("Spiral order of second matrix: " + m2); // prints out elements in spiral order
    }
}