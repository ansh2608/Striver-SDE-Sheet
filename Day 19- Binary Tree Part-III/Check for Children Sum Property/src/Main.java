public class Main {
    public static class Node{
        int data;
        Node left,right;
        Node(int key) {
            data = key;
            left = right = null;
        }
    }
    public static int isSumProperty(Node root){
        if(root==null) return 1;
        if(root.left==null && root.right==null) return 1;
        int sum=0;
        if(root.left!=null) sum+=root.left.data;
        if(root.right!=null) sum+=root.right.data;
        if(sum!=root.data) return 0;
        int l=isSumProperty(root.left);
        int r=isSumProperty(root.right);
        if(l==1 && r==1) return 1;
        return 0;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}