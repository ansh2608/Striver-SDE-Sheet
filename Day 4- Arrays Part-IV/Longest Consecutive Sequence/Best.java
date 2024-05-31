import java.util.*;

public class Best {
    public static int longestConsecutive(int[] nums) {
        int n=nums.length,longest=1;
        if(n==0) return 0;
        Set<Integer> st=new HashSet<>();
        for(int i=0;i<n;i++) st.add(nums[i]);
        for(int it:st){
            if(!st.contains(it-1)){
                int cnt=1;
                int x=it;
                while (st.contains(x+1)) {
                    x++;
                    cnt++;
                }
                longest=Math.max(cnt, longest);
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));
    }
}