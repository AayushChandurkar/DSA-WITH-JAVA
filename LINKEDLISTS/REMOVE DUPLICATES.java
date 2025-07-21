class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;

        while (head != null && head.next != null && head.val == head.next.val) {
            while (head.next != null && head.val == head.next.val) {
                head = head.next;
            }
            head = head.next;
        }

        if (head == null || head.next == null) return head;

        ListNode temp = head;
        ListNode start = temp.next;
        ListNode end = null;
        if (start != null) {
            end = start.next;
        }

        while (start != null && end != null) {
            if (start.val != end.val) {
                temp = temp.next;
                start = start.next;
                end = end.next;
            } 
            else {
                while (end != null && end.val == start.val) {
                    end = end.next;
                }
                temp.next = end;
                start = end;
                if (end != null) {
                    end = end.next;
                }
            }
        }

        return head;
    }
}
