public class PowerOfThreeDivisibilityCheck {
        public boolean isPowerOfThree(int n) {
            // The largest power of three that fits in a 32-bit signed integer
            int maxPowerOfThree = 1162261467;
            return n > 0 && maxPowerOfThree % n == 0;
        }

        public static void main(String[] args) {
            PowerOfThreeDivisibilityCheck divisibilityCheck = new PowerOfThreeDivisibilityCheck();
            System.out.println(divisibilityCheck.isPowerOfThree(27));  // Output: true
            System.out.println(divisibilityCheck.isPowerOfThree(0));   // Output: false
            System.out.println(divisibilityCheck.isPowerOfThree(-1));  // Output: false
        }
}
