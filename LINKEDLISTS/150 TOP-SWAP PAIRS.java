class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode first = head;
        ListNode second = head.next;
        first.next = second.next;
        second.next = first;
        head = second;
        ListNode prev = first;

        while (first.next != null && first.next.next != null) {
            first = first.next;
            second = first.next;

            first.next = second.next;
            second.next = first;
            prev.next = second;
            prev = first;
        }

        return head;
    }
}
