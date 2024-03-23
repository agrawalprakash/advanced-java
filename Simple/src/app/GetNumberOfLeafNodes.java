public class GetNumberOfLeafNodes {

    class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() { }

        TreeNode (int val, TreeNode left, TreeNode right) {

            this.val = val;
            this.left = left;
            this.right = right;

        }

    }

    public int getNumberOfLeafNodes(TreeNode root) {

        return getNumberOfAllLeafNodes(root);
    }

    public int getNumberOfAllLeafNodes(TreeNode node) {

        if (node == null) return 0;

        if (node.left == null && node.right ==null) return 1;

        return getNumberOfAllLeafNodes(node.left) + getNumberOfAllLeafNodes(node.right);
    }
    
}
