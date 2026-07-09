class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int c = 0;
        ListNode temp = head;

        while(temp != null){
            c++;
            temp = temp.next;
        }

        c = c - n;

        if(c == 0)
            return head.next;

        temp = head;

        while(c > 1){
            temp = temp.next;
            c--;
        }

        temp.next = temp.next.next;

        return head;
    }
}