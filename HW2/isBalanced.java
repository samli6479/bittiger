public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        
        return help(root)!=-1;
        
    }
    
    
    private int help(TreeNode root){
        if(root == null){
            return 0;
        }
        
        int left = help(root.left);
        int right = help(root.right);
        
        if(left == -1 || right == -1){
            return -1;
        }
        
        if(left - right < -1 || right - left < -1){
            return -1;
        }
        
        
        
        return Math.max(left,right)+1;
    }