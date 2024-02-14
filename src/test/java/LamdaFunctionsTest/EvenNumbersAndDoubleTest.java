package LamdaFunctionsTest;

import LamdaFunctions.EvenNumbersAndDouble;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.assertEquals;

public class EvenNumbersAndDoubleTest {
    @Test
    public void testFilterEvenNumbers() {
        List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> expectedOutput = Arrays.asList(2, 4, 6, 8, 10);
        List<Integer> filteredList = EvenNumbersAndDouble.filterEvenNumbers(inputList);
        assertEquals(expectedOutput, filteredList);
    }

    @Test
    public void testDoubleNumbers() {
        List<Integer> inputList = Arrays.asList(2, 4, 6, 8, 10);
        List<Integer> expectedOutput = Arrays.asList(4, 8, 12, 16, 20);
        List<Integer> doubledList = EvenNumbersAndDouble.doubleNumbers(inputList);
        assertEquals(expectedOutput, doubledList);
    }
}
