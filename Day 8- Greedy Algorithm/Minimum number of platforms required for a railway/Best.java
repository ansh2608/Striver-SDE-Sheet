import java.util.Arrays;

public class Best {
    static int findPlatform(int arr[], int dep[], int n){
        Arrays.sort(arr);
        Arrays.sort(dep);
        int plat_needed=1,res=1;
        int i=1,j=0;
        while (i<n && j<n) {
            if(arr[i]<=dep[j]){
                plat_needed++;
                i++;
            }
            else if (arr[i]>dep[j]) {
                plat_needed--;
                j++;
            }
            if(plat_needed>res) res=plat_needed;
        }
        return res;
    }
    public static void main(String[] args) {
        int n = 6;
        int[] arr = {900, 940, 950, 1100, 1500, 1800};
        int[] dep = {910, 1200, 1120, 1130, 1900, 2000};
        System.out.println(findPlatform(arr, dep, n));
    }
}
