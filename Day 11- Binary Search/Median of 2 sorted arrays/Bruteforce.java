public class Bruteforce {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double ans=0.0;
        int n1=nums1.length,n2=nums2.length;
        for(int i=0;i<n1;i++) ans+=nums1[i];
        for(int i=0;i<n2;i++) ans+=nums2[i];
        ans=ans/(n1+n2);
        return ans; 
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2}, nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
}
