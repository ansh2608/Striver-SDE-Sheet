import java.util.*;
public class Best {
    public static ArrayList<Integer> repeatedNumber(int[] A) {
        int n=A.length;
        // S - SN
        // S2 - S2N
        long SN = (n*(n+1))/2;
        long S2N = (n*(n+1)*(2*n+1))/6;
        long S = 0, S2=0;
        for(int i=0;i<n;i++){
            S += A[i];
            S2 += A[i] * A[i];
        }
        long val1= S - SN;
        long val2 = S2 - S2N;
        val2 = val2/val1;
        int repeat = (int)((val1+val2)/2);
        int missing = (int)(repeat-val1);
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(repeat);
        ans.add(missing);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={3, 1, 2, 5, 3};
        System.out.println(repeatedNumber(arr));
    }
}
