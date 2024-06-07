import java.util.*;

public class Bruteforce {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public static ListNode detectCycle(ListNode head) {
        ListNode temp=head;
        Set<ListNode> st=new HashSet<>();
        while(temp!=null){
            if(st.contains(temp)) return temp;
            st.add(temp);
            temp=temp.next;
        }
        return null;
    }
    public static void main(String[] args) {
        // Create a sample linked list
        // with a loop for testing
        ListNode head = new ListNode(3);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(0);
        ListNode fourth = new ListNode(-4);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next=second;

        // Check if there is a loop
        // in the linked list
        System.out.println(detectCycle(head).val);
    }    
}