import java.util.*;

public class Bruteforce {
    public static class Node{
        int data;
        Node next;
        Node bottom;  
        Node(int d){
            data = d;
            next = null;
            bottom = null;
        }
    }
    public static Node convertArrToLL(ArrayList<Integer> arr){
        Node dummy = new Node(-1);
        Node temp = dummy;
        for(int i = 0; i < arr.size(); i++){
            temp.next = new Node(arr.get(i));
            temp = temp.next;
        }
        return dummy.next;
    }
    public static Node flatten(Node root){
        ArrayList<Integer> arr = new ArrayList<>();
        Node current = root;        
        while(current != null){
            Node temp = current;
            while(temp != null){
                arr.add(temp.data);
                temp = temp.bottom;
            }
            current = current.next;
        }
        Collections.sort(arr);
        return convertArrToLL(arr);
    }
    public static void printLL(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    public static void main(String[] args) {
        Node head = new Node(5);
        Node head2 = new Node(10);
        Node head3 = new Node(19);
        Node head4 = new Node(28);
        head.next = head2;
        head2.next = head3;
        head3.next = head4;
        
        Node a = new Node(7);
        Node b = new Node(8);
        Node c = new Node(30);
        head.bottom = a;
        a.bottom = b;
        b.bottom = c;
        
        Node d = new Node(20);
        head2.bottom = d;
        
        Node e = new Node(22);
        Node f = new Node(50);
        head3.bottom = e;
        e.bottom = f;
        
        Node g = new Node(35);
        Node h = new Node(40);
        Node i = new Node(45);
        head4.bottom = g;
        g.bottom = h;
        h.bottom = i;
        
        Node flattenedList = flatten(head);
        printLL(flattenedList);
    }    
}
