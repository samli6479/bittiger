    public int maxSubArray(int[] nums) {
        // Corner case 
        if (nums == null || nums.length == 0){
            return Integer.MIN_VALUE;
        }
        
        int sum = nums[0];
        int max = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            sum = Math.max(sum+nums[i], nums[i]);
            max = Math.max(sum,max);
        }
        return max;
    }