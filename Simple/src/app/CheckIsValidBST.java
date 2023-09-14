package app;

public class CheckIsValidBST {

    class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {

        }
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {

            this.val = val;
            this.left = left;
            this.right = right;

        }

    }

    public boolean isValidBST(TreeNode root) {

        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
        
    }

    private boolean isValidBST(TreeNode root, long minVal, long maxVal) {

        if (root == null) return true;

        if (root.val <= minVal || root.val >= maxVal) return false;

        return isValidBST(root.left, minVal, root.val) &&  
               isValidBST(root.right, root.val, maxVal);

    }
    
}
