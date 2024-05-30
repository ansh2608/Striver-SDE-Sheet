public class Best {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length,m=matrix[0].length;
        int l=0,r=n*m-1;
        while (l<=r) {
            int mid=(l+r)/2;
            int row=mid/m,col=mid%m;
            if(matrix[row][col]==target) return true;
            else if(target>matrix[row][col]) l=mid+1;
            else r=mid-1;
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        System.out.println(searchMatrix(matrix, target));
    }
}
