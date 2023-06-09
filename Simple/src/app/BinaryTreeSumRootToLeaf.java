package app;



class BinaryTreeSumRootToLeaf {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
           this.val = val;
           this.left = left;
           this.right = right;
         }
        }

    int total;
 
    public int sumNumbers(TreeNode root) {
        
            total = 0;
            helper(root, 0);
            return total;
    }

    private void helper (TreeNode root, int sum) {

        if (root == null) {
            return;
        }

        sum = sum*10 + root.val;

        if (root.left == null && root.right == null) {
            total = total + sum;
            sum = 0;
        }

        helper(root.left, sum);
        helper(root.right, sum);
    }

}