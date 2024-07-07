import java.util.*;

public class Main {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> temp=new ArrayList<>();
            for(int i=0;i<size;i++){
                if(q.peek().left != null) q.add(q.peek().left);
                if(q.peek().right != null) q.add(q.peek().right);
                temp.add(q.poll().val);
            }
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
        System.out.println(levelOrder(root));
    }
}