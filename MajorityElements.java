public class MajorityElements {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }

    public static void main(String[] args) {
        MajorityElements elements = new MajorityElements();
        int[] nums1 = {3, 2, 3};
        System.out.println(elements.majorityElement(nums1));  // Output: 3

        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(elements.majorityElement(nums2));  // Output: 2
    }
}
