public class Bruteforce {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { 
            this.val = val; 
        }
    }
    public static void deleteNode(ListNode node){
        node.val=node.next.val;
        node.next=node.next.next;
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
        ListNode head1=new ListNode(4);
        ListNode a=new ListNode(5);
        ListNode b=new ListNode(1);
        ListNode c=new ListNode(9);
        head1.next=a;
        a.next=b;
        b.next=c;
        deleteNode(head1);
        printLinkedList(head1);
    }
}