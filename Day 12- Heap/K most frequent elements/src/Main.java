import java.util.*;

public class Main {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int n:nums) mp.put(n,mp.getOrDefault(n,0)+1);
        List<Map.Entry<Integer,Integer>> entry=new ArrayList<>();
        Collections.sort(entry, (a,b) -> b.getValue() - a.getValue());
        int[] ans=new int[k];
        for(int i=0;i<k;i++) ans[i]=entry.get(i).getKey();
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        int[] ans=topKFrequent(nums,k);
        for(int n:ans) System.out.print(n+" ");
    }
}