import java.util.*;

public class Main {
    public static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            left=null;
            right=null;
        }
    }
    public void inorder(Node root, List<Integer> arr){
        if(root==null) return;
        inorder(root.left,arr);
        arr.add(root.data);
        inorder(root.right,arr);
    }
    public int kthLargest(Node root,int K){
        List<Integer> arr=new ArrayList<>();
        inorder(root,arr);
        if(K>arr.size()) return -1;
        return arr.get(arr.size()-K);
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}