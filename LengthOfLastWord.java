//program to find the length of the last word in the given string
public class LengthOfLastWord {
        public int lengthOfLastWord(String s) {
            // Step 1: Trim the string to remove trailing spaces
            s = s.trim();

            // Step 2: Find the last space in the trimmed string
            int lastSpaceIndex = s.lastIndexOf(' ');

            // Step 3: The last word is the substring after the last space
            String lastWord = s.substring(lastSpaceIndex + 1);

            // Step 4: Return the length of the last word
            return lastWord.length();
        }

        public static void main(String[] args) {
            LengthOfLastWord solution = new LengthOfLastWord();
            
            // Example usage:
            System.out.println(solution.lengthOfLastWord("Hello World"));  // Output: 5
            System.out.println(solution.lengthOfLastWord("   fly me   to   the moon  "));  // Output: 4
            System.out.println(solution.lengthOfLastWord("luffy is still joyboy"));  // Output: 6
        }
}
