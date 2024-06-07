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
    public static boolean isPalindrome(ListNode head){
        Stack<Integer> st=new Stack<>();
        ListNode temp=head;
        while(temp!=null){
            st.add(temp.val);
            temp=temp.next;
        }
        temp=head;
        while (temp!=null) {
            if(temp.val!=st.peek()) return false;
            st.pop();
            temp=temp.next;
        }
        return true;
    }
    public static void main(String[] args) {
        // Create a sample linked list
        // with a loop for testing
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(2);
        ListNode fifth = new ListNode(1);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        System.out.println(isPalindrome(head));
    }    
}