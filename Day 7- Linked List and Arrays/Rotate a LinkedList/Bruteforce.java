public class Bruteforce {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public static ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        for(int i=0;i<k;i++){
            ListNode temp=head;
            while(temp.next.next!=null) temp=temp.next;
            ListNode end=temp.next;
            temp.next=null;
            end.next=head;
            head=end;
        }
        return head;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        int k=2;
        System.out.println(rotateRight(head,k));
    }    
}