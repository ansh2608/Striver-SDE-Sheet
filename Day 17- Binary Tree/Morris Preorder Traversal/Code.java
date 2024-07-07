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
    public static List<Integer> getPreOrderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        TreeNode curr=root;
    	while(curr!=null){
            if(curr.left==null){
                ans.add(curr.val);
                curr=curr.right;
            }
            else{
                TreeNode prev=curr.left;
                while(prev.right!=null && prev.right!=curr) prev=prev.right;
                if(prev.right==null){
                    ans.add(curr.val);
                    prev.right=curr;
                    curr=curr.left;
                }
                else {
                    prev.right=null;
                    curr=curr.right;
                }
            }
        }
        return ans;
    }   
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println(getPreOrderTraversal(root));
    }
}
