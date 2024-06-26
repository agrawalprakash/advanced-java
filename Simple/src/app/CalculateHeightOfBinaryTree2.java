public class CalculateHeightOfBinaryTree2 {
    
    class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

    }

    public int maxDepth(TreeNode node) {

        if (node == null) {
            return 0;
        }

        return Math.max(maxDepth(node.left), maxDepth(node.right)) + 1;

    }

}
