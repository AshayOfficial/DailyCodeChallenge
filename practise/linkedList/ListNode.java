package practise.linkedList;

import java.util.ArrayList;
import java.util.List;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode driverMethodLinkedList(Integer val, ListNode next) {
        if (val != null && next != null)
            return new ListNode(val, next);
        else if (val != null)
            return new ListNode(val);
        else return new ListNode();
    }

    public static ListNode createListNode(int[] arr) {
        ListNode firstNode = new ListNode(0);
        ListNode secondNode = new ListNode(arr[0]);
        firstNode.next = secondNode;
        int i = 1;
        while (i < arr.length) {
            ListNode newNode = new ListNode(arr[i]);
            secondNode.next = newNode;
            secondNode = newNode;
            i++;
        }
        System.out.println(firstNode);
        return firstNode.next;
    }

    public static void printListNode(ListNode listNode) {
        List<Integer> nodeList = new ArrayList<>();
        while (listNode != null) {
            nodeList.add(listNode.val);
            listNode = listNode.next;
        }
        System.out.println(nodeList);
    }
}
