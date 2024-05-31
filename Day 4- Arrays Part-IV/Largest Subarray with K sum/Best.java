import java.util.*;

public class Best {
    public static int maxLen(int arr[], int n){
        HashMap<Integer,Integer> mp=new HashMap<>();
        int max=0,sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==0) max=i+1;
            else {
                if(mp.get(sum)!=null) max=Math.max(max, i-mp.get(sum));
                else mp.put(sum, i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int N = 8;
        int A[] = {15,-2,2,-8,1,7,10,23};
        System.out.println(maxLen(A, N));
    }
}
