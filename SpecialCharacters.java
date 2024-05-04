class SpecialCharacters {
    public int numberOfSpecialChars(String word) {
        Set<Character> temp = new HashSet<>();
        int out = 0;

        for(int i=0; i<word.length(); i++){
            String s = word.charAt(i) + "";
            String s1 = s.toLowerCase();
            if(s.equals(s1)){
                s1 = s.toUpperCase();
                if(temp.contains(s1.charAt(0)) && !temp.contains(s.charAt(0))){
                    out++;
                }
                temp.add(s.charAt(0));
            }else{
                if(temp.contains(s1.charAt(0)) && !temp.contains(s.charAt(0))){
                    out++;
                }
                temp.add(s.charAt(0));
            }
        }
        return out;
    }
}
