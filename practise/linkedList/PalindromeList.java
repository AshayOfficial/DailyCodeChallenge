package practise.linkedList;

public class PalindromeList {
    public static void main(String[] args) {
        int[] head = {1, 2, 2, 1};
        ListNode firstNode = null;
        Boolean isPalindrome;
        if (head == null)
            isPalindrome = isPalindrome(firstNode);
        else {
            ListNode headNode = ListNode.createListNode(head);
            isPalindrome = isPalindrome(headNode);
        }
        System.out.println(isPalindrome);
    }

    public static boolean isPalindrome(ListNode head) {
        StringBuilder no = convertTonumber(head);
        return no.toString().equals(no.reverse().toString());
    }

    private static StringBuilder convertTonumber(ListNode head) {
        StringBuilder s = new StringBuilder();
        while (head != null) {
            s.insert(0, head.val);
            head = head.next;
        }
        return s;
    }
}
