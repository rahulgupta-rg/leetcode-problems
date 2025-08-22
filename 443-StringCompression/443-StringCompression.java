// Last updated: 8/22/2025, 11:41:03 PM
class Solution {
    public int compress(char[] chars) {
        //["a","a","b","b","c","c","c"]
        // [a,2,b,2,c,3] => 6
        /**
            ["a"] : ["a"] , 1

            ["a","b","b","b","b","b","b","b","b","b","b","b","b"] : ["a", "b","1","2" ]


        
         */


        int index = 0;
        int groupCount = 1;
        char ch = chars[0];
        for(int i = 1 ; i < chars.length;i++) {
            if(chars[i]==ch) {
                groupCount++;
            } else {
                chars[index] = ch;
                index++;
                if(groupCount>1) {
                    char[] count = String.valueOf(groupCount).toCharArray();
                    for(int j = 0 ; j < count.length ; j++) {
                        chars[index++]=count[j];
                    }
                }
                ch = chars[i];
                groupCount=1;
                
            }
        }
        chars[index] = ch;
        index++;
        if(groupCount>1) {
            char[] count = String.valueOf(groupCount).toCharArray();
            for(int j = 0 ; j < count.length ; j++) {
                chars[index++]=count[j];
            }
        }
        return index;
    }
}