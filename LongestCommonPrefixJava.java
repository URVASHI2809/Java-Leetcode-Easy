public class LongestCommonPrefixJava {
        public String longestCommonPrefix(String[] strs) {
            if (strs == null || strs.length == 0) {
                return "";
            }
            // Start with the first string as the initial prefix
            String prefix = strs[0];

            for (int i = 1; i < strs.length; i++) {
                // While the current string does not start with the prefix
                while (!strs[i].startsWith(prefix)) {
                    prefix = prefix.substring(0, prefix.length() - 1);
                    if (prefix.isEmpty()) {
                        return "";
                    }
                }
            }
            return prefix;
        }

        public static void main(String[] args) {
            LongestCommonPrefixJava lcp = new LongestCommonPrefixJava();

            // Test case 1
            String[] strs1 = {"flower", "flow", "flight"};
            System.out.println("Test case 1: " + lcp.longestCommonPrefix(strs1)); // Output: "fl"

            // Test case 2
            String[] strs2 = {"dog", "racecar", "car"};
            System.out.println("Test case 2: " + lcp.longestCommonPrefix(strs2)); // Output: ""
            
        }
}
