class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode node = head;
        ListNode current = head.next;

        while (current != null) {
            if (current.val == node.val) {
                current = current.next;
                node.next = current;
            } else {
                node = current;
                current = current.next;
            }
        }

        return head;
    }
}
