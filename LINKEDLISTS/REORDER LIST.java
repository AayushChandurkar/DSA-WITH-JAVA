class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        ListNode start = head;
        ListNode target = head;
        ListNode prev = head;

        while (true) {
            while (target.next != null) {
                prev = target;
                target = target.next;
            }

            if (start == target || start.next == target) {
                break;
            }

            target.next = start.next;
            start.next = target;
            prev.next = null;
            start = target.next;

            target = start;
            prev = start;
        }
    }
}
