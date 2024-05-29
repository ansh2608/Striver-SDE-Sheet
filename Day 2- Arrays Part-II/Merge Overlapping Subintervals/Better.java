import java.util.*;
public class Better {
    public static int[][] merge(int[][] intervals) {
        int n=intervals.length;
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (ans.isEmpty() || intervals[i][0] > ans.get(ans.size() - 1).get(1)) {
                ans.add(Arrays.asList(intervals[i][0], intervals[i][1]));
            }
            else {
                ans.get(ans.size() - 1).set(1,Math.max(ans.get(ans.size() - 1).get(1), intervals[i][1]));
            }
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
