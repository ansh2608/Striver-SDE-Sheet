import java.util.*;
public class Best {
    public static void helper(int ind, int[] nums, List<Integer> ds, List<List<Integer>> ans) {
        ans.add(new ArrayList<>(ds)); 
        for(int i = ind;i<nums.length;i++) {
            if(i!=ind && nums[i] == nums[i-1]) continue; 
            ds.add(nums[i]); 
            helper(i+1, nums, ds, ans); 
            ds.remove(ds.size() - 1);
        } 
    }
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums); 
        List<List<Integer>> ans = new ArrayList<>(); 
        helper(0, nums, new ArrayList<>(), ans); 
        return ans; 
    }
    public static void main(String[] args) {
        int[] nums = {1,2,2};
        System.out.println(subsetsWithDup(nums));
    }
}
