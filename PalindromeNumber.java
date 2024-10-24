public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        // Negative numbers are not palindromes
        if (x < 0) {
            return false;
        }

        // Numbers ending in zero (except zero itself) are not palindromes
        if (x != 0 && x % 10 == 0) {
            return false;
        }

        int original = x;
        int reversed = 0;

        // Reverse the integer
        while (x > 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        // Compare the reversed integer with the original integer
        return original == reversed;
    }

    public static void main(String[] args) {
        int x1 = 121;
        System.out.println(isPalindrome(x1)); // Output: true

        int x2 = -121;
        System.out.println(isPalindrome(x2)); // Output: false

        int x3 = 10;
        System.out.println(isPalindrome(x3)); // Output: false
    }
}
