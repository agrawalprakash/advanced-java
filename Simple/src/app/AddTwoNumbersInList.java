package app;

import java.util.Stack;

public class AddTwoNumbersInList {


    class Node {
        int val;
        Node next;

        Node() {

        }

        Node (int val) {
            this.val = val;

        }

        Node (int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public Node addTwoNumbers (Node list1, Node list2) {

        Stack<Integer> stack1 = convertListToStack(list1);

        Stack<Integer> stack2 = convertListToStack(list2);

        int sum = 0;

        Node head = null;

        int carry = 0;

        while (!stack1.isEmpty() || !stack2.isEmpty() || carry != 0) {

            sum = carry;

            if (!stack1.isEmpty()) sum += stack1.pop();

            if (!stack2.isEmpty()) sum += stack2.pop();

            Node newNode = new Node(sum % 10);

            newNode.next = head;

            head = newNode;

            carry = sum / 10;

        }

        return head;

    }

    private Stack<Integer> convertListToStack(Node list) {

           Stack<Integer> stack1 = new Stack<>();
           
           while (list != null) {

                stack1.add(list.val);
                list = list.next;

           }

           return stack1;

    }
    
}
