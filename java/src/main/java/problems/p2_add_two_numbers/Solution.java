package problems.p2_add_two_numbers;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode referenceList = new ListNode(0);
        ListNode currentNode = referenceList;

        while (l1 != null || l2 != null || carry > 0) {
            int valueX = l1 != null ? l1.val : 0;
            int valueY = l2 != null ? l2.val : 0;

            int sum =  valueX + valueY + carry;
            carry = sum / 10;

            currentNode.next = new ListNode(sum % 10);
            currentNode = currentNode.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return referenceList.next;
    }
}
