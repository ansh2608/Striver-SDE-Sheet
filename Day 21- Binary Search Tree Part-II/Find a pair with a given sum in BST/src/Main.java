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
    public static List<Integer> arr=new ArrayList<>();
    public static boolean findTarget(TreeNode root, int k) {
        if(root==null) return false;
        if(arr.contains(k-root.val)) return true;
        arr.add(root.val);
        return findTarget(root.left,k) || findTarget(root.right,k);
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(5);
        TreeNode a=new TreeNode(3);
        TreeNode b=new TreeNode(6);
        root.left=a;
        root.right=b;
        TreeNode c=new TreeNode(2);
        TreeNode d=new TreeNode(4);
        a.left=c;
        a.right=d;
        TreeNode e=new TreeNode(7);
        b.right=e;
        int k=9;
        System.out.println(findTarget(root,k));
    }
}