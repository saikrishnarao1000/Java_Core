package LamdaFunctionsTest;

import LamdaFunctions.SumOfSquares;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.assertEquals;

public class SumOfSquaresTest {
    @Test
    public void testFilterPositiveIntegers() {
        List<Integer> inputList = Arrays.asList(1, 2, -3, 4, -5, 6, 7, -8, 9, 10);
        List<Integer> expectedOutput = Arrays.asList(1, 2, 4, 6, 7, 9, 10);
        List<Integer> filteredList = SumOfSquares.filterPositiveIntegers(inputList);
        assertEquals(expectedOutput, filteredList);
    }

    @Test
    public void testCalculateSquares() {
        List<Integer> inputList = Arrays.asList(1, 2, 4, 6, 7, 9, 10);
        List<Integer> expectedOutput = Arrays.asList(1, 4, 16, 36, 49, 81, 100);
        List<Integer> squares = SumOfSquares.calculateSquares(inputList);
        assertEquals(expectedOutput, squares);
    }

    @Test
    public void testSumOfSquares() {
        List<Integer> inputList = Arrays.asList(1, 4, 16, 36, 49, 81, 100);
        int expectedOutput = 287;
        int sumOfSquares = SumOfSquares.sumOfSquares(inputList);
        assertEquals(expectedOutput, sumOfSquares);
    }
}
