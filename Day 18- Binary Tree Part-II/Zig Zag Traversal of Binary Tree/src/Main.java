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
    public static int height(TreeNode root){
        if(root==null || (root.left==null && root.right==null)) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public static void leftToRight(TreeNode root,int n,List<Integer> ans){
        if(root==null) return;;
        if(n==1) ans.add(root.val);
        leftToRight(root.left,n-1,ans);
        leftToRight(root.right,n-1,ans);
    }
    public static void rightToLeft(TreeNode root,int n,List<Integer> ans){
        if(root==null) return;;
        if(n==1) ans.add(root.val);
        rightToLeft(root.right,n-1,ans);
        rightToLeft(root.left,n-1,ans);
    }
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        int level=height(root)+1;
        for(int i=1;i<=level;i++){
            List<Integer> temp=new ArrayList<>();
            if(i%2!=0) leftToRight(root,i,temp);
            else rightToLeft(root,i,temp);
            ans.add(temp);
        }
        return ans;
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(3);
        TreeNode a=new TreeNode(9);
        TreeNode b=new TreeNode(20);
        root.left=a;
        root.right=b;
        TreeNode c=new TreeNode(15);
        TreeNode d=new TreeNode(7);
        b.left=c;
        b.right=d;
        System.out.println(zigzagLevelOrder(root));
    }
}