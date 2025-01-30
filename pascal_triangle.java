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
