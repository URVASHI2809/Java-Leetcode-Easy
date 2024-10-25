public class RemoveElements {
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            if (nums[left] == val) {
                nums[left] = nums[right];
                right--;
            } else {
                left++;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        RemoveElements removeElements = new RemoveElements();

        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        int k1 = removeElements.removeElement(nums1, val1);
        System.out.println("Output: " + k1 + ", nums = " + java.util.Arrays.toString(nums1));

        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val2 = 2;
        int k2 = removeElements.removeElement(nums2, val2);
        System.out.println("Output: " + k2 + ", nums = " + java.util.Arrays.toString(nums2));
    }
}
