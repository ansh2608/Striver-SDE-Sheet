import java.util.*;
public class Bruteforce {
    public static List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(ans.size()==0 || ans.get(0)!=nums[i]){
                int cnt=0;
                for(int j=0;j<n;j++){
                    if(nums[j]==nums[i]) cnt++;
                }
                if(cnt>(n/3)) ans.add(nums[i]);
            }
            if(ans.size()==2) break;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }
}
