import java.util.ArrayList;
import java.util.List;

public class Better {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length,n2=nums2.length;
        int n=n1+n2,l=0,r=0;
        List<Integer> arr=new ArrayList<>();
        while(l<n1 && r<n2){
            if(nums1[l] < nums2[r]) arr.add(nums1[l++]);
            else arr.add(nums2[r++]);
        }
        while(l<n1) arr.add(nums1[l++]);
        while(r<n2) arr.add(nums2[r++]);
        if(n%2==1) return (double)arr.get(n/2);
        return ((double) arr.get(n/2) + (double) arr.get((n/2)-1))/2.0;
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2}, nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
}
