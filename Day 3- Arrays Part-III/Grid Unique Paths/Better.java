public class Better {
    public static int helper(int m, int n,int i,int j,int[][] dp) {
        if(i>=m || j>=n) return 0;
        if(i==m-1 && j==n-1) return 1;
        if(dp[i][j]!=0) return dp[i][j];
        return dp[i][j]=helper(m, n, i+1, j,dp) + helper(m, n, i, j+1,dp);
    }
    public static int uniquePaths(int m, int n) {
        int[][] dp=new int[m+1][n+1];
        int num=helper(m, n, 0, 0,dp);
        if(m==1 && n==1) return num;
        return dp[0][0];
    }
    public static void main(String[] args) {
        int m = 3, n = 2;
        System.out.println(uniquePaths(m, n));
    }
}