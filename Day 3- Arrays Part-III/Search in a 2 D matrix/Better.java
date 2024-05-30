public class Better {
    public static boolean binarySearch(int[] matrix,int target){
        int l=0,r=matrix.length-1;
        while (l<=r) {
            int mid=(l+r)/2;
            if(matrix[mid]==target) return true;
            else if(target>matrix[mid]) l=mid+1;
            else r=mid-1;
        }
        return false;
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length,m=matrix[0].length;
        for(int i=0;i<n;i++){
            if (matrix[i][0]<=target && matrix[i][m-1]>=target) {
                return binarySearch(matrix[i],target);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        System.out.println(searchMatrix(matrix, target));
    }
}
