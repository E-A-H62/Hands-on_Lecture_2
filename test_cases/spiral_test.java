// importing necessary libraries
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class spiral_test {
    @Test
    public void spiral_test() {
        // test case to list elements in spiral order
        List<Integer> expected = List.of(1, 2, 3, 6, 9, 8, 7, 4, 5);
        // setting up actual case to find spiral order of given matrix
        spiral_matrix matrix = new spiral_matrix();
        List<Integer> actual = matrix.spiralOrder(new int[][]{{1, 2, 3},{4, 5, 6},{7, 8, 9}});

        // checking if actual output matches expected output
        assertEquals(expected, actual);
    }
}
