package app;

import java.util.PriorityQueue;

public class MergeKSortedLists3 {
    
  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
    public ListNode mergeKLists(ListNode[] lists) {
        
            PriorityQueue<ListNode> pq = new PriorityQueue<>(
                (a, b) -> { return a.val - b.val; }
            );
                
            for (ListNode node: lists) {
                if (node != null) {
                    pq.add(node);
                }
            }
        
            ListNode dummy = new ListNode(-1);
        
            ListNode prev = dummy;
        
            while (!pq.isEmpty()) {
                
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
