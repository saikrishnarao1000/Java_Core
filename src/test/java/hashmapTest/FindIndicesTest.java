package hashmapTest;

import hashmaps.FindIndices;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FindIndicesTest {

    @Test
    void testFindTwoSum() {
        int[] nums1 = {10, 20, 30, 40, 50, 60};
        int target1 = 100;
        assertArrayEquals(new int[]{3, 5}, FindIndices.findTwoSum(nums1, target1));

        int[] nums2 = {2, 7, 11, 15};
        int target2 = 9;
        assertArrayEquals(new int[]{0, 1}, FindIndices.findTwoSum(nums2, target2));

        int[] nums3 = {3, 2, 4};
        int target3 = 6;
        assertArrayEquals(new int[]{1, 2}, FindIndices.findTwoSum(nums3, target3));

        int[] nums4 = {3, 3};
        int target4 = 6;
        assertArrayEquals(new int[]{0, 1}, FindIndices.findTwoSum(nums4, target4));

        int[] nums5 = {1, 2, 3, 4, 5};
        int target5 = 9;
        assertArrayEquals(new int[]{3, 4}, FindIndices.findTwoSum(nums5, target5));

        int[] nums6 = {1, 2, 3, 4, 5};
        int target6 = 10;
        assertArrayEquals(new int[0], FindIndices.findTwoSum(nums6, target6)); // No solution
    }
}
