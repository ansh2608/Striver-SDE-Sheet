import java.util.ArrayList;
import java.util.List;

public class LeetCode {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        for (int i=1;i<=numRows;i++){
            List<Integer> res=new ArrayList<>();
            if (i==1) res.add(1);
            if (i==2) {
                res.add(1);
                res.add(1);
            }
            ans.add(res);

        }
        return ans;
    }
    public static void main(String[] args) {
        int numRows = 1;
        System.out.println(generate(numRows));;
    }
}
