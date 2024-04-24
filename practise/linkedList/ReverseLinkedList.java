package practise.linkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        int[] head = {1,2,3,4,5};
        ListNode firstNode = null;
        ListNode listNode;
        if (head == null)
            listNode = reverseList(firstNode);
        else {
            ListNode headNode = ListNode.createListNode(head);
            listNode = reverseList2(headNode);
        }
        ListNode.printListNode(listNode);
    }

    public static ListNode reverseList(ListNode head) {
        if (head.next != null) {
            ListNode prevHead = new ListNode(head.val);
            head = head.next;
            ListNode listNode = reverseList(head);
            ListNode fHead = listNode;
            while (listNode.next != null) {
                head = listNode.next;
                listNode = listNode.next;
            }
            head.next = prevHead;
            return fHead;
        }
        else {
           return head;
        }
    }

    public static ListNode reverseList2(ListNode head){
        if (head == null || head.next == null) return head;
        ListNode newHead = reverseList2(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
