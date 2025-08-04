// Last updated: 8/5/2025, 1:41:14 AM
class Solution {
    public int totalFruit(int[] fruits) {
        int l = 0;
        int r = 0;
        Map<Integer, Integer> freq = new HashMap<>();
        int max=0;
        while(r < fruits.length) {
            int cur = fruits[r];
            freq.put(cur, freq.getOrDefault(cur, 0)+1);
            while(freq.size() >= 3) {
                int occ = freq.get(fruits[l]);
                freq.put(fruits[l], occ-1);
                if(freq.get(fruits[l])==0){
                    freq.remove(fruits[l]);
                }
                l++;
                
            }
            max = Math.max(max, (r-l)+1);
            r++;
        }
        return max;
    }
}