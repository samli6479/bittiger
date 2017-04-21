public int robII(int[] nums) {
        if(nums == null || nums.length < 1){
            return 0;
        }
        
        if(nums.length < 2){
            return nums[0];
        }
        
    	return Math.max(help(nums, 0, nums.length-2), help(nums, 1, nums.length-1));
}

public int help(int[] nums, int lo, int hi) {
    int preRob = 0, preNotRob = 0, rob = 0, notRob = 0;
    for (int i = lo; i <= hi; i++) {
      	rob = preNotRob + nums[i];
    	notRob = Math.max(preRob, preNotRob);
    	
    	preNotRob = notRob;
    	preRob = rob;
    }
    return Math.max(rob, notRob);
}