public class PowerOfThreeLogarithmic {
        public boolean isPowerOfThree(int n) {
            if (n <= 0) {
                return false;
            }
            double logResult = Math.log10(n) / Math.log10(3);
            return (logResult - (int) logResult) < 1e-10;
        }

        public static void main(String[] args) {
            PowerOfThreeLogarithmic pot = new PowerOfThreeLogarithmic();
            System.out.println(pot.isPowerOfThree(27));  // Output: true
            System.out.println(pot.isPowerOfThree(0));   // Output: false
            System.out.println(pot.isPowerOfThree(-1));  // Output: false
        }
}
