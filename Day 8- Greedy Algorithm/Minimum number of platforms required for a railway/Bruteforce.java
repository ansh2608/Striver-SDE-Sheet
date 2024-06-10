public class Bruteforce {
    static int findPlatform(int arr[], int dep[], int n){
        int ans=1;
        for(int i=0;i<n;i++){
            int count=1;
            for(int j=i+1;j<n;j++){
                if((arr[i]>=arr[j] && arr[i]<=dep[j]) || (arr[j]>=arr[i] && arr[j]<=dep[i])) count++;
                ans=Math.max(ans, count);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 6;
        int[] arr = {900, 940, 950, 1100, 1500, 1800};
        int[] dep = {910, 1200, 1120, 1130, 1900, 2000};
        System.out.println(findPlatform(arr, dep, n));
    }
}
