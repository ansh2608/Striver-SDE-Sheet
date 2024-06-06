import java.util.*;
public class Bruteforce {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { 
            this.val = val; 
        }
    }
    public static ListNode convertArrToLL(ArrayList<Integer> arr){
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        for(int i=0;i<arr.size();i++){
            temp.next=new ListNode(arr.get(i));
            temp=temp.next;
        }
        return dummy.next;
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer> arr=new ArrayList<>();
        ListNode temp1=list1,temp2=list2;
        while (temp1!=null) {
            arr.add(temp1.val);
            temp1=temp1.next;
        }
        while (temp2!=null) {
            arr.add(temp2.val);
            temp2=temp2.next;
        }
        Collections.sort(arr);
        ListNode head=convertArrToLL(arr);
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
        printLinkedList(mergeTwoLists(head,head));
    }
}