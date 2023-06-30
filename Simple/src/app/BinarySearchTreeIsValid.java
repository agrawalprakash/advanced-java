package app;

public class BinarySearchTreeIsValid {

    class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {

        }

        TreeNode (int val) {
            this.val = val;
        }

        TreeNode (int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

    }

    public boolean isValidBST (TreeNode root) {

            return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);

    }

    private boolean isValidBST(TreeNode node, long left, long right) {

          if (node == null) {
            return true;
          }

          if (left < node.val && node.val < right) {

                return isValidBST(node.left, left, node.val) && 
                        isValidBST(node.right, node.val, right);

          }

          return false;

    }
    
}
