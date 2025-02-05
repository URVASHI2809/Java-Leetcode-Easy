class AreAlmostEqual {
    public boolean areAlmostEqual(String s1, String s2) {
        int count = 0;
        char first_diff_s1 = ' ';
        char first_diff_s2 = ' ';
        boolean is_valid = false;
        if(s1.length()!=s2.length()) return false;
        if(s1.equals(s2)) return true;
       for(int i=0; i< s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                if(count == 0){
                    first_diff_s1 = s1.charAt(i);
                    first_diff_s2 = s2.charAt(i);
                }
                if(count == 1){
                    if((first_diff_s1 == s2.charAt(i)) && (first_diff_s2 == s1.charAt(i)))
                        is_valid = true;
                }
                count = count + 1;
            }
       }
       return (is_valid && (count == 2)) ? true : false;
    }
}
