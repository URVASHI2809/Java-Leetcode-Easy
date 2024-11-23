// 6 5 4 5 3 1 6 5
//first more repeated no.
//single loop without additional array 


public class FirstMostFrequent{
   public static void main(String[] args) {
        int[] arr = {6, 5, 4, 5, 3, 1, 6, 5};
        int n = arr.length;
        int mostRepeatedNumber = arr[0];
        int maxCount = 1;

        for (int i = 0; i < n; i++) {
            int index = Math.abs(arr[i]) % n;
            arr[index] += n;

            int count = arr[index] / n;
            if (count > maxCount) {
                maxCount = count;
                mostRepeatedNumber = Math.abs(arr[i]);
            }
        }
        System.out.println("First most repeated number: " + mostRepeatedNumber);
    }
}
