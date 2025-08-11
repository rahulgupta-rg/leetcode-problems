// Last updated: 8/11/2025, 11:27:50 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
    
        Map<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int start=0;
        
        for(int i=0;i<s.length();i++){
            Character c = (Character)s.charAt(i);
            if(map.containsKey(c)){
                start = Math.max(start,map.get(c)+1);
            } 
                map.put(c, i);
                maxLength = Math.max(maxLength, i-start+1);
            
        }
        return maxLength;
    }
}