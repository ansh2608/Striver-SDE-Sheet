public class Main {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        if(root==null || root==p || root==q) return root;
        TreeNode left=lowestCommonAncestor(root.left,p,q);
        TreeNode right=lowestCommonAncestor(root.right,p,q);
        if(left==null) return right;
        else if(right == null) return left;
        else return root;
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

    }
}