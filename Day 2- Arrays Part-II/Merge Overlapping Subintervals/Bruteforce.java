import java.util.*;

public class Bruteforce {
    public static int[][] merge(int[][] intervals) {
        int n=intervals.length;
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            int start=intervals[i][0];
            int end=intervals[i][1];
            if (!ans.isEmpty() && end <= ans.get(i).get(1)) continue;
            for(int j=i+1;j<n;j++){
                if(intervals[j][0]<=end) end = Math.max(end,intervals[j][0]);
                else break;
            }
            
            ans.add(Arrays.asList(start,end));
        }
        int[][] res=new int[ans.size()][2];
        for(int i=0;i<ans.size();i++){
            for(int j=0;j<2;j++){
                res[i][j]=ans.get(i).get(j);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] ans=merge(intervals);
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
