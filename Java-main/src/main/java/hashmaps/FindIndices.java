package hashmaps;

import java.util.HashMap;

public class FindIndices {

    public static int[] findTwoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }

        return new int[0]; // Return an empty array if no solution is found
    }

    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50, 60};
        int target = 100;

        int[] result = findTwoSum(nums, target);
        if (result.length == 2) {
            System.out.println("Indices of two numbers that add up to " + target + " are: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No two numbers found that add up to " + target);
        }
    }
}
