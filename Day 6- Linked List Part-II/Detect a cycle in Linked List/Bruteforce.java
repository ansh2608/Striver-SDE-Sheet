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
    public static boolean hasCycle(ListNode head) {
        ListNode temp=head;
        Set<ListNode> st=new HashSet<>();
        while(temp!=null){
            if(st.contains(temp)) return true;
            st.add(temp);
            temp=temp.next;
        }
        return false;
    }
    public static void main(String[] args) {
        // Create a sample linked list
        // with a loop for testing
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        // Create a loop
        fifth.next = third;

        // Check if there is a loop
        // in the linked list
        if (hasCycle(head)) {
            System.out.println("Loop detected in the linked list.");
        } else {
            System.out.println("No loop detected in the linked list.");
        }
    }    
}