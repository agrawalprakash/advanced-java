package app;

class Node {

    Node left;
    Node right;
    int data;

}

class BinaryTree {



    public int getSumOfNodes (Node node) {

            if (node == null) {
                return 0;
            }

            return node.data + getSumOfNodes(node.left) + getSumOfNodes(node.right);

    }

    public Node createNewNode (int val) {

        Node newNode = new Node();
        newNode.data = val;
        newNode.left = null;
        newNode.right = null;

        return newNode;

    }


    
}

public class SumOfNodesBinaryTree {

    public static void main(String[] args) {

        BinaryTree bt = new BinaryTree();

        Node root = bt.createNewNode(2);
        root.left = bt.createNewNode(7);
        root.right = bt.createNewNode(5);
        root.left.left = bt.createNewNode(2);
        root.left.right = bt.createNewNode(6);

        System.out.println("Total sum is " + bt.getSumOfNodes(root));

    }

}
