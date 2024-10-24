public class BinaryAddition {

        public static String addBinary(String a, String b) {
            BigInteger num1 = new BigInteger(a, 2);
            BigInteger num2 = new BigInteger(b, 2);

            BigInteger sum = num1.add(num2);

            return sum.toString(2);
        }

        public static void main(String[] args) {
            String a = "11";
            String b = "1";
            System.out.println(addBinary(a, b)); // Output: "100"

            a = "1010";
            b = "1011";
            System.out.println(addBinary(a, b)); // Output: "10101"
        }
}
