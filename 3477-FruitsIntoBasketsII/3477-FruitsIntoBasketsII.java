// Last updated: 8/5/2025, 10:08:58 AM
class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        boolean[] used = new boolean[baskets.length];
        int placed = 0;
        for(int i = 0 ; i<fruits.length;i++) {
            for(int j = 0; j < used.length; j++) {
                if((fruits[i] <=baskets[j]) && !used[j]){
                    placed++;
                    used[j]=true;
                    break;
                }
            }
        }
        return fruits.length - placed;
    }
}