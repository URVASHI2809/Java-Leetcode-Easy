//program to calculate the H-index of citations
//citation = {0,1,3,5,6}
//output 3
//LEETCODE 275 HINDEX II
public class HIndex {
    public static int hIndex(int[] citations) {
        int n = citations.length;

        for (int i = 0; i < n; i++) {
            int h = n - i;

            if (citations[i] >= h) {
                return h;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] citation = {0,1,3,5,6};
        int hvalue= hIndex(citation);
        System.out.println(hvalue);
    }
}
