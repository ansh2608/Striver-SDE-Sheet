import java.util.*;
public class Code {
    public static class Node{
        int data;
        Node left, right;
        Node(int item){
            data = item;
        }
    }
    public static void helper(Node root,ArrayList<Integer> ans,int lvl){
        if(root==null) return;
        if(lvl==ans.size()) ans.add(root.data);
        helper(root.left,ans,lvl+1);
        helper(root.right,ans,lvl+1);
    }
    public static ArrayList<Integer> leftView(Node root){
        ArrayList<Integer> ans=new ArrayList<>();
        helper(root,ans,0);
        return ans;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(10);
        root.left.left.right = new Node(5);
        root.left.left.right.right = new Node(6);
        root.right = new Node(3);
        root.right.right = new Node(10);
        root.right.left = new Node(9);
        System.out.println(leftView(root));
    }
}
