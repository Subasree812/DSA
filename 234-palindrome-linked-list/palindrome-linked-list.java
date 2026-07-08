class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode s = head, f = head, p, t;
        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        p = s;
        s = s.next;
        p.next = null;
        while (s != null) {
            t = s.next;
            s.next = p;
            p = s;
            s = t;
        }
        f = head;
        s = p;
        while (s != null) {
            if (f.val != s.val) 
                return false;
            f = f.next;
            s = s.next;
        }
        return true;
    }
}