public class MissingNumber {
        public static int findMissingNumber(int[] nums) {
            int n = nums.length;
            int expectedSum = n * (n + 1) / 2;
            int actualSum = 0;
            
            // Calculate the actual sum of the array elements
            for (int num : nums) {
                actualSum += num;
            }
            
            // The missing number is the difference between the expected sum and the actual sum
            return expectedSum - actualSum;
        }

        public static void main(String[] args) {
            int[] nums1 = {3, 0, 1};
            System.out.println(findMissingNumber(nums1)); // Output: 2

            int[] nums2 = {0, 1};
            System.out.println(findMissingNumber(nums2)); // Output: 2

            int[] nums3 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
            System.out.println(findMissingNumber(nums3)); // Output: 8
        }
}
