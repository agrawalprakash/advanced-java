public class PrintLinkedList {

    class Node {

        int val;
        Node next;

    }

    public void printList ( Node node ) {

        if ( node == null ) {
            return;
        }

        System.out.println(node.val + " ");

        printList(node.next);

    }
    
}
