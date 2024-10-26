public class SearchInsertPosition {
        public int searchInsert(int[] nums, int target) {
            int n = nums.length;
            int ans = n ;
            int low = 0, high = n-1;

            while(low <= high){
                int mid = (low + high)/2;
                if(nums[mid] >= target){
                    high = mid -1;
                    ans = mid;
                }else{
                    low = mid + 1;
                }
            }
            return ans;
        }

    public static void main(String[] args) {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int[] nums = {1,3,5,6};
        int target = 5;
        int result = searchInsertPosition.searchInsert(nums, target);
        System.out.println(result);
    }
}
