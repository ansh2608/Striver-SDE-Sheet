public class Main {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }
    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        int n= inorder.length;
        return helper(inorder, 0, n - 1, postorder, 0, n - 1);
    }

    public static TreeNode helper(int[] inorder, int inLo, int inHi, int[] postorder, int postLo, int postHi) {
        if (inLo > inHi) return null;
        TreeNode root = new TreeNode(postorder[postHi]);
        int rootIndex = 0;
        for (int i = inLo; i <= inHi; i++) {
            if (inorder[i] == postorder[postHi]) {
                rootIndex = i;
                break;
            }
        }
        int leftSize = rootIndex - inLo;
        int rightSize = inHi - rootIndex;
        root.left = helper(inorder, inLo, rootIndex - 1, postorder, postLo, postLo + leftSize - 1);
        root.right = helper(inorder, rootIndex + 1, inHi, postorder, postHi - rightSize, postHi - 1);
        return root;
    }
    public static void main(String[] args) {
        int[] inorder = {9,3,15,20,7}, postorder = {9,15,7,20,3};
        TreeNode ans=buildTree(inorder,postorder);
    }
}