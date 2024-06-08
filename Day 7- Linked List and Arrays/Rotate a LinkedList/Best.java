public class Best {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public static ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0) return head;
        ListNode temp=head;
        int length=1;
        while(temp.next!=null){
            ++length;
            temp=temp.next;
        }
        temp.next=head;
        k=k%length;
        int end=length-k;
        while (end-- != 0) temp=temp.next;
        head=temp.next;
        temp.next=null;
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