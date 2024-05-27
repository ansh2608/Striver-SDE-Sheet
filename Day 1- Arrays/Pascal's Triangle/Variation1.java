public class Variation1 {
    public static int ncr(int n,int r){
        int ans=1;
        for(int i=0;i<r;i++){
            ans *= (n-i);
            ans /= (i+1);
        }
        return ans;
    }
    public static void main(String[] args) {
        int r=5;
        int c=2;
        System.out.println(ncr(r-1, c-1));
    }
}