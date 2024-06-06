public class Bruteforce {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { 
            this.val = val; 
        }
    }
    public static ListNode middleNode(ListNode head) {
        ListNode temp=head;
        int n=0;
        while(temp!=null) {
            n++;
            temp=temp.next;
        }
        int size=n/2+1;
        temp=head;
        for(int i=0;i<size-1;i++){
            temp=temp.next;
        }
        return temp;
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
        printLinkedList(middleNode(head));
    }
}