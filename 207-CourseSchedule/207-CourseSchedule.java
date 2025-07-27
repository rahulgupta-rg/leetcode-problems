// Last updated: 7/28/2025, 1:04:51 AM
class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        boolean result = false;
        int cnt = 0;
        Queue<Integer> qu = new LinkedList<>();
        //prepare adj list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0 ; i < numCourses;i++){
            adj.add(new ArrayList<>());
        }

        for(int i = 0 ; i < prerequisites.length;i++) {
            int rel[] = prerequisites[i];
            adj.get(rel[1]).add(rel[0]);
        }
        
        
        //find in degrees
        int[] indegrees = new int[numCourses];
        for(int i = 0 ; i < prerequisites.length;i++){
            indegrees[prerequisites[i][0]]++;
        }

        for(int i = 0 ; i < indegrees.length;i++){
            if(indegrees[i]==0) {
                qu.add(i);
            }
        }
        while(!qu.isEmpty()){
            int node = qu.remove();
            cnt++;
            for(int n : adj.get(node)){
                indegrees[n]--;
                if(indegrees[n]==0) {
                    qu.add(n);
                }
            }
        }
        if(cnt==numCourses) {
            return true;
        }
        return false;
    }
}