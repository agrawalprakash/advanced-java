public class PrintLeftNodeOfBinaryTree {

    class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;

        }

    }

    class BinaryTree {

        Node root;
        int max_level = 0;

        void leftView(Node node, int level) {
        
            if (node == null)
                return;

            if (max_level < level) {

                System.out.println(" " + node.data);
                max_level = level;

            }

            leftView(node.left, level + 1);
            leftView(node.right, level + 1);

        }

    }
    
}
