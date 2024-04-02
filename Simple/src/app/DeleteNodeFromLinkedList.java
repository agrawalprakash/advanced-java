public class DeleteNodeFromLinkedList {

    class Node {

        int val;
        Node next;

        Node (int val) {

            this.val = val;

        }

    }

    public Node delete (Node root) {
        if (root == null || root.next == null) {
            return null;
        }

        Node tmp = root;

        while (tmp.next.next != null) {
            tmp = tmp.next;
        }

        tmp.next = null;

        return root;

    }    
}
