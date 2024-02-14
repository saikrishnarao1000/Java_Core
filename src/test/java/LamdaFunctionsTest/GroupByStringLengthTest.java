package LamdaFunctionsTest;

import LamdaFunctions.GroupByStringLength;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static junit.framework.Assert.assertEquals;

public class GroupByStringLengthTest {

    @Test
    public void testGroupByLength_EmptyList() {
        List<String> inputList = Arrays.asList();
        Map<Integer, List<String>> groupedByLength = GroupByStringLength.groupByLength(inputList);

        assertEquals(0, groupedByLength.size());
    }

    @Test
    public void testGroupByLength_SingleElementList() {
        List<String> inputList = Arrays.asList("apple");
        Map<Integer, List<String>> groupedByLength = GroupByStringLength.groupByLength(inputList);

        assertEquals(1, groupedByLength.size());
        assertEquals(Arrays.asList("apple"), groupedByLength.get(5));
    }
}
