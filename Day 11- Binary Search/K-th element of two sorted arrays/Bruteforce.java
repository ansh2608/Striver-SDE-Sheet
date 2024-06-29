import java.util.ArrayList;
import java.util.List;

public class Bruteforce {
    public static long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        List<Integer> arr=new ArrayList<>();
        int i=0,j=0;
        while (i<n && j<m) {
            if(arr1[i] < arr2[j]) arr.add(arr1[i++]);
            else arr.add(arr2[j++]);
        }
        while(i<n) arr.add(arr1[i++]);
        while(j<m) arr.add(arr2[j++]);
        return arr.get(k-1);
    }
    public static void main(String[] args) {
        int[] arr1 = {100, 112, 256, 349, 770}, arr2 = {72, 86, 113, 119, 265, 445, 892};
        int k = 7;
        System.out.println(kthElement(arr1, arr2, arr1.length, arr2.length, k));
    }
}
