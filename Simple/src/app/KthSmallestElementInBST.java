package app;

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
 
class KthSmallestElementInBST {
    
    int k = 0;
    int result = 0;
    
    public int kthSmallest(TreeNode root, int k) {
        
        this.k = k;
        
        inorderTraversal(root);
        
        return result;
        
        
    }
    
    public void inorderTraversal ( TreeNode node ) {
        
        
        if (node == null) return;
        
        inorderTraversal(node.left);
        
        if (--k == 0) {
            
            this.result = node.val;
            
            return;
            
        }
        
        inorderTraversal(node.right);
        
    }
}
