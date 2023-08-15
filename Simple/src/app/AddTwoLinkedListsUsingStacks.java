package app;

import java.util.Stack;

public class AddTwoLinkedListsUsingStacks {

    class ListNode {

        int val;
        ListNode next;
        
        ListNode(int val) {
            this.val = val;
        }

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        Stack<Integer> stack1 = convertListToStack(l1);
        Stack<Integer> stack2 = convertListToStack(l2);

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

        return head;

    }

    private Stack<Integer> convertListToStack(ListNode list1) {

            Stack<Integer> stack = new Stack<>();

            while (list1 != null) {

                stack.add(list1.val);
                list1 = list1.next;

            }

            return stack;

    }
    
}
