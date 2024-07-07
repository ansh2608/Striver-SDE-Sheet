public class Main {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }
    public static int maxDepth(TreeNode root) {
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 1;
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
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
        System.out.println(maxDepth(root));
    }
}