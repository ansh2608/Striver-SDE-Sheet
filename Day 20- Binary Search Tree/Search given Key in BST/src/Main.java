public class Main {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }
    public static TreeNode searchBST(TreeNode root, int val) {
        if(root==null) return null;
        if(root.val==val) return root;
        if(root.val>val) return searchBST(root.left,val);
        else return searchBST(root.right,val);
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(4);
        TreeNode a=new TreeNode(2);
        TreeNode b=new TreeNode(7);
        root.left=a;
        root.right=b;
        TreeNode c=new TreeNode(1);
        TreeNode d=new TreeNode(3);
        a.left=c;
        a.right=d;
        int val=2;
        TreeNode ans=searchBST(root,val);
    }
}