public class Bruteforce {
    public static long pow(int b,int exp){
        long ans=1,base=b;
        while(exp>0){
            if(exp%2==1){
                exp--;
                ans = ans*base;
            }
            else {
                exp /= 2;
                base = base*base;
            }
        }
        return ans;
    }
    public static int NthRoot(int n, int m) {
        for(int i=1;i<=m;i++){
            long val=pow(i,n);
            if(val==(long)m) return i;
            else if(val>(long)m) break;
        }
        return -1;
    }
    public static void main(String[] args) {
        int n=3,m=27;
        System.out.println(NthRoot(n, m));
    }
}
