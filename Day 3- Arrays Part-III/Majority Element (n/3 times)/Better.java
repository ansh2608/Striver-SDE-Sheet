import java.util.*;
public class Better {
    public static List<Integer> majorityElement(int[] nums) {
        int n=nums.length,mini=(n/3)+1;
        List<Integer> ans=new ArrayList<>();
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
            if(mp.get(nums[i])==mini) ans.add(nums[i]);
            if(ans.size()==2) break;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }
}
