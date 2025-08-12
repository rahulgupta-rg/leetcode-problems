// Last updated: 8/12/2025, 9:56:49 PM
class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        String output = "";
        for ( int i = 0 ; i < Math.min(s1.length(), s2.length()); i++ ) {
            if(s1.charAt(i)==s2.charAt(i)){
                output+=s1.charAt(i);
            } else {
                break;
            }
        }
        
        return output;
    }
}