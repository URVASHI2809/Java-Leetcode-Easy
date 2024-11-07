public class ReverseString {
        public void reverseString(char[] s) {
            int left = 0;
            int right = s.length - 1;

            while (left < right) {
                char temp = s[left];
                s[left] = s[right];
                s[right] = temp;

                left++;
                right--;
            }
        }

        public static void main(String[] args) {
            ReverseString rs = new ReverseString();

            char[] s1 = {'h', 'e', 'l', 'l', 'o'};
            rs.reverseString(s1);
            System.out.println(java.util.Arrays.toString(s1)); // Output: [o, l, l, e, h]

            char[] s2 = {'H', 'a', 'n', 'n', 'a', 'h'};
            rs.reverseString(s2);
            System.out.println(java.util.Arrays.toString(s2)); // Output: [h, a, n, n, a, H]
        }
}
