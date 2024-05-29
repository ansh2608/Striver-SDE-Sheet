import java.util.*;

public class Best {
    public static long merge(long[] arr, int lo,int mid,int hi){
        ArrayList<Long> temp=new ArrayList<>();
        int left=lo;
        int right=mid+1;
        int cnt=0;
        while (left<=mid && right<=hi) {
            if (arr[left]<=arr[right]) {
                temp.add(arr[left]);
                left++;
            }
            else {
                temp.add(arr[right]);
                cnt += (long)(mid-left+1);
                right++;
            }
        }
        while (left<=mid) {
            temp.add(arr[left]);
            left++;
        }
        while (right<=hi) {
            temp.add(arr[right]);
            right++;
        }
        for (int i = lo; i <= hi; i++) {
            arr[i] = temp.get(i - lo);
        }
        return cnt;
    }
    public static long mergeSort(long[] arr, int lo, int hi){
        long cnt=0;
        if(lo>=hi) return cnt;
        int mid = (lo+hi)/2;
        cnt += mergeSort(arr, lo, mid);
        cnt += mergeSort(arr, mid+1, hi);
        cnt += merge(arr,lo,mid,hi);
        return cnt;
    }
    public static long getInversions(long arr[], int n) {
        return mergeSort(arr, 0, n-1);
    }
    public static void main(String[] args) {
        long[] arr={3, 2, 1};
        int n=3;
        System.out.println(getInversions(arr, n));
    }
}
