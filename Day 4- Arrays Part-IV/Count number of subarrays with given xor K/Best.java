import java.util.*;
public class Best {
    public static int solve(ArrayList<Integer> A, int B) {
        int n = A.size(), xr = 0,cnt=0;
        Map<Integer, Integer> mpp = new HashMap<>();
        mpp.put(xr, 1);
        for (int i = 0; i < n; i++) {
            xr = xr ^ A.get(i);
            int x = xr ^ B;
            if (mpp.containsKey(x)) cnt += mpp.get(x);
            if (mpp.containsKey(xr)) mpp.put(xr, mpp.get(xr) + 1);
            else  mpp.put(xr, 1);
        }
        return cnt;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A=new ArrayList<>();
        A.add(4);
        A.add(2);
        A.add(2);
        A.add(6);
        A.add(4);
        int B = 6;
        System.out.println(solve(A, B));
    }
}