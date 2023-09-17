package app;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversalP2 {

 
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

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> answer = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();

        if (root == null) return answer;

        queue.add(root);

        while (!queue.isEmpty()) {

            List<Integer> temp = new ArrayList<>();
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                
                if (queue.peek().left != null) queue.add(queue.peek().left);

                if (queue.peek().right != null) queue.add(queue.peek().right);

                temp.add(queue.poll().val);

            }

                answer.add(temp);

        }

        return answer;
        
    }

    
}
