package someSamplesTest;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapSortingTest {
    someSamplesTest.HashMapSorting hms = new someSamplesTest.HashMapSorting();
    @Test
    public void testHashMapSortingByKey() {
        // Create a HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Apple", 10);
        hashMap.put("Banana", 5);
        hashMap.put("Orange", 8);
        hashMap.put("Mango", 15);

        // Convert HashMap to TreeMap to sort it by keys
        Map<String, Integer> sortedMap = new TreeMap<>(hashMap);

        // Expected sorted order by keys
        Map<String, Integer> hashMap1 = new HashMap<>();
        hashMap1.put("Apple", 10);
        hashMap1.put("Banana", 5);
        hashMap1.put("Mango", 15);
        hashMap1.put("Orange", 8);

        // Verify the sorted map
        Assert.assertEquals(hashMap1.keySet(),hms.hashMapSorting(hashMap).keySet());

}
}
