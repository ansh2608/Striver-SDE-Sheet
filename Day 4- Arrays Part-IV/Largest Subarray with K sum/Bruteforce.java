public class Bruteforce {
    public static int maxLen(int arr[], int n){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum==0) max=Math.max(max, j-i+1);
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
