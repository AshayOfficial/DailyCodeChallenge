package practise.linkedList;

import static practise.linkedList.ListNode.createListNode;
import static practise.linkedList.ListNode.printListNode;

public class RemoveElement {
    public static void main(String[] args) {
        int[] head = {1, 2, 6, 3, 4, 5, 6};
        ListNode firstNode = null;
        ListNode listNode;
        if (head == null)
            listNode = removeElements(firstNode, 7);
        else {
            ListNode headNode = createListNode(head);
            listNode = removeElements(headNode, 6);
        }
        printListNode(listNode);
    }

    public static ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        if (head.val == val) return removeElements(head.next, val);
        else head.next = removeElements(head.next, val);
        return head;
    }
}
