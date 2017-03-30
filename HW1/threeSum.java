 public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        if(nums == null || nums.length < 3){
            return res;
        }
        
        Arrays.sort(nums);
        
        Set<List<Integer>> tmp = new HashSet<List<Integer>>();
        int i = 0;    
        
        // For each fixed pointer use two pointers looping through remain array
        while(i < nums.length-2){
            int left = i+1;
            int right = nums.length -1;
            int sum = 0 - nums[i];
            while(left < right){
                if(nums[left] + nums[right] == sum){
                    List<Integer> out = new ArrayList<Integer>();
                    out.add(nums[i]);
                    out.add(nums[left]);
                    out.add(nums[right]);
                    left++;
                    right--;
                    if(tmp.add(out)){
                        res.add(out);
                    }
                }
                else if(nums[left] + nums[right] < sum){
                    left++;
                }
                else{
                    right--;
                }
            }
            i++;
            // Deal with duplicated fixed number
            while(i < nums.length -2 && nums[i] == nums[i-1]){
                i++;
            }
        }
        
        return res;
        
        
    }