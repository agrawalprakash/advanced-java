package app;

import java.util.PriorityQueue;

public class MergeKSortedLinkedLists {

  class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }
 

    public ListNode mergeKLists(ListNode[] lists) {
        
            PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> {
                return a.val - b.val;
            });

            for (ListNode l : lists) {
                if (l != null) {
                    pq.add(l);
                }
            }

            ListNode dummy = new ListNode(-1);
            ListNode prev = dummy;

            while (pq.size() != 0) {

                ListNode node = pq.remove();

                prev.next = node;
                prev = prev.next;
                node = node.next;
                
                if (node != null) {
                    pq.add(node);
                }

            }


            return dummy.next;

    }

    
}
