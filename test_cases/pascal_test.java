// importing necessary libraries
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class pascal_test {
    @Test
    public void testGenerate() {
        // test case to create Pascal's triangle w/ 5 rows
        List<List<Integer>> expected = List.of(
                List.of(1),
                List.of(1, 1),
                List.of(1, 2, 1),
                List.of(1, 3, 3, 1),
                List.of(1, 4, 6, 4, 1)
        );
        // setting up actual case to create Pascal's triangle
        pascal_triangle triangle = new pascal_triangle();
        // executing actual method to create Pascal's triangle
        List<List<Integer>> actual = triangle.generate(5);

        // checking if actual output matches expected output
        assertEquals(expected, actual);
    }
}
