public class FirstOccurence {
        public int strStr(String haystack, String needle) {
            int haystackLength = haystack.length();
            int needleLength = needle.length();

            if (needleLength == 0) {
                return 0;
            }

            if (needleLength > haystackLength) {
                return -1;
            }

            for (int i = 0; i <= haystackLength - needleLength; i++) {
                int j;
                for (j = 0; j < needleLength; j++) {
                    if (haystack.charAt(i + j) != needle.charAt(j)) {
                        break;
                    }
                }
                if (j == needleLength) {
                    return i;
                }
            }

            return -1;
        }

        public static void main(String[] args) {
            FirstOccurence firstOcc = new FirstOccurence();

            // Test case 1
            String haystack1 = "sadbutsad";
            String needle1 = "sad";
            int result1 = firstOcc.strStr(haystack1, needle1);
            System.out.println("Test case 1: " + result1); // Expected output: 0

            // Test case 2
            String haystack2 = "leetcode";
            String needle2 = "leeto";
            int result2 = firstOcc.strStr(haystack2, needle2);
            System.out.println("Test case 2: " + result2); // Expected output: -1
        }
}
