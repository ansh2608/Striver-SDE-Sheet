public class Main {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }
    public void flatten(TreeNode root){
        TreeNode curr=root;
        while (curr!=null){
            if(curr.left!=null){
                TreeNode temp=curr.left;
                while (temp.right!=null) temp=temp.right;
                temp.right=curr;
                curr.right=curr.left;
                curr.left=null;
            }
            curr=curr.right;
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}