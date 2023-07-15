package app;

import java.util.Stack;

public class AddTwoLinkedListNumbers {

    class ListNode {
        int val;
        ListNode next;

        ListNode() {

        }
        ListNode(int val) {
            this.val = val;
        }
        ListNode (int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

    }


    public ListNode addNumbers(ListNode list1, ListNode list2) {
        Stack<Integer> stack1 = convertListToStack(list1);
        Stack<Integer> stack2 = convertListToStack(list2);

        ListNode head = null;
        int carry = 0;

        while (!stack1.isEmpty() || !stack2.isEmpty() || carry != 0) {
            int sum = 0;
            if (!stack1.isEmpty()) sum = sum + stack1.pop();
            if (!stack2.isEmpty()) sum = sum + stack2.pop();
            sum = sum + carry;

            ListNode newNode = new ListNode(sum%10);

            carry = sum / 10;

            newNode.next = head;

            head = newNode;



        }

        return head;
        
    }

    private Stack convertListToStack(ListNode list) {

        Stack<Integer> s1 = new Stack<>();

        while (list != null) {

            s1.add(list.val);
            list = list.next;

        }

        return s1;

    }

    
}
