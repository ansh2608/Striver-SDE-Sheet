public class Best2 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { 
            this.val = val; 
        }
    }
    public static ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode newNode = reverseList(head.next);
        ListNode front=head.next;
        front.next=head;
        head.next=null;
        return newNode;
    }
    public static void printLinkedList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        ListNode a=new ListNode(2);
        ListNode b=new ListNode(3);
        ListNode c=new ListNode(4);
        ListNode d=new ListNode(5);
        head.next=a;
        a.next=b;
        b.next=c;
        c.next=d;
        printLinkedList(reverseList(head));
    }
}