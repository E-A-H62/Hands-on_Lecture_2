// imports needed libraries
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

// creates test class to execute unit tests
class SpiralMatrixTest {
    // instance to call spiral matrix method
    private SpiralMatrix spiralMatrix;

    @BeforeEach // defines instance variable
    void setUp() {spiralMatrix = new SpiralMatrix();}

    // various unit tests to check if method executes correctly
    @Test
    void testSpiralOrderNone() {
        List<Integer> expected = new ArrayList<>();
        assertTrue(expected.isEmpty(), "Expected empty list for no input.");
    }

    @Test
    void testSpiralOrderZero() {
        List<Integer> expected = List.of(0);
        List<Integer> actual = spiralMatrix.spiralOrder(new int[][]{{0}});
        assertEquals(expected, actual, "SpiralMatrix should return a list of one element.");
    }

    @Test
    void testSpiralOrderNine() {
        List<Integer> expected = List.of(1,2,3,6,9,8,7,4,5);
        List<Integer> actual = spiralMatrix.spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        assertEquals(expected, actual, "SpiralMatrix should return the same list of nine elements.");
    }

    @Test
    void testSpiralOrderTwelve() {
        List<Integer> expected = List.of(1,2,3,4,8,12,11,10,9,5,6,7);
        List<Integer> actual = spiralMatrix.spiralOrder(new int[][]{{1, 2, 3, 4},{5, 6, 7, 8},{9, 10, 11, 12}});
        assertEquals(expected, actual, "SpiralMatrix should return the same list of twelve elements.");
    }
}