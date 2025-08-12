// Last updated: 8/12/2025, 9:46:45 PM
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] hash = new int[26];
        for(int i = 0; i<magazine.length();i++){
            char c = magazine.charAt(i);
            hash[c-'a']=hash[c-'a']+1;
        }

        
        for(int i = 0; i<ransomNote.length();i++){
            char c = ransomNote.charAt(i);
            int currentValue = hash[c-'a'];
            if(currentValue<=0) {
                return false;    
            }
            hash[c-'a']=hash[c-'a']-1;
        }

        return true;

    }
}