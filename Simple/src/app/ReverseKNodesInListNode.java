package app;

public class ReverseKNodesInListNode {

    class ListNode {

        int val;
        ListNode next;

        ListNode() {

        }

        ListNode (int val) {
            this.val = val;
        }

        ListNode (int val, ListNode next) {
            this.val = val;
            this.next = next;        
        }


    }

    ListNode th = null;
    ListNode tt = null;

    private int getLength(ListNode node) {

        ListNode curr = node;
        int length = 0;

        while (curr != null) {
            curr = curr.next;
            length++;
        }

        return length;

    }

    private void addFirstNode(ListNode node) {

        if (th == null) {
            th = node;
            tt = node;
        } else {
            node.next = th;
            th = node;
        }


    }

    public ListNode reverseKGroup(ListNode head, int k) {


        if (head == null || head.next == null || k == 0) {
            return head;
        }

        int length = getLength(head);
        ListNode oh = null;
        ListNode ot = null;
        ListNode curr = head;
        while (length >= k) {

            int tempK = k;

            while (tempK-- > 0) {

                ListNode forward = curr.next;
                curr.next = null;
                addFirstNode(curr);
                curr = forward;

            }

            if (oh == null) {
                oh = th;
                ot = tt;
            } else {
                ot.next = th;
                ot = tt;
            }

            th = null;
            tt = null;

            length = length - k;

        }

        ot.next = curr;

        return oh;

    }
    
}
