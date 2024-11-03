public class RotateString {
        public boolean rotateString(String s, String goal) {
            // Check if lengths are different
            if (s.length() != goal.length()) {
                return false;
            }
            String concatenated = s + s;

            return concatenated.contains(goal);
        }

        public static void main(String[] args) {
            RotateString rs = new RotateString();

            // Test cases
            System.out.println(rs.rotateString("abcde", "cdeab")); // true
            System.out.println(rs.rotateString("abcde", "abced")); // false
        }
}
