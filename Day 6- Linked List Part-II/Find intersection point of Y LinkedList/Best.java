public class Best {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode d1=headA,d2=headB;
        while(d1 != d2){
            if(d1==null) d1=headB;
            else d1=d1.next;
            if(d2==null) d2=headA;
            else d2=d2.next;
        }
        return d1;
    } 
    public static void printList(ListNode head) {
        while(head.next != null) {
        System.out.print(head.val+"->");
            head = head.next;
        }
        System.out.println(head.val);
    }
    public static void main(String[] args) {
        ListNode head1=new ListNode(4);
        ListNode a=new ListNode(1);
        ListNode b=new ListNode(8);
        ListNode c=new ListNode(4);
        ListNode d=new ListNode(5);
        ListNode head2=new ListNode(5);
        ListNode p=new ListNode(6);
        ListNode q=new ListNode(1);
        head1.next=a;
        a.next=b;
        b.next=c;
        c.next=d;
        head2.next=p;
        p.next=q;
        q.next=b;
        printList(getIntersectionNode(head1, head2));
    }
}
