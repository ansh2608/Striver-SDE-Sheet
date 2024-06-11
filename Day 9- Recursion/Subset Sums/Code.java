import java.util.*;
public class Code {
    public static void helper(int idx,int sum,int n,ArrayList<Integer> arr,ArrayList<Integer> ans){
        if(idx==n){
            ans.add(sum);
            return;
        }
        helper(idx+1, sum+arr.get(idx), n, arr, ans);
        helper(idx+1, sum, n, arr, ans);
    }
    public static ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n) {
        ArrayList<Integer> ans=new ArrayList<>();
        helper(0,0,n,arr,ans);
        Collections.sort(ans);
        return ans;
    }
    public static void main(String[] args) {
        int n=2;
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(2);
        arr.add(3);
        System.out.println(subsetSums(arr, n));
    }
}