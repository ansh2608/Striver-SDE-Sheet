public class Bruteforce {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { 
            this.val = val; 
        }
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int cnt=0;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        if(cnt==n){
            ListNode newHead=head.next;
            head.next=null;
            return newHead;
        }
        int res=cnt-n;
        temp=head;
        while(temp!=null){
            res--;
            if(res==0) break;
            temp=temp.next;
        }
        ListNode delNode=temp.next;
        temp.next=temp.next.next;
        delNode=null;
        return head;
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
        int n=2;
        printLinkedList(removeNthFromEnd(head,n));
    }
}
