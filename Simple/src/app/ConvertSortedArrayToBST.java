package app;

public class ConvertSortedArrayToBST {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }

    public TreeNode sortedArrayToBST (int[] nums) {
        
        return createBST(nums, 0, nums.length - 1);

    }

    private TreeNode createBST(int[] nums, int left, int right) {

        if (left > right) return null;
       
        int mid = (right - left) / 2;

        TreeNode node = new TreeNode(nums[mid]);

        node.left = createBST(nums, left, mid - 1);
        node.right = createBST(nums, mid + 1, right);

        return node;

    }
    
}
