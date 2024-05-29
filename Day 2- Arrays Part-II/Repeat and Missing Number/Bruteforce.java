import java.util.*;
public class Bruteforce {
    public static ArrayList<Integer> repeatedNumber(int[] A) {
        int repeat=-1,missing=-1,n=A.length;
        for(int i=1;i<=n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if (A[j]==i) count++;
            }
            if(count==2) repeat=i;
            if(count==0) missing=i;
            if (repeat != -1 && missing != -1) break;
        }
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
