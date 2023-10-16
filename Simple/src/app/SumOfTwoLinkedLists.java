import java.util.Stack;

public class SumOfTwoLinkedLists {
    

 public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode rl1 = reverseList(l1);
        ListNode rl2 = reverseList(l2);

        Stack<Integer> stack1 = convertListToStack(rl1);
        Stack<Integer> stack2 = convertListToStack(rl2);
                

        ListNode head = null;

        
        int carry = 0;

        while (!stack1.isEmpty() || !stack2.isEmpty() || carry != 0) {

            int sum = carry;

            if (!stack1.isEmpty()) { sum += stack1.pop(); }
            if (!stack2.isEmpty()) { sum += stack2.pop(); }

            ListNode node1 = new ListNode(sum%10);
            carry = sum / 10;

            node1.next = head;
            head = node1;

        }

        return reverseList(head);

    }

    private Stack<Integer> convertListToStack(ListNode list1) {

            Stack<Integer> stack = new Stack<>();

            while (list1 != null) {

                stack.add(list1.val);
                list1 = list1.next;

            }

            return stack;

    }
    
    private ListNode reverseList(ListNode head) {
        
                
        ListNode curr = head;
        ListNode prev = null;
        
        while (curr != null) {
            
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
            
        }
        
        return prev;
        
        
    }


}
