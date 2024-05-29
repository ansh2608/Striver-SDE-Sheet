public class Best {
    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
    public static void rotate(int[][] matrix) {
        int k=matrix.length;
        for(int i=0;i<k;i++){
            for(int j=i;j<k;j++){
                swap(matrix[i][j],matrix[j][i]);
            }
        }
        for(int x=0;x<matrix.length;x++){
            int left=0;
            int right=matrix.length-1;
            while(left<right){
                swap(matrix[x][right],matrix[x][left]);
                left++;
                right--;
            }
        }

    }
    public static void main(String args[]) {
        int rotated[][] =  {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(rotated);
        System.out.println("Rotated Image");
        for (int i = 0; i < rotated.length; i++) {
            for (int j = 0; j < rotated.length; j++) {
                System.out.print(rotated[i][j] + " ");
            }
            System.out.println();
        }
    }
}
