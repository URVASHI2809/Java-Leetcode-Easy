class FindEvenNumbers {
    public int[] findEvenNumbers(int[] digits) {
        int[] freq = new int[10];
        for(int digit : digits)freq[digit]++;

        int[] available = new int[1000];

        int count = 0;
        for(int i = 100; i < 1000; i+=2){
            int[] required = new int[10];
            int num = i;
            while(num>0){
                required[num%10]++;
                num/=10;
            }
            boolean valid = true;
            for(int ind = 0; ind < 10; ind++){
                if(freq[ind]<required[ind])valid=false;
            }

            if(valid){ 
                available[i]=1;
                count++;
            }
        }
        int[] ans = new int[count];
        int ind = 0;
        for(int i = 100; i < 1000; i++ ){
            if(available[i]==1)ans[ind++] = i;
        }
        return ans;
    }
}
