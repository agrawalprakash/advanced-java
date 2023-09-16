package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigZagTraversal {

 
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
 

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> answer = new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();

        boolean leftToRight = false;

        if (root == null) return answer;

        q.offer(root);

        while (!q.isEmpty()) {
            
            List<Integer> temp = new ArrayList<>();
            int qSize = q.size();

            for (int i = 0; i < qSize; i++) {
                
                if(q.peek().left != null) q.offer(q.peek().left);

                if(q.peek().right != null) q.offer(q.peek().right);

                temp.add(q.poll().val);
            }

            leftToRight = !leftToRight;

            if (leftToRight) {
                answer.add(temp);
            } else {
                Collections.reverse(temp);
                answer.add(temp);
            }

            

        }

        return answer;

    }


}
