public class LinkedListInsertAtPosition {
    
    class Node {

        int val;
        Node next;

        Node (int val) {
            this.val = val;
        }

    }

    public Node insertAtPosition (int val, int position, Node node) {

        if (position < 1) {

            System.out.println("Position can't be less than 1");

            return node;

        }

        if (node == null && position > 1) {

            System.out.println("Position is greater than element exists");
            return node;

        }

        if (node == null && position == 1) {

            return new Node(val);

        }

        if (position == 1) {

            Node newNode = new Node(val);
            newNode.next = node;
            return newNode;

        }

        node.next = insertAtPosition( val, position-1, node.next);

        return node;

    }

}
