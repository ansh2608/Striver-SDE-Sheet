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
    public static class Pair {
        int line;
        TreeNode node;
        Pair(TreeNode node,int line) { 
            this.node=node;
            this.line = line; 
        }
    }
    public static int widthOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int ans=0;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            int size=q.size();
            int min=q.peek().line;
            int first=0,last=0;
            for(int i=0;i<size;i++){
                int curr = q.peek().line - min;
                TreeNode node=q.peek().node;
                q.poll();
                if(i==0) first = curr;
                if(i==size-1) last=curr;
                if(node.left!=null) q.add(new Pair(node.left,curr*2+1));
                if(node.right!=null) q.add(new Pair(node.right,curr*2+2));
            }
            ans = Math.max(ans,last-first+1);
        }
        return ans;
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        TreeNode a=new TreeNode(3);
        TreeNode b=new TreeNode(2);
        root.left=a;
        root.right=b;
        TreeNode c=new TreeNode(5);
        TreeNode d=new TreeNode(3);
        a.left=c;
        a.right=d;
        TreeNode f=new TreeNode(9);
        b.right=f;
        System.out.println(widthOfBinaryTree(root));
    }
}
