package app;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightSideOfBinaryTree {

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

    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> results = new ArrayList<>();

        if (root == null)) {
            return results;
        }

        Queue<TreeNode> qu = new LinkedList<>();

        qu.add(root);
        
        while (qu.size() > 0) {

            int count = qu.size();

            while(count-- > 0) {

                TreeNode node = qu.remove();

                if (count == 0) {
                    results.add(node.val);
                }

                if (node.left != null) {
                    qu.add(node.left);
                }

                if (node.right != null) {
                    qu.add(node.right);
                }

            }

        }

        return results;
        
    }
    
}
