public String countAndSay(int n) {
            StringBuilder cur = new StringBuilder("1");
            StringBuilder pre = new StringBuilder();
            
            int count;
            char say;
            // Looping through the sequence 
            for(int i =1; i < n; i++){
                pre = cur;
                cur = new StringBuilder();
                count = 1;
                say = pre.charAt(0);
                // Find the number and the count of number
                for(int j = 1; j < pre.length();j++){
                    if(pre.charAt(j)!=say){
                        cur.append(count);
                        cur.append(say);
                        count = 1;
                        say = pre.charAt(j);
                    }
                    else{
                        count++;
                    }
                }
                cur.append(count);
                cur.append(say);
            }
            return cur.toString();
    }