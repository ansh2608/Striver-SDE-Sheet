public class Main {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }
    public static boolean helper(TreeNode root,Long min, Long max){
        if (root==null) return true;
        if(root.val>root.right.val || root.val<root.left.val) return false;
        return isValidBST(root.left) && isValidBST(root.right);
    }
    public static boolean isValidBST(TreeNode root) {
        return helper(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(5);
        TreeNode a=new TreeNode(1);
        TreeNode b=new TreeNode(4);
        root.left=a;
        root.right=b;
        TreeNode c=new TreeNode(3);
        TreeNode d=new TreeNode(6);
        b.left=c;
        b.right=d;
        System.out.println(isValidBST(root));
    }
}