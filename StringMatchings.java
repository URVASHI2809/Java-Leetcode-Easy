import java.util.*;

class StringMatchings {
    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();

        Arrays.sort(words, (a, b) -> a.length() - b.length());

        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];
            for (int j = i + 1; j < words.length; j++) {
                if (words[j].contains(currentWord)) {
                    result.add(currentWord);
                    break;
                }
            }
        }
        return result;
    }
}
