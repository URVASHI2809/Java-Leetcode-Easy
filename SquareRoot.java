//program to find the square root of a given number
public class SquareRoot {
        public int mySqrt(int x) {
            if(x < 2){
                return x;
            }
            int i =1;
            while(i <= x/i){
                i++;
            }
            return i-1;
        }

    public static void main(String[] args) {
        SquareRoot squareRoot = new SquareRoot();
        int x = 8;
        int result = squareRoot.mySqrt(x);
        System.out.println(result);
    }
    }

// time complexity -> O(sqrt(n)) bcoz we are using only one loop
// space complexity -> O(1) bcoz we are using only 1 variable
