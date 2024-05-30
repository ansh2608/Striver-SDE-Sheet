public class Bruteforce {
    public static int helper(int m, int n,int i,int j) {
        if(i>=m || j>=n) return 0;
        if(i==m-1 && j==n-1) return 1;
        return helper(m, n, i+1, j) + helper(m, n, i, j+1);
    }
    public static int uniquePaths(int m, int n) {
        return helper(m, n, 0, 0);
    }
    public static void main(String[] args) {
        int m = 3, n = 2;
        System.out.println(uniquePaths(m, n));
    }
}