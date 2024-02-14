package LamdaFunctionsTest;

import LamdaFunctions.StringFilter;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static junit.framework.Assert.assertEquals;

public class StringFilterTest {
    @Test
    public void testFilterStringsStartingWithA() {
        List<String> inputList = Arrays.asList("Apple", "Banana", "Ant", "Cat", "Apricot");

        Predicate<String> startsWithA = s -> s.startsWith("A");

        List<String> expectedOutput = Arrays.asList("Apple", "Ant", "Apricot");
        List<String> filteredList = StringFilter.filterStringsStartingWithA(inputList, startsWithA);

        assertEquals(expectedOutput, filteredList);
    }

    @Test
    public void testFilterStringsStartingWithA_EmptyList() {
        List<String> inputList = Arrays.asList();

        Predicate<String> startsWithA = s -> s.startsWith("A");

        List<String> expectedOutput = Arrays.asList();
        List<String> filteredList = StringFilter.filterStringsStartingWithA(inputList, startsWithA);

        assertEquals(expectedOutput, filteredList);
    }

    @Test
    public void testFilterStringsStartingWithA_NoMatch() {
        List<String> inputList = Arrays.asList("Banana", "Cat", "Dog");

        Predicate<String> startsWithA = s -> s.startsWith("A");

        List<String> expectedOutput = Arrays.asList();
        List<String> filteredList = StringFilter.filterStringsStartingWithA(inputList, startsWithA);

        assertEquals(expectedOutput, filteredList);
    }
}
