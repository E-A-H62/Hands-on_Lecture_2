// imports needed libraries
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

// creates test class to execute unit tests
class PascalsTrianglesTest {
    // instance to call Pascal triangle method
    private PascalsTriangles pascalsTriangles;

    @BeforeEach // defines instance variable
    void setUp() {pascalsTriangles = new PascalsTriangles();}

    // various unit tests to check if method executes correctly
    @Test
    void testGenerateZeroRows() {
        List<List<Integer>> result = pascalsTriangles.generate(0);
        assertTrue(result.isEmpty(), "Expected empty list for 0 rows.");
    }

    @Test
    void testGenerateOneRow() {
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(1));
        assertEquals(expected, pascalsTriangles.generate(1), "Expected [[1]] for 1 row.");
    }

    @Test
    void testGenerateTwoRows() {
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(1,1)
        );
        assertEquals(expected, pascalsTriangles.generate(2), "Expected [[1], [1,1]] for 2 rows.");
    }

    @Test
    void testGenerateThreeRows() {
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(1,1),
                Arrays.asList(1,2,1)
        );
        assertEquals(expected, pascalsTriangles.generate(3), "Expected [[1], [1,1], [1,2,1]] for 3 rows.");
    }

    @Test
    void testGenerateFiveRows() {
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(1,1),
                Arrays.asList(1,2,1),
                Arrays.asList(1,3,3,1),
                Arrays.asList(1,4,6,4,1)
        );
        assertEquals(expected, pascalsTriangles.generate(5), "Expected[[1], [1,1], [1,2,1], [1,3,3,1], [1,4,6,4,1] for 5 rows.");
    }

    @Test
    void testGenerateNegativeRows() {
        List<List<Integer>> expected = pascalsTriangles.generate(-1);
        assertTrue(expected.isEmpty(), "Expected empty list for negative input.");
    }
}