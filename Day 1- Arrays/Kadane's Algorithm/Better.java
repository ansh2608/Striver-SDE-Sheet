public class Better {
    public static int maxSubArray(int[] nums) {
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++) {
                sum+=nums[j];
                maxSum=Math.max(maxSum, sum);
            }    
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
