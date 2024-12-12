import java.util.*;

public class PickGifts {
    public long pickGifts(int[] g, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int val : g)
            maxHeap.add(val);

        for (int i = 0; i < k && maxHeap.peek() > 1; i++) {
            int x = maxHeap.poll();
            maxHeap.add((int) Math.sqrt(x));
        }

        long sum = 0;
        for (int val : maxHeap)
            sum += val;
        return sum;
    }

    public static void main(String[] args) {
        PickGifts gift = new PickGifts();

        // Example 1: Random array and k value
        int[] gifts = {25, 64, 9, 16};
        int k = 4;
        long result = gift.pickGifts(gifts, k);
        System.out.println("The total sum of gift values after " + k + " operations is: " + result);
    }
}
