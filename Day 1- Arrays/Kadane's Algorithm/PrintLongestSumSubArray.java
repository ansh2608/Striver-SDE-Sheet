public class PrintLongestSumSubArray {
    public static int maxSubArray(int[] nums) {
        int maxSum=Integer.MIN_VALUE,sum=0,start=0,ansStart=-1,ansEnd=-1;
        for(int i=0;i<nums.length;i++){
            if(sum==0) start=i;
            sum+=nums[i];
            if(sum>maxSum) {
                maxSum=sum;
                ansStart=start;
                ansEnd=i;
            }    
            if(sum<0) sum=0;
        }
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(nums[i] + " ");
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
