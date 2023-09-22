package app;

public class GraphValidTree {

    public boolean validTree (int n, int[][] edges) {

        UnionFind unionFind = new UnionFind(n);

        for (int[] edge : edges) {

            if (!unionFind.union(edge[0], edge[1])) return false;

        }

        return unionFind.numOfComponents == 1;

    }

    class UnionFind {

        private int[] parents;
        private int[] size;
        private int numOfComponents;

        UnionFind(int n) {

            parents = new int[n];
            size = new int[n];
            numOfComponents = n;

            for (int i = 0; i < parents.length; i++) {
                parents[i] = i;
                size[i] = 1;
            }

        }

        public int find (int curr) {

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

        public boolean union(int node1, int node2) {

            int node1Parent = find(node1);
            int node2Parent = find(node2);

            if (node1Parent == node2Parent) {
                return false;
            }

            if (size[node1Parent] > size[node2Parent]) {

                parents[node2Parent] = node1Parent;
                size[node1Parent] = size[node1Parent] + size[node2Parent];

            } else {

                parents[node1Parent] = node2Parent;
                size[node2Parent] = size[node2Parent] + size[node1Parent];

            }

            numOfComponents--;
            return true;

        }

    }
    
}
