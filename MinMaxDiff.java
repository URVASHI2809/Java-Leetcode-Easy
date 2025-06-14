class MinMaxDiff {
    public int minMaxDifference(int num) {
        int len = 0;
        int temp = num;

        // Count number of digits
        while (temp > 0) {
            len++;
            temp /= 10;
        }

        temp = num;
        int[] max = new int[len];
        int[] min = new int[len];

        // Convert num to digit array (from left to right)
        for (int i = len - 1; i >= 0; i--) {
            int digit = temp % 10;
            max[i] = digit;
            min[i] = digit;
            temp /= 10;
        }

        // Find digit to replace for max (change to 9)
        int digitToReplaceMax = -1;
        for (int i = 0; i < len; i++) {
            if (max[i] != 9) {
                digitToReplaceMax = max[i];
                break;
            }
        }

        // Replace all occurrences with 9
        if (digitToReplaceMax != -1) {
            for (int i = 0; i < len; i++) {
                if (max[i] == digitToReplaceMax) {
                    max[i] = 9;
                }
            }
        }

        // Find digit to replace for min (change to 0)
        int digitToReplaceMin = -1;
        for (int i = 0; i < len; i++) {
            if (min[i] != 0) {
                digitToReplaceMin = min[i];
                break;
            }
        }

        // Replace all occurrences with 0
        if (digitToReplaceMin != -1) {
            for (int i = 0; i < len; i++) {
                if (min[i] == digitToReplaceMin) {
                    min[i] = 0;
                }
            }
        }

        // Convert digit arrays back to integers
        int maxVal = 0, minVal = 0;
        for (int i = 0; i < len; i++) {
            maxVal = maxVal * 10 + max[i];
            minVal = minVal * 10 + min[i];
        }

        return maxVal - minVal;
    }
}
