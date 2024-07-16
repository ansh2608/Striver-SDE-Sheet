public class Main {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val<root.val && q.val>root.val) return root;
        if (p.val>root.val && q.val<root.val) return root;
        if (p==root || q==root) return root;
        if (p==q) return p;
        if (root.val>p.val || root.val>q.val) return lowestCommonAncestor(root.left,p,q);
        else return lowestCommonAncestor(root.right,p,q);
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(6);
        TreeNode a=new TreeNode(2);
        TreeNode b=new TreeNode(8);
        root.left=a;
        root.right=b;
        TreeNode c=new TreeNode(0);
        TreeNode d=new TreeNode(4);
        a.left=c;
        a.right=d;
        TreeNode e=new TreeNode(7);
        TreeNode f=new TreeNode(9);
        b.left=e;
        b.right=f;
        TreeNode g=new TreeNode(3);
        TreeNode h=new TreeNode(5);
        d.left=g;
        d.right=h;
        TreeNode p=new TreeNode(2);
        TreeNode q=new TreeNode(8);
        TreeNode ans=lowestCommonAncestor(root,p,q);
    }
}