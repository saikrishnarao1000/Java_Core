package LamdaFunctionsTest;

import org.junit.jupiter.api.Test;
import LamdaFunctions.RemoveDuplicates;

import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.assertEquals;

public class RemoveDuplicatesTest {
    @Test
    public void testRemoveDuplicates() {
        List<Integer> inputList = Arrays.asList(1, 2, 3, 2, 4, 5, 4, 6, 7, 8, 7, 9, 10);
        List<Integer> expectedOutput = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> uniqueList = RemoveDuplicates.removeDuplicates(inputList);
        assertEquals(expectedOutput, uniqueList);
    }

    @Test
    public void testRemoveDuplicates_EmptyList() {
        List<Integer> inputList = Arrays.asList();
        List<Integer> expectedOutput = Arrays.asList();
        List<Integer> uniqueList = RemoveDuplicates.removeDuplicates(inputList);
        assertEquals(expectedOutput, uniqueList);
    }

    @Test
    public void testRemoveDuplicates_AllDuplicates() {
        List<Integer> inputList = Arrays.asList(1, 1, 1, 1, 1);
        List<Integer> expectedOutput = Arrays.asList(1);
        List<Integer> uniqueList = RemoveDuplicates.removeDuplicates(inputList);
        assertEquals(expectedOutput, uniqueList);
    }

    @Test
    public void testRemoveDuplicates_NoDuplicates() {
        List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expectedOutput = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> uniqueList = RemoveDuplicates.removeDuplicates(inputList);
        assertEquals(expectedOutput, uniqueList);
    }
}
