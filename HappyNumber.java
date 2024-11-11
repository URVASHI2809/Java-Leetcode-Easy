public class HappyNumber {
        public boolean isHappy(int n) {
            int slow = n;
            int fast = getNext(n);

            while (fast != 1 && slow != fast) {
                slow = getNext(slow);
                fast = getNext(getNext(fast));
            }
            return fast == 1;
        }

        private int getNext(int n) {
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                n = n / 10;
                sum += digit * digit;
            }
            return sum;
        }

        public static void main(String[] args) {
            HappyNumber happyNumber = new HappyNumber();
            System.out.println(happyNumber.isHappy(19)); // Output: true
            System.out.println(happyNumber.isHappy(2));  // Output: false
        }
}
