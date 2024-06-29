public class Best {
    public static int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        if(n==1 || nums[0]!=nums[1]) return nums[0];
        int low=1,high=n-2;
        while (low<=high) {
            int mid=(low+high)/2;
            if(nums[mid]==nums[mid^1]) low=mid+1;
            else high=mid-1;
        }
        return nums[low];
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(nums));
    }
}
