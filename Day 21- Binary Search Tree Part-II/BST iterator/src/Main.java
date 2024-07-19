import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) {
        this.val = val;
    }
}
class BSTIterator {
    List<Integer> list=new ArrayList<>();
    int i=-1;
    public void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
    public BSTIterator(TreeNode root) {
        inorder(root);
    }
    public int next() {
        i++;
        return list.get(i);
    }
    public boolean hasNext() {
        return i+1<list.size();
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}