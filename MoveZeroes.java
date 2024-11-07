public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int index = 0;

        // First pass: move all non-zero elements to the front
        for (int num : nums) {
            if (num != 0) {
                nums[index++] = num;
            }
        }
        // Second pass: fill the rest of the array with zeros
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }

    public static void main(String[] args) {
        MoveZeroes mzeroes = new MoveZeroes();

        // Test case 1
        int[] nums1 = {0, 1, 0, 3, 12};
        System.out.println("Before: " + java.util.Arrays.toString(nums1));
        mzeroes.moveZeroes(nums1);
        System.out.println("After: " + java.util.Arrays.toString(nums1));

        // Test case 2
        int[] nums2 = {0};
        System.out.println("Before: " + java.util.Arrays.toString(nums2));
        mzeroes.moveZeroes(nums2);
        System.out.println("After: " + java.util.Arrays.toString(nums2));
    }
}
