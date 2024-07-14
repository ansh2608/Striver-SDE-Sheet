public class Main {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }
    public static TreeNode invertTree(TreeNode root){
        if(root==null) return null;
        TreeNode l=root.left;
        TreeNode r=root.right;
        root.left=invertTree(r);
        root.right=invertTree(l);
        return root;
    }
    public static boolean isSameTree(TreeNode p,TreeNode q){
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.val!=q.val) return false;
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
    public static boolean isSymmetric(TreeNode root) {
        if (root==null) return true;
        root.left=invertTree(root.left);
        return isSameTree(root.left,root.right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.right.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        System.out.println(isSymmetric(root));
    }
}