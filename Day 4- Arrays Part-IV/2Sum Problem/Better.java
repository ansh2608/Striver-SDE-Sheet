import java.util.*;

public class Better {
    public static int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            int remaining = target-nums[i];
            if(mp.containsKey(remaining)) return new int[]{mp.get(remaining),i};
            mp.put(nums[i],i);
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
