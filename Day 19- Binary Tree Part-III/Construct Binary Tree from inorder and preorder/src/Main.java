public class Main {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }
    public static TreeNode helper(int[] preorder,int preLo,int preHi, int[] inorder,int inLo,int inHi){
        if (preLo>preHi) return null;
        TreeNode root=new TreeNode(preorder[preLo]);
        int i=inLo;
        while (inorder[i]!=preorder[preLo]) i++;
        int leftSize = i-inLo;
        root.left=helper(preorder,preLo+1,preLo+leftSize,inorder,inLo,i-1);
        root.right = helper(preorder,preLo+leftSize+1,preHi,inorder,i+1,inHi);
        return root;
    }
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        int n=preorder.length;
        return helper(preorder,0,n-1,inorder,0,n-1);
    }
    public static void main(String[] args) {
        int[] preorder = {3,9,20,15,7}, inorder = {9,3,15,20,7};
        TreeNode ans = buildTree(preorder,inorder);
    }
}