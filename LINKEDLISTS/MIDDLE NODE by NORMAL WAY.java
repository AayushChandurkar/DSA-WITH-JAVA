class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int size = 0;
        while (temp != null) {
            temp = temp.next;
            size++;
        }       
        int middle = size / 2;
        temp = head;
        for (int i = 0; i < middle; i++) {
            temp = temp.next;
        }

        return temp; 
    }
}
