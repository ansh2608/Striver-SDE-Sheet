import java.util.*;
public class Code {
    public static void helper(int idx,int target,int[] candidates,List<List<Integer>> ans,List<Integer> ds){
        if(idx==candidates.length){
            if(target==0) ans.add(new ArrayList<>(ds));
            return;
        }
        if(candidates[idx] <= target){
            ds.add(candidates[idx]);
            helper(idx, target-candidates[idx], candidates, ans, ds);
            ds.remove(ds.size()-1);
        }
        helper(idx+1, target, candidates, ans, ds);
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        helper(0,target,candidates,ans,new ArrayList<>());
        return ans;
    }
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        System.out.println(combinationSum(candidates, target));
    }
}
