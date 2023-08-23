package app;

public class CopyListWithRandomPointerPractice2 {


class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}



    public Node copyRandomList(Node head) {

        if (head == null) {
            return null;
        }

        Node current = head;

        // Insert a node between each original nodes
        while (current != null) {

            Node temp = current.next;

            current.next = new Node(current.val);

            current.next.next = temp;

            current = temp;

        }

        // Assign random pointer to each new inserted node

        current = head;

        while (current != null && current.next != null) {

            if (current.random != null) {

                current.next.random = current.random.next;

            }

            current = current.next.next;

        }

        // Separate the original and copy nodes of linked list

        Node original = head;
        Node copy = head.next;
        Node tempHead = copy;

        while (original != null) {

            original.next = original.next.next;

            if (copy.next != null)
                copy.next = copy.next.next;

            original = original.next;
            copy = copy.next;

        }

        return tempHead;
    }
    
}
