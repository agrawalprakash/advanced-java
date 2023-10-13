package app;

public class MergeTwoLinkedLists {
    
 public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode mergedList = new ListNode();
        
        if (list1 == null) {
            return list2;
        }
        
        if (list2 == null) {
            return list1;
        }
        
        ListNode answer = new ListNode();
        
        answer.next = mergedList;
        
        while (list1 != null && list2 != null && mergedList != null) {
            
            if (list1.val <= list2.val) {
                mergedList.val = list1.val;
                list1 = list1.next;
                mergedList.next =  new ListNode();
                mergedList = mergedList.next;
            } else if (list2.val < list1.val) {
                mergedList.val = list2.val;
                list2 = list2.next;
                mergedList.next =  new ListNode();
                mergedList = mergedList.next;
            }

        }
        
        while (list1 != null && mergedList != null) {
            mergedList.val = list1.val;
            list1 = list1.next;
            mergedList.next =  new ListNode();
            mergedList = mergedList.next;
        }
        
        while (list2 != null && mergedList != null) {
            mergedList.val = list2.val;
            list2 = list2.next;
            mergedList.next =  new ListNode();
            mergedList = mergedList.next;
        }
        
        return answer.next;
        
    }


}
