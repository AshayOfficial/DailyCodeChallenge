package practise.linkedList;

public class AddTwoNumbersII {
    public static int carry = 0;

    public static void main(String[] args) {
        int[] head1 = {0};
        int[] head2 = {1};
        ListNode headNode1 = ListNode.createListNode(head1);
        ListNode headNode2 = ListNode.createListNode(head2);
        ListNode add = addTwoNumbers(headNode1, headNode2);
        ListNode.printListNode(add);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {return getFinalListNode(l1, l2);}

    private static ListNode getFinalListNode(ListNode l1, ListNode l2){
        if(l1 != null || l2 != null){
            Integer ans = getAns(((l1 != null) ? l1.val : 0), ((l2 != null) ? l2.val : 0));
            return new ListNode(
                    ans,
                    getFinalListNode(
                            ((l1 != null) ? l1.next : null),
                            ((l2 != null) ? l2.next : null)
                    )
            );
        }else{
            return ((carry > 0) ? new ListNode(carry) : null);
        }
    }

    private static Integer getAns(Integer l1, Integer l2){
        Integer val = l1 + l2 + carry;
        if(val > 9){
            val = val - 10;
            carry = 1;
        }else{
            carry = 0;
        }
        return val;
    }
}