    public String longestCommonPrefix(String[] strs) {
        // Corner case
        if(strs.length < 1){
            return "";
        }
        
        // Looping through all the elements
        String pre = strs[0];
        StringBuilder out = new StringBuilder();
        int min = Integer.MAX_VALUE;
        for(String str : strs){
            min = Math.min(min,str.length());
        }
        
        for(int i = 0; i < min; i++){
            char s = pre.charAt(i);
            for(int j = 1; j < strs.length; j++){
                if(strs[j].charAt(i) != s){
                    return out.toString();
                }
            }
            out.append(s);
        }
        return out.toString();
    }