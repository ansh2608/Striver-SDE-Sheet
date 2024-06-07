public class Best {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public static boolean isPalindrome(ListNode head){
        if(head==null || head.next==null) return true;
        ListNode slow=head,fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=reverse(slow.next);
        slow=slow.next;
        while(slow!=null){
            if(head.val!=slow.val) return false;
            head=head.next;
            slow=slow.next;
        }
        return true;
    }
    public static ListNode reverse(ListNode head){
        ListNode temp=head,prev=null;
        while (temp!=null) {
            ListNode front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
    public static void main(String[] args) {
        // Create a sample linked list
        // with a loop for testing
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(2);
        ListNode fifth = new ListNode(1);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        System.out.println(isPalindrome(head));
    }    
}