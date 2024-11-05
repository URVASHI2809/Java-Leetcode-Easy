public class RomanToInt {
        public int romanToInt(String s) {
            int[] values = new int[26];
            values['I' - 'A'] = 1;
            values['V' - 'A'] = 5;
            values['X' - 'A'] = 10;
            values['L' - 'A'] = 50;
            values['C' - 'A'] = 100;
            values['D' - 'A'] = 500;
            values['M' - 'A'] = 1000;

            int total = 0;
            int length = s.length();
            for (int i = 0; i < length; i++) {
                int currentValue = values[s.charAt(i) - 'A'];
                if (i + 1 < length && currentValue < values[s.charAt(i + 1) - 'A']) {
                    total -= currentValue;
                } else {
                    total += currentValue;
                }
            }
            return total;
        }

        public static void main(String[] args) {
            RomanToInt converter = new RomanToInt();
            System.out.println(converter.romanToInt("III"));     // Output: 3
            System.out.println(converter.romanToInt("LVIII"));   // Output: 58
            System.out.println(converter.romanToInt("MCMXCIV")); // Output: 1994
        }
}
