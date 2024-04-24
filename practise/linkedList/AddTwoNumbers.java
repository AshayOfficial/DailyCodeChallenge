package practise.linkedList;

import java.security.PublicKey;
import java.util.Objects;

public class AddTwoNumbers {
    public static int carry = 0;

    public static void main(String[] args) {
        int[] head1 = {9,9,9,9,9,9,9};
        int[] head2 = {9,9,9,9};
        ListNode headNode1 = ListNode.createListNode(head1);
        ListNode headNode2 = ListNode.createListNode(head2);
        ListNode add = addTwoNumbers(headNode1, headNode2);
        ListNode.printListNode(add);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int ans;
        if (l1 != null && l2 != null) {
            ans = carry + l1.val + l2.val;
            if (ans > 9) {
                ans -= 10;
                carry = 1;
            } else carry = 0;
        } else if (l1 == null && l2 == null)
            return null;
        else ans = Objects.requireNonNullElse(l1, l2).val + carry;

        ListNode currHead;
        if (l1 == null) currHead = addTwoNumbers(null, l2.next);
        else if (l2 == null) currHead = addTwoNumbers(l1.next, null);
        else currHead = addTwoNumbers(l1.next, l2.next);

        if (ans > 9) {
            ans -= 10;
            carry = 1;
        }
        ListNode finalHead = new ListNode(ans);
        if (currHead == null) {
            ListNode carryNode = null;
            if (ans > 9) {
                ans -= 10;
                carryNode = new ListNode(1);
            }
            return new ListNode(ans, carryNode);
        }
        else {
            finalHead.next = currHead;
        }
        if (carry > 0) {
            if (finalHead.next.next != null)
                return new ListNode(finalHead.val, finalHead.next);
//            finalHead.next.next = new ListNode(carry);
            carry = 0;
        }
        carry = 0;
        return finalHead;
    }

// -----------------------NA solution---------------
//    carry as static soln
    /*public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int ans;
        if (l1 != null && l2 != null) {
            ans = carry + l1.val + l2.val;
            if (ans > 9) {
                ans -= 10;
                carry = 1;
            } else carry = 0;
        } else if (l1 == null && l2 == null)
            return null;
        else if (l1 != null)
            ans = l1.val + carry;
        else
            ans = l2.val + carry;

        ListNode currHead;
        if (l1 == null) currHead = addTwoNumbers(null, l2.next);
        else if (l2 == null) currHead = addTwoNumbers(l1.next, null);
        else currHead = addTwoNumbers(l1.next, l2.next);

        if (ans > 9) {
            ans -= 10;
            carry = 1;
        }
        ListNode finalHead = new ListNode(ans);
        if (currHead == null) {
            ListNode carryNode = null;
            if (ans > 9) {
                ans -= 10;
                carryNode = new ListNode(1);
            }
            return new ListNode(ans, carryNode);
        }
        else {
            finalHead.next = currHead;
        }
        if (carry > 0) {
            if (finalHead.next != null && finalHead.next.next != null)
                return new ListNode(finalHead.val, finalHead.next);
            finalHead.next.next = new ListNode(carry);
            carry = 0;
        }
        return finalHead;
    }*/

    // ----------------------NA solution--------------------------
    // carry as non-static method
    /*int carry = 0;
        int ans = 0;
        if (l1 != null && l2 != null) {
            ans = carry + l1.val + l2.val;
            if (ans > 9) {
                ans -= 10;
                carry = 1;
            } else carry = 0;
        } else if (l1 == null && l2 == null)
            return null;
        else if (l1 != null)
            ans = l1.val + carry;
        else
            ans = l2.val + carry;

        ListNode currHead;
        if (l1 == null) currHead = addTwoNumbers(null, l2.next);
        else if (l2 == null) currHead = addTwoNumbers(l1.next, null);
        else currHead = addTwoNumbers(l1.next, l2.next);

        if (ans > 9) {
            ans -= 10;
            carry = 1;
        }
        ListNode finalHead = new ListNode(ans);
        if (currHead == null) {
            ListNode carryNode = null;
            if (ans > 9) {
                ans -= 10;
                carryNode = new ListNode(1);
            }
            return new ListNode(ans, carryNode);
        }
        else {
            finalHead.next = currHead;
        }
        if (carry > 0) {
            if (finalHead.next != null && finalHead.next.next != null)
                return new ListNode(finalHead.val, finalHead.next);
            finalHead.next.next = new ListNode(carry);
            carry = 0;
        }
        return finalHead;*/

    // --------------------NA Solution-----------------------
    // carry as a method parameter
    /*private ListNode addTwoNumbers(ListNode l1, ListNode l2, int carry) {
        int ans;
        if (l1 != null && l2 != null) {
            ans = carry + l1.val + l2.val;
            if (ans > 9) {
                ans -= 10;
                carry = 1;
            } else carry = 0;
        } else if (l1 == null && l2 == null)
            return null;
        else if (l1 != null)
            ans = l1.val + carry;
        else
            ans = l2.val + carry;

        ListNode currHead;
        if (l1 == null) currHead = addTwoNumbers(null, l2.next, carry);
        else if (l2 == null) currHead = addTwoNumbers(l1.next, null, carry);
        else currHead = addTwoNumbers(l1.next, l2.next, carry);

        ListNode finalHead = new ListNode(ans);
        if (currHead == null) {
            ListNode carryNode = null;
            if (ans > 9) {
                ans -= 10;
                carryNode = new ListNode(1);
            }
            if (carry > 0) carryNode = new ListNode(carry);
            return new ListNode(ans, carryNode);
        }
        else {
            if (currHead.val > 9) {
                currHead.val -= 10;
            }
            finalHead.next = currHead;
        }
//        if (carry > 0) {
//            if (finalHead.next.next != null)
//                return new ListNode(finalHead.val, finalHead.next);
//            finalHead.next.next = new ListNode(carry);
//            carry = 0;
//        }
        return finalHead;
    }*/
}