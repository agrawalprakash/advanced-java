package app;

public class CheckIfIsBipitrateGraph {

        int[] parents;
        public boolean isBipartite(int[][] graph) {
            
            parents = new int[graph.length];
    
            for (int i = 0; i < graph.length; i++) {
                parents[i] = i;
            }
    
            for (int i = 0; i < graph.length; i++) {
    
                for (int n : graph[i]) {
    
                    if (find(n) == find(i)) return false;
    
                    union(graph[i][0], n);
    
                }
    
            }
    
            return true;
            
        }
    
        private void union (int x, int y) {
    
            int parentX = find(x);
            int parentY = find(y);
    
            if (parentX != parentY) {
               parents[parentX] = parentY;
            }
    
        }
    
        private int find(int point) {
    
            if (parents[point] == point) return point;
    
            parents[point] = find(parents[point]);
    
            return parents[point];
    
        }
    
    
}
