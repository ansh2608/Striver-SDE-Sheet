public class Main {
    public static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
        }
    }
    public static int floor(Node root, int x) {
        int floor=-1;
        while (root!=null){
            if(root.data==x) return x;
            if (root.data>x) root=root.left;
            else{
                floor=root.data;
                root=root.right;
            }
        }
        return floor;
    }
    public static void main(String[] args) {
        Node root=new Node(6);
        Node a=new Node(8);
        root.left=a;
        Node c=new Node(7);
        Node d=new Node(9);
        a.left=c;
        a.right=d;
        int x=87;
        System.out.println(floor(root,x));
    }
}