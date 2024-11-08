import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
        public List<List<String>> groupAnagrams(String[] str) {
            if (str == null || str.length == 0) return new ArrayList<>();

            Map<String, List<String>> map = new HashMap<>();

            for (String s : str) {
                char[] charArray = s.toCharArray();
                Arrays.sort(charArray);
                String key = new String(charArray);

                if (!map.containsKey(key)) {
                    map.put(key, new ArrayList<>());
                }
                map.get(key).add(s);
            }
            return new ArrayList<>(map.values());
        }

        public static void main(String[] args) {
            GroupAnagram ga = new GroupAnagram();
            String[] str1 = {"eat", "tea", "tan", "ate", "nat", "bat"};
            System.out.println(ga.groupAnagrams(str1)); // Output: [[eat, tea, ate], [tan, nat], [bat]]
        }
}
