public class Best {
    public static int upperBound(int[] arr,int x,int C){
        int low=0,high=C-1,ans=C;
        while (low<=high) {
            int mid=(low+high)/2;
            if(arr[mid]>x){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
    public static int countSmallEqual(int[][] matrix,int R,int C,int mid){
        int cnt=0;
        for(int i=0;i<R;i++){
            cnt+=upperBound(matrix[i],mid,C);
        }
        return cnt;
    }
    public static int median(int matrix[][], int R, int C){
        int low=Integer.MAX_VALUE,high=Integer.MIN_VALUE;
        for(int i=0;i<R;i++){
            low=Math.min(low,matrix[i][0]);
            high=Math.max(high,matrix[i][C-1]);
        }
        int req=(R*C)/2;
        while (low<=high) {
            int mid=(low+high)/2;
            int smallEqual=countSmallEqual(matrix,R,C,mid);
            if(smallEqual <= req) low=mid+1;
            else high=mid-1;
        }
        return low;
    }
    public static void main(String[] args) {
        int R = 3, C = 3;
        int[][] M = {{1, 3, 5}, {2, 6, 9}, {3, 6, 9}};
        System.out.println(median(M, R, C));
    }
}
