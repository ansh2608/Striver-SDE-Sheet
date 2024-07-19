public class Main {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }
    public static int maxsum = 0;
    public static int maxSumBST(TreeNode root) {
        postorder(root);
        return maxsum;
    }
    private static int[] postorder(TreeNode root) {
        if(root == null) return new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE, 0};
        int[] leftTree = postorder(root.left);
        int[] rightTree = postorder(root.right);
        if(leftTree == null || rightTree == null || root.val <= leftTree[1] || root.val >= rightTree[0]) return null;
        int sum = root.val + leftTree[2] + rightTree[2];
        maxsum = Math.max(maxsum, sum);
        int max = Math.max(root.val, rightTree[1]);
        int min = Math.min(root.val, leftTree[0]);
        return new int[]{min, max, sum};
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        TreeNode a=new TreeNode(4);
        TreeNode b=new TreeNode(3);
        root.left=a;
        root.right=b;
        TreeNode c=new TreeNode(2);
        TreeNode d=new TreeNode(4);
        a.left=c;
        a.right=d;
        TreeNode e=new TreeNode(2);
        TreeNode f=new TreeNode(5);
        b.left=e;
        b.right=f;
        TreeNode g=new TreeNode(4);
        TreeNode h=new TreeNode(6);
        f.left=g;
        f.right=h;
        System.out.println(maxSumBST(root));
    }
}