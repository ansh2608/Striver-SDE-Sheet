import java.util.*;
public class Code {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }
    public static void helper(Node root,ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> arr){
        if(root==null) return;
        arr.add(root.data);
        if(root.left==null && root.right==null) {
            ans.add(new ArrayList<>(arr));
            return;
        }    
        helper(root.left, ans, new ArrayList<>(arr));
        helper(root.right, ans, new ArrayList<>(arr));
    }
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> arr=new ArrayList<>();
        helper(root,ans,arr);
        return ans;
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
        System.out.println(Paths(root));
    }
}
