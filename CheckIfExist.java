import java.util.HashSet;

public class CheckIfExist{
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(num * 2) || (num % 2 == 0 && set.contains(num / 2))) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        CheckIfExist check = new CheckIfExist();
        
        // Test cases
        System.out.println(check.checkIfExist(new int[]{10, 2, 5, 3})); // Output: true
        System.out.println(check.checkIfExist(new int[]{3, 1, 7, 11})); // Output: false
    }
}
