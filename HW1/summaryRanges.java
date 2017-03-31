    public List<String> summaryRanges(int[] nums) {
        
        List<String> res = new ArrayList<String>();
        
        // Corner case
        if(nums == null){
            return res;
        }
        
        
        
        for(int i = 0; i < nums.length;i++){
            int start = nums[i];
            
            while(i < nums.length-1 && nums[i]+1 == nums[i+1]){
                i++;    
            }
            if(start != nums[i]){
                StringBuilder out = new StringBuilder();
                out.append(start);
                out.append("-");
                out.append(">");
                out.append(nums[i]);
                res.add(out.toString());
            }
            else{
                StringBuilder out = new StringBuilder();
                out.append(nums[i]);
                res.add(out.toString());
            }
            
        }
        
        
        return res;
        
    }