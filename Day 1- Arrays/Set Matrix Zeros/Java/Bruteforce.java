public class Bruteforce {
    public static void markRow(int[][] matrix,int i){
        int m=matrix[0].length;
        for(int j=0;j<m;j++){
            if(matrix[i][j]!=0) matrix[i][j]=-1;
        }
    }
    public static void markCol(int[][] matrix,int j){
        int n=matrix.length;
        for(int i=0;i<n;i++){
            if(matrix[i][j]!=0) matrix[i][j]=-1;
        }
    }
    public static void setZeroes(int[][] matrix) {
        int n=matrix.length,m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    markRow(matrix,i);
                    markCol(matrix,j);
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==-1){
                    matrix[i][j]=0;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(matrix);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}