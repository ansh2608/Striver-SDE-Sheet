public class Bruteforce {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public static ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || k==1) return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode curr=head,pre=dummy,nex=dummy;
        int count=0;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        while(count>=k){
            curr=pre.next;
            nex=curr.next;
            for(int i=1;i<k;i++){
                curr.next=nex.next;
                nex.next=pre.next;
                pre.next=nex;
                nex=curr.next;
            }
            pre=curr;
            count-=k;
        }
        return dummy.next;
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
        int k=2;
        printLinkedList(reverseKGroup(head,k));
    }
}