// Last updated: 7/28/2025, 11:04:39 AM
class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        boolean[] visited = new boolean[n];
        boolean result = false;
        Queue<Integer> q = new LinkedList<>();
        //prepare adj list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(); 
        for(int i = 0 ; i < n ; i++) {
            adj.add(new ArrayList<>());
        }
        for(int i = 0 ; i < edges.length; i++) {
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        q.add(source);
        visited[source] = true;
        while(!q.isEmpty()) {
            int node = q.remove();
            for(int i : adj.get(node)) {
                if(!visited[i]) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
        
        return visited[destination];
        
    }
}