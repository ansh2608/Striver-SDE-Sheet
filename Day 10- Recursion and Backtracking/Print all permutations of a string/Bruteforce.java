import java.util.*;
public class Bruteforce {
    public static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void helper(int[] nums,int idx,List<List<Integer>> ans){
        if(idx==nums.length-1){
            List<Integer> temp=new ArrayList<>();
            for(int num:nums) temp.add(num);
            ans.add(temp);
        }
        for(int i=idx;i<nums.length;i++){
            swap(nums,i,idx);
            helper(nums, idx+1, ans);
            swap(nums,i,idx);
        }
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        helper(nums,0,ans);
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(permute(nums));
    }
}
