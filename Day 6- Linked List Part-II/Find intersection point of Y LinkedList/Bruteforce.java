public class Bruteforce {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        while(headB!=null){
            ListNode temp=headA;
            while(temp!=null){
                if(temp==headB) return headB;
                temp=temp.next;
            }
            headB=headB.next;
        }
        return null;
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
