public class Main {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }
    public static TreeNode helper(int[] nums,int lo,int hi){
        if(lo>hi) return null;
        int mid=(lo+hi)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=helper(nums,lo,mid-1);
        root.right=helper(nums,mid+1,hi);
        return root;
    }
    public static TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums,0,nums.length-1);
    }
    public static void main(String[] args) {
        int[] nums = {-10,-3,0,5,9};
        TreeNode ans=sortedArrayToBST(nums);
    }
}