public class Best {
    public static int uniquePaths(int m, int n) {
        int N = m+n-2,r=m-1;
        double res=1;
        for(int i=1;i<=r;i++) res = res*(N-r+i)/i;
        return (int)res;
    }
    public static void main(String[] args) {
        int m = 3, n = 2;
        System.out.println(uniquePaths(m, n));
    }
}