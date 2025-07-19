public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode f = head;
        ListNode s = head;
        while(f!=null && f.next!=null){
            f = f.next.next;
            s = s.next;
            if(f == s){
                ListNode start = head;
                while(start != s){
                    start = start.next;
                    s = s.next;
                }
                return start;                
            }
        }
        return null;
    }
}
