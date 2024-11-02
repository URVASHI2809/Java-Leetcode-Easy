public class PowerOfThreeIterativeDivision {
        public boolean isPowerOfThree(int n) {
            if (n <= 0) {
                return false;
            }
            while (n % 3 == 0) {
                n /= 3;
            }
            return n == 1;
        }

        public static void main(String[] args) {
            PowerOfThreeIterativeDivision iterativeDivision = new PowerOfThreeIterativeDivision();
            System.out.println(iterativeDivision.isPowerOfThree(27));  // Output: true
            System.out.println(iterativeDivision.isPowerOfThree(0));   // Output: false
            System.out.println(iterativeDivision.isPowerOfThree(-1));  // Output: false
        }
}
