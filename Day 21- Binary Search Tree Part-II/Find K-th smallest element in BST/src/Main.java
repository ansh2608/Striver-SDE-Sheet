import java.util.ArrayList;
import java.util.List;

public class Main {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }
    public static void inorder(TreeNode root,List<Integer> arr){
        if (root==null) return;
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
    }
    public static int kthSmallest(TreeNode root, int k) {
        List<Integer> arr=new ArrayList<>();
        inorder(root,arr);
        return arr.get(k-1);
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(3);
        TreeNode a=new TreeNode(1);
        TreeNode b=new TreeNode(4);
        root.left=a;
        root.right=b;
        TreeNode c=new TreeNode(2);
        a.right=c;
        int k=1;
        System.out.println(kthSmallest(root,k));
    }
}