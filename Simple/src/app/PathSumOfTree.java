package app;

import java.util.Stack;

public class PathSumOfTree {

    public class TreeNode {
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
    
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        if (root == null) return false;

        Stack<TreeNode> stackNodes = new Stack<>();
        Stack<Integer> stackSum = new Stack<>();

        stackNodes.add(root);
        stackSum.add(targetSum - root.val);

        while (!stackNodes.isEmpty()) {

            TreeNode node = stackNodes.pop();
            int currentSum = stackSum.pop();

            if (node.left == null && node.right == null && currentSum == 0) {
                return true;
            }

            if (node.left != null) {

                stackNodes.add(node.left);
                stackSum.add(currentSum - node.left.val);

            }

            if (node.right != null) {

                stackNodes.add(node.right);
                stackSum.add(currentSum - node.right.val);
            }
            

        }

        return false;


    }

}
