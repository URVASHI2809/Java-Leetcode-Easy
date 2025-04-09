class MinOperations {
    public int minOperations(int[] nums, int k) {
    boolean freq[] = new boolean[101];
    int ans = 0;
    int max = 1; 
    int min = 100;
    for(int x : nums)
    {
      freq[x] = true;
      max = Math.max(x, max); 
      min = Math.min(x, min); 
    }    
    if(min<k)
    return -1; 
    
    if(min == max && min == k)
    return 0;

    for(int i=max-1; i>0; i--)
    {
       if(freq[i]==true)
       ans++;     
    }
     return min==k ? ans : ans+1; 
    }
}
