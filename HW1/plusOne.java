public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        for(int i = n-1; i > -1; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            else{
                digits[i] = 0;
            }
            
        }
        
        if(digits[0] == 0){
            digits = new int[digits.length+1];
            digits[0] = 1;
        }
        return digits;
        
        
        
    }