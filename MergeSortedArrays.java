import java.util.Arrays;

public class MergeSortedArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Start from the end of both arrays
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        // Merge nums1 and nums2 from the end
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // If there are remaining elements in nums2, copy them
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        MergeSortedArrays merger = new MergeSortedArrays();

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        merger.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1)); // Output: [1, 2, 2, 3, 5, 6]

        int[] nums1_2 = {1};
        int m_2 = 1;
        int[] nums2_2 = {};
        int n_2 = 0;
        merger.merge(nums1_2, m_2, nums2_2, n_2);
        System.out.println(Arrays.toString(nums1_2)); // Output: [1]

        int[] nums1_3 = {0};
        int m_3 = 0;
        int[] nums2_3 = {1};
        int n_3 = 1;
        merger.merge(nums1_3, m_3, nums2_3, n_3);
        System.out.println(Arrays.toString(nums1_3)); // Output: [1]
    }
}
