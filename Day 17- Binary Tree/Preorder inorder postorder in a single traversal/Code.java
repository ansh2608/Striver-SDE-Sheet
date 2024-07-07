import java.util.*;
class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data) {
        this.data = data;
    }
}
public class Code {
    public static void inOrder_Helper(TreeNode root,List<Integer> ans){
        if(root==null) return;
        inOrder_Helper(root.left, ans);
        ans.add(root.data);
        inOrder_Helper(root.right, ans);
    }
    public static void preOrder_Helper(TreeNode root,List<Integer> ans){
        if(root==null) return;
        ans.add(root.data);
        preOrder_Helper(root.left, ans);
        preOrder_Helper(root.right, ans);
    }
    public static void postOrder_Helper(TreeNode root,List<Integer> ans){
        if(root==null) return;
        postOrder_Helper(root.left, ans);
        postOrder_Helper(root.right, ans);
        ans.add(root.data);
    }
    public static List<List<Integer>> getTreeTraversal(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();

        List<Integer> inOrder=new ArrayList<>();
        inOrder_Helper(root,inOrder);
        ans.add(inOrder);

        List<Integer> preOrder=new ArrayList<>();
        preOrder_Helper(root,preOrder);
        ans.add(preOrder);

        List<Integer> postOrder=new ArrayList<>();
        postOrder_Helper(root,postOrder);
        ans.add(postOrder);

        return ans;
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        TreeNode a=new TreeNode(3);
        TreeNode b=new TreeNode(4);
        root.left=a;
        root.right=b;
        TreeNode c=new TreeNode(5);
        TreeNode d=new TreeNode(2);
        a.left=c;
        a.right=d;
        TreeNode e=new TreeNode(7);
        TreeNode f=new TreeNode(6);
        b.left=e;
        b.right=f;
        System.out.println(getTreeTraversal(root));
    }
}
