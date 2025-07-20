class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int size = 0;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        if (n == size) {
            return head.next;
        }
        temp = head;
        for(int i = 0; i<size-n-1; i++){
            temp = temp.next;
        }
        if(temp.next != null){
            temp.next = temp.next.next;
            return head;
        }
        
    return null;
        
    }
}
