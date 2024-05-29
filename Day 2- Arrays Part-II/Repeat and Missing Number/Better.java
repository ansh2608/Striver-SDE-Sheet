import java.util.*;
public class Better {
    public static ArrayList<Integer> repeatedNumber(int[] A) {
        int repeat=-1,missing=-1,n=A.length;
        int[] hash=new int[n+1];
        for(int i=0;i<n;i++) hash[A[i]]++;
        for(int i=1;i<=n;i++){
            if(hash[i]==0) missing=i;
            if(hash[i]==2) repeat=i;
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
