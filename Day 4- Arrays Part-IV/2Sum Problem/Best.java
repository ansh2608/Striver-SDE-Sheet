import java.util.*;

public class Best {
    public static int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        int left=0,right=n-1;
        while (left<right) {
            int sum=nums[left]+nums[right];
            if (sum==target) return new int[]{left,right};
            else if(sum<target) left++;
            else right--;
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] ans=twoSum(nums, target);
        System.out.println(ans[0]);
        System.out.println(ans[1]);
    }
}
