package app;

public class ADeleteFrontOfLinkedList {
    
    class Node {

        int val;
        Node next;

        Node (int val) {
            this.val = val;
        }

    }

    public Node adeleteFrontNode(Node root) {

        if (root == null) {
            return root;
        }

        return root.next;

    } 
}
