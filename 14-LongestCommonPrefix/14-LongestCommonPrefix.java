// Last updated: 8/12/2025, 9:57:43 PM
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0]; // Assume first string as prefix

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) { 
                prefix = prefix.substring(0, prefix.length() - 1); 
                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }
}