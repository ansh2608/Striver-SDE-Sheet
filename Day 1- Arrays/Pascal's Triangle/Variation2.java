public class Variation2 {
    public static void pascalTriangle(int n){
        int ans=1;
        System.out.print(ans+" ");
        for(int i=1;i<n;i++){
            ans *= (n-i);
            ans /= i;
            System.out.print(ans+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n=5;
        pascalTriangle(n);
    }
}
