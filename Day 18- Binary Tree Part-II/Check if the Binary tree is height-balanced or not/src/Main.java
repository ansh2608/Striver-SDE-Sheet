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
        if(root==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public static boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int left=height(root.left);
        int right=height(root.right);
        if(Math.abs(left-right)<=1 && isBalanced(root.left) && isBalanced(root.right)) return true;
        return false;
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
        System.out.println(isBalanced(root));
    }
}