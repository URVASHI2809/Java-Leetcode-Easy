class IsArraySpecial {
    public boolean isArraySpecial(int[] nums) {
     int lengthOfNum= nums.length;
     for(int i=0; i<lengthOfNum -1; i++){
       if((nums[i]%2 == 0 && nums[i+1]% 2 != 0) || (nums[i] % 2 !=0 && nums[i+1]% 2 == 0)){
        continue;
       } else {
        return false;
       }
     }   
     return true;
    }
}
