class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = head;
        ListNode prev = head;
        int size = 0;
        while (head != null && head.val == val) {
            head = head.next;
        }
        while(temp != null){
            if(temp.val != val){
                prev = temp;
                temp = temp.next;
                size++;
            }
            else{
                prev.next = temp.next;
                temp = prev.next;
                size--;
            }
        }
    return head;
    }
}
