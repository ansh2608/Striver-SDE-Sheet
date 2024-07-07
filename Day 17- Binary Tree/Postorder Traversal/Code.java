import java.util.*;
public class Code {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) { 
            this.val = val; 
        }
    }
    public static void helper(TreeNode root,List<Integer> ans){
        if(root==null) return;
        helper(root.left,ans);
        helper(root.right,ans);
        ans.add(root.val);
    }
    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        helper(root,ans);
        return ans;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println(postorderTraversal(root));
    }
}
