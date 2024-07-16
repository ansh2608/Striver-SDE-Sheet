public class Main {
    public static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node(int _val) {
            val = _val;
        }
    }
    public static void helper(Node leftRoot,Node rightRoot){
        if(leftRoot==null || rightRoot==null) return;
        leftRoot.next=rightRoot;
        helper(leftRoot.left,leftRoot.right);
        helper(rightRoot.left,rightRoot.right);
        helper(leftRoot.right,rightRoot.left);
    }
    public static Node connect(Node root){
        if(root==null) return root;
        helper(root.left,root.right);
        return root;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        Node a=new Node(2);
        Node b=new Node(3);
        root.left=a;
        root.right=b;
        Node c=new Node(4);
        Node d=new Node(5);
        a.left=c;
        a.right=d;
        Node e=new Node(6);
        Node f=new Node(7);
        b.left=e;
        b.right=f;
        Node ans=connect(root);
    }
}