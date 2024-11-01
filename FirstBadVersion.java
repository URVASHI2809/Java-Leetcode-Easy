public class FirstBadVersion {
        // Mock API for demonstration purposes
        private boolean isBadVersion(int version) {
            // This should be implemented by the system
            return version >= 4; // Example: version 4 and onwards are bad
        }

        public int firstBadVersion(int n) {
            int left = 1;
            int right = n;

            while (left < right) {
                int mid = left + (right - left) / 2; // Prevents overflow
                if (isBadVersion(mid)) {
                    right = mid; // Look on the left side including mid
                } else {
                    left = mid + 1; // Look on the right side excluding mid
                }
            }

            return left; // or right, since left == right
        }

        public static void main(String[] args) {
            FirstBadVersion solution = new FirstBadVersion();
            int n = 5;
            System.out.println("First bad version: " + solution.firstBadVersion(n)); // Output: 4
        }
}
