class DifferenceOfSums {
    public int differenceOfSums(int n, int m) {
        int val = (n*(n+1))/2;
        if(m==1)
            return -val;
        else if(m>n)
            return val;
        else{
            int sum = 0;
            for(int i=m;i<=n;i+=m){
                sum+=i;
            }
            return val-(2*sum);
        }
    }
}
