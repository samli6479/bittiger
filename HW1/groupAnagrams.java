    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length < 1){
            return new ArrayList<List<String>>();
        }
        
        Map<String,List<String>> map = new HashMap<String, List<String>>();
        
        for(String str : strs){
            char[] tmp = str.toCharArray();
            
            Arrays.sort(tmp);
            
            String s = new String(tmp);
            
            if(map.get(s) == null){
                map.put(s,new ArrayList<String>());
            }
            map.get(s).add(str);
        }
        
        return new ArrayList<List<String>>(map.values()); 
        
    }