import java.util.HashMap;
import java.util.Map;

public class TwoSums {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> num_map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                if (num_map.containsKey(complement)) {
                    return new int[] {num_map.get(complement), i};
                }
                num_map.put(nums[i], i);
            }
            throw new IllegalArgumentException("No Match Found!!");
        }

        public static void main(String[] args) {
            TwoSums ts = new TwoSums();

            // Test case 1
            int[] nums1 = {2, 7, 11, 15};
            int target1 = 9;
            int[] result1 = ts.twoSum(nums1, target1);
            System.out.println("Indices: " + result1[0] + ", " + result1[1]); // Output: Indices: 0, 1

            // Test case 2
            int[] nums2 = {3, 2, 4};
            int target2 = 6;
            int[] result2 = ts.twoSum(nums2, target2);
            System.out.println("Indices: " + result2[0] + ", " + result2[1]); // Output: Indices: 1, 2

            // Test case 3
            int[] nums3 = {3, 3};
            int target3 = 6;
            int[] result3 = ts.twoSum(nums3, target3);
            System.out.println("Indices: " + result3[0] + ", " + result3[1]); // Output: Indices: 0, 1
        }
}
