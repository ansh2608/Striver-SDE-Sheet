public class Bruteforce {
    public static long getInversions(long arr[], int n) {
        long count=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]) count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        long[] arr={3, 2, 1};
        int n=3;
        System.out.println(getInversions(arr, n));
    }
}
