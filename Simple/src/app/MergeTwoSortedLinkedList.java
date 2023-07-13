package app;

public class MergeTwoSortedLinkedList {

class ListNode {

    int val;
    ListNode next;

    ListNode() { }
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

}

public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

    ListNode mergedList = new ListNode();

    ListNode head = mergedList;

    while (list1 != null && list2 != null) {

        if (list1.val <= list2.val) {

            mergedList.next = new ListNode(list1.val);
            list1 = list1.next;
            mergedList = mergedList.next;


        } else if (list2.val <= list1.val) {
            mergedList.next = new ListNode(list2.val);
            list2 = list2.next;
            mergedList = mergedList.next;
        }

    }

    if (list1 != null) {

        while (list1 != null) {
            mergedList.next = new ListNode(list1.val);
            mergedList = mergedList.next;
            list1 = list1.next;
        }

    }

    if (list2 != null) {
        while (list2 != null) {

            mergedList.next = new ListNode(list2.val);
            mergedList = mergedList.next;
            list2 = list2.next;

        }
    }


    return head.next;


}


}