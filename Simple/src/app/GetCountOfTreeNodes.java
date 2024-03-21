public class GetCountOfTreeNodes {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() { }

        TreeNode (int val) {
            this.val = val;
        }

        TreeNode (int val, TreeNode left, TreeNode right) {

            this.val = val;
            this.left = left;
            this.right = right;

        }

    }

    class Solution {
        public int countNodes(TreeNode root) {
            
            return getNumberOfNodes(root);
            
        }
        
        private int getNumberOfNodes(TreeNode node) {
            
            if (node == null) return 0;
            
            return 1 + getNumberOfNodes(node.left) + getNumberOfNodes(node.right);
            
        }
    }


}
