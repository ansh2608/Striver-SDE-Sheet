public class nCr {
    public static int ncr(int n,int r){
        int ans=1;
        for (int i=0;i<r;i++){
            ans*=(n-i);
            ans/=(i+1);
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=11,r=4;
        System.out.println(ncr(n-1,r-1));
    }
}
