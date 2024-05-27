import java.util.*;
public class Variation3 {
    public static List<Integer> generateRows(int n){
        List<Integer> res=new ArrayList<>();
        int ans=1;
        res.add(ans);
        for(int i=1;i<n;i++){
            ans *= (n-i);
            ans /= i;
            res.add(ans);
        }
        return res;
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            ans.add(generateRows(i));
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> ans = generate(n);
        for (List<Integer> it : ans) {
            for (int ele : it) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
