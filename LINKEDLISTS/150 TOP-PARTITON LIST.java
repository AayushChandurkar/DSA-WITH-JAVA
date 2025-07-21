class Solution {
    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) return head;

        ListNode prev = null;
        ListNode target = head;
        int size = 0;

        // Find first node >= x
        while (target != null && target.val < x) {
            prev = target;
            target = target.next;
            size++;
        }

        if (target == null) return head;

        ListNode prevCurrent = target;
        ListNode current = target.next;

        while (current != null) {
            if (current.val < x) {
                ListNode nextCurrent = current.next;

                // Disconnect current from its place
                prevCurrent.next = current.next;

                // Insert before target
                if (prev != null) {
                    prev.next = current;
                    current.next = target;
                    prev = current;
                } 
                else {
                    current.next = target;
                    head = current;
                    prev = head;
                }

                current = nextCurrent;
            } 
            else {
                prevCurrent = current;
                current = current.next;
            }
        }

        return head;
    }
}
