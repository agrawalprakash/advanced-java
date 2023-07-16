package app;

import java.util.Map;

public class CopyListWithRandomPointer {
    
    class ListNode {
        int val;
        ListNode next;
        ListNode random;
        ListNode() {

        }
        ListNode(int val) {
            this.val = val;
        }
        ListNode (int val, ListNode next, ListNode random) {
            this.val = val;
            this.next = next;
            this.random = random;
        }
    }

    public ListNode copyRandomList(ListNode head) {

        if (head == null) {
            return null;
        }

        Map<ListNode, ListNode> map = new HashMap<>();

        ListNode temp  = head;

        while (temp != null) {
            map.put(temp, new ListNode(temp.val));
            temp = temp.next;
        }

        for (ListNode node : map.keySet()) {

            ListNode keyNode = map.get(node);
            keyNode.next = map.get(node.next);
            keyNode.random = map.get(node.random);
        }

        return map.get(head);

    }


}
