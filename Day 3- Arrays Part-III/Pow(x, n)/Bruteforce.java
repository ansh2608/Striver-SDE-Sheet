public class Bruteforce {
    public static double myPow(double x, int n) {
        double ans=1.0;
        for(int i=0;i<n;i++) ans*=x;
        return ans;
    }
    public static void main(String[] args) {
        double x = 2.00000;
        int n = 10;
        System.out.println(myPow(x, n));
    }
}
