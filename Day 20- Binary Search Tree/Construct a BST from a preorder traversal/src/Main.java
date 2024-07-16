public class Main {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }
    public static TreeNode insertion(TreeNode root,int val){
        if(root==null) return new TreeNode(val);
        if (root.val>val){
            if(root.left==null) root.left=new TreeNode(val);
            else insertion(root.left,val);
        }
        else {
            if (root.right==null) root.right=new TreeNode(val);
            else insertion(root.right,val);
        }
        return root;
    }
    public static TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root=new TreeNode(preorder[0]);
        for(int i=1;i< preorder.length;i++) root=insertion(root,preorder[i]);
        return root;
    }
    public static void main(String[] args) {
        int[] preorder = {8,5,1,7,10,12};
        TreeNode ans=bstFromPreorder(preorder);
    }
}