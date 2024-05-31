import java.util.*;
public class Bruteforce {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        int n=nums.length;
        Set<List<Integer>> set=new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    for(int l=k+1;l<n;l++){
                        if((nums[i]+nums[j]+nums[k]+nums[l])==target){
                            List<Integer> temp=Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                            Collections.sort(temp);
                            set.add(temp);
                        }
                    }
                }
            }
        }
        List<List<Integer>> ans=new ArrayList<>(set);
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,0,-1,0,-2,2};
        int target = 0;
        System.out.println(fourSum(nums, target));
    }
}
