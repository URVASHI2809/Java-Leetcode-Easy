public class BinarySearch {
    static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {9, 8, 7, 6, 5, 4, 2, 1};
        int target = 9;

        int result = binarySearch(arr, target);
        if (result != -1) {
            System.out.println(result);
        } else {
            System.out.println("Not found");
        }
    }
}
