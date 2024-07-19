public class Main {
    public static int solve(String A) {
        int n=A.length();
        int l=n/2,r=n/2;
        if (n%2==0) l--;
        while (l>=0){
            if(A.charAt(l)==A.charAt(r)){
                l--;
                r++;
            }else r--;
        }
        return (n-r);
    }
    public static void main(String[] args) {
        String A = "ABC";
        System.out.println(solve(A));
    }
}