public class Main {
    public static void dfs(int sr, int sc, int[][] image, int[][] ans,int color, int[] delRow, int[] delCol, int inColor){
        int n= image.length, m= image[0].length;
        ans[sr][sc]=color;
        for(int i=0;i<4;i++){
            int row=sr+delRow[i];
            int col=sc+delCol[i];
            if(row>=0 && col>=0 && row<n && col<m && image[row][col]==inColor && ans[row][col]!=color){
                dfs(row,col,image,ans,color,delRow,delCol,inColor);
            }
        }
    }
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int inColor=image[sr][sc];
        int[][] ans=image;
        int[] delRow={-1,0,1,0};
        int[] delCol={0,1,0,-1};
        dfs(sr,sc,image,ans,color,delRow,delCol,inColor);
        return ans;
    }
    public static void main(String[] args) {
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1, sc = 1, color = 2;
        int[][] ans=floodFill(image,sr,sc,color);
        for (int i=0;i< ans.length;i++){
            for (int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}