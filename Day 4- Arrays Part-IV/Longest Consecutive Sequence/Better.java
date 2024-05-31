import java.util.Arrays;

public class Better {
    public static int longestConsecutive(int[] nums) {
        int n=nums.length,cnt=0,longest=1,lastSmaller=Integer.MIN_VALUE;
        if(n==0) return 0;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if((nums[i]-1)==lastSmaller){
                cnt++;
                lastSmaller=nums[i];
            }
            else if(nums[i]!=lastSmaller){
                cnt=1;
                lastSmaller=nums[i];
            }
            longest=Math.max(longest,cnt);
        }
        return longest;
    }
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));
    }
}