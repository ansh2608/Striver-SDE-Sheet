import java.util.HashMap;

public class Bruteforce {
    public static class Node {
        int val;
        Node next;
        Node random;
        public Node(int val) {
            this.val = val;
        }
    }
    public static Node copyRandomList(Node head) {
        Node temp=head;
        HashMap<Node,Node> mp=new HashMap<>();
        while(temp!=null){
            Node newNode=new Node(temp.val);
            mp.put(temp, newNode);
            temp=temp.next;
        }
        temp=head;
        while (temp!=null) {
            Node copyNode=mp.get(temp);
            copyNode.next=mp.get(temp.next);
            copyNode.random=mp.get(temp.random);
            temp=temp.next;
        }
        return mp.get(head);
    }
    public static void printClonedLinkedList(Node head) {
        while (head != null) {
            System.out.print("Data: " + head.val);
            if (head.random != null) {
                System.out.print(", Random: " + head.random.val);
            } else {
                System.out.print(", Random: nullptr");
            }
            System.out.println();
            // Move to the next node in the list
            head = head.next;
        }
    }

    // Main function
    public static void main(String[] args) {
        // Example linked list: 7 -> 14 -> 21 -> 28
        Node head = new Node(7);
        head.next = new Node(14);
        head.next.next = new Node(21);
        head.next.next.next = new Node(28);

        // Assigning random pointers
        head.random = head.next.next;
        head.next.random = head;
        head.next.next.random = head.next.next.next;
        head.next.next.next.random = head.next;

        System.out.println("Original Linked List with Random Pointers:");
        printClonedLinkedList(head);

        // Clone the linked list
        Node clonedList = copyRandomList(head);

        System.out.println("\nCloned Linked List with Random Pointers:");
        printClonedLinkedList(clonedList);
    }
}
