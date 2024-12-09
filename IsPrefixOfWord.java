public class IsPrefixOfWord {
    public int isPrefixOfWord(String sentence, String searchWord) {
        // Split the sentence into words
        String[] words = sentence.split(" ");
        
        // Iterate over each word and check if it starts with searchWord
        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(searchWord)) {
                // Return 1-indexed position of the word
                return i + 1;
            }
        }
        // If no word matches, return -1
        return -1;
    }

    public static void main(String[] args) {
        IsPrefixOfWord prefix = new IsPrefixOfWord();
        
        // Test cases
        System.out.println(prefix.isPrefixOfWord("i love eating burger", "burg")); // Output: 4
        System.out.println(prefix.isPrefixOfWord("this problem is an easy problem", "pro")); // Output: 2
        System.out.println(prefix.isPrefixOfWord("i am tired", "you")); // Output: -1
    }
}
