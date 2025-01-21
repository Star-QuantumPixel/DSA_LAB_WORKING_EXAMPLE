class Solution {
    public ListNode deleteNode(ListNode head, int position) {
        if (head == null) return null;
        
        if (position == 0) return head.next;
        
        ListNode current = head;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        
        if (current != null && current.next != null) {
            current.next = current.next.next;
        }
        
        return head;
    }
}
