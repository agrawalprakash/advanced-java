package app;

class Node {

    Node next;
    int data;
    Node (Node next, int data) {
        this.next = next;
        this.data = data;
    }

}

public class DetectAndRemoveLoopInList {
    
    public void detectAndRemoveLoopPresent(Node head) {

        if (head == null) return;

        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow.data == fast.data) break;

        }

        if (slow == fast) {

             if (fast == head) {

                while (slow.next != fast) {
                    slow = slow.next;
                }
                slow.next = null;

             }  else {

                slow = head;

                while (slow.next != fast.next) {

                    slow = slow.next;

                }
                fast.next = null;
             }
             
             return;

        }

    }


}
