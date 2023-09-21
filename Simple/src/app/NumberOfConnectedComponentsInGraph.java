package app;

public class NumberOfConnectedComponentsInGraph {

    public int countComponents(int n, int[][] edges) {

        UnionFind uu = new UnionFind(n);

        for (int[] edge : edges) {
            uu.union(edge[0], edge[1]);
        }

        return uu.numOfComponents;

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

                size[node2Parent] = size[node2Parent] + size[node1Parent];

            }

            numOfComponents--;

        }

    }
    
}
