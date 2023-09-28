class Solution {
    public int findCircleNum(int[][] isConnected) {
        
        int N = isConnected.length;
        
        UnionFind uf = new UnionFind(N);
        
        for (int i = 0; i < N; i++) {
            
            for (int j = 0; j < N; j++) {
                
                
                if (isConnected[i][j] == 1) {
                    uf.union(i, j);
                }
                
            }
            
            
        }
        
        return uf.numOfComponents;
        
    }
    
    class UnionFind {
        
        private int[] parents;
        private int[] size;
        int numOfComponents = 0;
        
        public UnionFind(int n) {
            
            parents = new int[n];
            size = new int[n];
            numOfComponents = n;
            
            for (int i = 0; i < parents.length; i++) {
                
                parents[i] = i;
                size[i] = 1;
                
            }
            
            
        }
        
        public int find(int curr) {
            
            int root = curr;
            
            while (root != parents[root]) {
                root = parents[root];
            }
            
            while (curr != root) {
                
                int preParent = parents[curr];
                parents[curr] = root;
                curr = preParent;
                
            }
            
            return root;
            
        }
        
        public void union(int node1, int node2) {
            
            int node1Parent = find(node1);
            int node2Parent = find(node2);
            
            if (node1Parent == node2Parent) {
                return;
            }
            
            if (size[node1Parent] > size[node2Parent]) {
                
                parents[node2Parent] = node1Parent;
                size[node1Parent] = size[node1Parent] + size[node2Parent];
                
            } else {
                
                parents[node1Parent] = node2Parent;
                size[node2Parent] += size[node1Parent];
                
            }
            
            numOfComponents--;
            
            
        }
        
        
    }
    
    
}