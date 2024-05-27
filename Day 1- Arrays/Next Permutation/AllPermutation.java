import java.util.*;
public class AllPermutation {
    public static void helper(int[] nums,List<List<Integer>> ans,int idx){
        int n=nums.length;
        if (idx==n-1) {
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<n;i++) list.add(nums[i]);
            ans.add(list);
            return;
        }
        for(int i=idx;i<n;i++){
            swap(i,idx,nums);
            helper(nums,ans,idx+1);
            swap(i,idx,nums);
        }
    }
    public static void swap(int i,int j,int[] nums){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static List<List<Integer>> permute(int[] nums){
        List<List<Integer>> ans=new ArrayList<>();
        helper(nums,ans,0);
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(permute(nums));
    }
}