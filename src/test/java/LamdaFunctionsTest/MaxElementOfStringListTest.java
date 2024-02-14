package LamdaFunctionsTest;

import LamdaFunctions.MaxElementOfStringList;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static junit.framework.Assert.assertEquals;

public class MaxElementOfStringListTest {
    @Test
    public void testFindMaxElement() {
        List<String> stringList = Arrays.asList("apple", "banana", "orange", "grape", "pineapple");
        Optional<String> maxElement = MaxElementOfStringList.findMaxElement(stringList);
        assertEquals(Optional.of("pineapple"), maxElement);
    }

    @Test
    public void testFindMaxElement_EmptyList() {
        List<String> stringList = Arrays.asList();
        Optional<String> maxElement = MaxElementOfStringList.findMaxElement(stringList);
        assertEquals(Optional.empty(), maxElement);
    }

    @Test
    public void testFindMaxElement_SingleElement() {
        List<String> stringList = Arrays.asList("apple");
        Optional<String> maxElement = MaxElementOfStringList.findMaxElement(stringList);
        assertEquals(Optional.of("apple"), maxElement);
    }

    @Test
    public void testFindMaxElement_DuplicateMax() {
        List<String> stringList = Arrays.asList("apple", "banana", "orange", "grape", "banana", "pineapple");
        Optional<String> maxElement = MaxElementOfStringList.findMaxElement(stringList);
        assertEquals(Optional.of("pineapple"), maxElement);
    }
}
