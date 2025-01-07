class StringMatching {
    public List<String> stringMatching(String[] words) {
        String str = String.join(" ", words);
        List<String> result = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            if(str.indexOf(words[i]) != str.lastIndexOf(words[i])){
                result.add(words[i]);
            }
        }
        return result;
    }
}
