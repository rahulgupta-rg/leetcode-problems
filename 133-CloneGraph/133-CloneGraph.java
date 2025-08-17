// Last updated: 8/17/2025, 10:06:52 AM
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node==null)
            return node;
        Map<Node,Node> map = new HashMap<>();
        Node clone = new Node(node.val);
        map.put(node, clone);
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()) 
        {
            Node cur = q.poll();
            for(Node adj : cur.neighbors) {
                if(!map.containsKey(adj)) {
                    map.put(adj, new Node(adj.val));
                    q.add(adj); 
                }
                map.get(cur).neighbors.add(map.get(adj));
                    
            }
        }
        return clone;
    }
}