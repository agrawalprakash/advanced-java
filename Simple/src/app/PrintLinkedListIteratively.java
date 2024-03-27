public class PrintLinkedListIteratively {
    
        class Node {

            int val;
            Node next;

        }

        public void printList (Node node) {

            if (node == null) {
                return;
            }

            while (node != null) {

                System.out.println(node.val + " ");

                node = node.next;

            }

        }

}
