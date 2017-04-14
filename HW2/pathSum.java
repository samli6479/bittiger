    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        
        // Base Data
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        // Corner case
        if(root == null){
            return new ArrayList<List<Integer>>();
        }
        
        
        help(root,sum, res, new ArrayList<Integer>());
        
        return res;
    }
    
    private void help(TreeNode root, int sum, List<List<Integer>> res, List<Integer> tmp){
        // Base case
        if(root == null){
            return;
        }
        
        tmp.add(root.val);
        
        if(root.left == null && root.right == null && sum == root.val){
            res.add(new ArrayList<Integer>(tmp));
        }
        
        
        help(root.left,sum-root.val,res,tmp);
        help(root.right,sum-root.val,res,tmp);
        tmp.remove(tmp.size()-1);
        
        
        
        
    }