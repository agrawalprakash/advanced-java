package app;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
 
class RightSideOfBinaryTree2 {
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> result = new ArrayList<>();
        
        Queue<TreeNode> queue = new LinkedList<>();
        
        queue.add(root);
        
        while (!queue.isEmpty() && root != null) {
            
            result.add(queue.peek().val);
            
            for (int i = queue.size(); i > 0; i--) {
                
                root = queue.poll();
                
                if (root.right != null) {
                    
                    queue.add(root.right);
                    
                }
                
                if (root.left != null) {
                    
                    queue.add(root.left);
                    
                }
                
            }
            
            
            
            
            
        }
        
        return result;
        
    }
}

