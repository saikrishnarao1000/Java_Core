package LamdaFunctionsTest;

import LamdaFunctions.SortArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortArrayTest {

    SortArray sa = new SortArray();
    @Test
    public void testSorting() {
        String[] input1 = {"apple", "banana", "grape", "kiwi", "orange", "pear"};
        String[] expectedOutput1 = {"kiwi", "grape", "apple", "pear", "orange", "banana"};
        assertArrayEquals(expectedOutput1, sa.sortArray(input1));

        String[] input2 = {"cat", "dog", "elephant", "lion", "tiger", "zebra"};
        String[] expectedOutput2 = {"cat", "dog", "lion", "tiger", "zebra", "elephant"};
        assertArrayEquals(expectedOutput2, sa.sortArray(input2));

        String[] input3 = {"abcd", "efghi", "jklmn", "opqrs", "tuvwx", "yz"};
        String[] expectedOutput3 = {"yz", "abcd", "opqrs", "tuvwx", "efghi", "jklmn"};
        assertArrayEquals(expectedOutput3, sa.sortArray(input3));
    }
}
