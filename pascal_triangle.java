// imports necessary libraries
import java.util.ArrayList;
import java.util.List;

public class pascal_triangle {
    // method to find Pascal Triangle
    public List<List<Integer>> generate(int numRows) {
        // list to store Pascal Triangle
        List<List<Integer>> triangle = new ArrayList<>();
        // iterate through each row
        for (int i = 0; i < numRows; i++) {
            // create new list for current row
            List<Integer> row = new ArrayList<>();
            // fill current row with ones (populates triangle with ones)
            for (int j = 0; j <= i; j++) {
                row.add(1);
            }
            // finds correct values to fill Pascal's triangle with
            for (int j = 1; j < i; j++) {
                // calculates inner elements of triangle by finding the two numbers above it
                int valAboveLeft = triangle.get(i - 1).get(j-1);
                int valAboveRight = triangle.get(i-1).get(j);
                int sum = valAboveLeft + valAboveRight;
                row.set(j, sum); // sets the proper value in the row for Pascal's triangle
            }
            triangle.add(row); // add current row to triangle
        }
        return triangle; // return complete Pascal's Triangle
    }

    public static void main(String[] args) {
        // first test case creating Pascal's triangle with five rows
        pascal_triangle triangle = new pascal_triangle();
        List<List<Integer>> t1 = triangle.generate(5);
        System.out.println("Pascal's triangle with five rows:");
        System.out.println(t1); // prints out triangle

        // second test case creating Pascal's triangle with one row
        pascal_triangle triangle2 = new pascal_triangle();
        List<List<Integer>> t2 = triangle2.generate(1);
        System.out.println("Pascal's triangle with one row:");
        System.out.println(t2); // prints out triangle
    }
}

// an optimized solution was provided in Canvas
/*
public class PascalsTriangleMemoized {
    // map to store computed vals for Pascal's triangle
    // helps avoid having to repeat calculations in another for loop
    private static Map<String, Integer> memo = new HashMap<>();

    // returns value of specific position in Pascal's triangle
    public static int getValue(int row, int col) {
        if (col == 0 || col == row) return 1; // checks if position is edges of triangle
        String key = row + "," + col; // creates key for current position
        if (!memo.containsKey(key)) { // checks if need to calculate value at specific position
            memo.put(key, getValue(row - 1, col - 1) + getValue(row - 1, col));
        }
        return memo.get(key); // return value for current position in triangle
    }

    // creates numRows of Pascal's Triangle
    public static List<List<Integer>> generate(int numRows) {
        // create list to hold rows of Pascal's triangle
        List<List<Integer>> triangle = new ArrayList<>();
        // iterate through each position in row to populate Pascal's triangle
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            // finds value at specific position using HashMap
            for (int j = 0; j <= i; j++) row.add(getValue(i, j));
            triangle.add(row);
        }
        return triangle; // returns Pascal's triangle
    }
}
*/
