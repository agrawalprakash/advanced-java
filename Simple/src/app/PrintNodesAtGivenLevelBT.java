public class PrintNodesAtGivenLevelBT {

    class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }


    }
    
    public void printNodeAtGivenLevel(TreeNode root, int level) {

        if ( root == null ) {
            return;
        }

        if (level == 1) {

            System.out.println( root.val + " ");
            return;
        }

        printNodeAtGivenLevel(root.left, level - 1);
        printNodeAtGivenLevel(root.right, level - 1);

    }

}
