public class Better2 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length,n2=nums2.length,n=n1+n2;
        int ind2=n/2,ind1=ind2-1;
        int ind1el=-1,ind2el=-1;
        int i=0,j=0,cnt=0;
        while(i<n1 && j<n2){
            if(nums1[i] < nums2[j]){
                if(cnt==ind1) ind1el=nums1[i];
                if(cnt==ind2) ind2el=nums1[i];
                i++;
                cnt++;
            }
            else {
                if(cnt==ind1) ind1el=nums2[j];
                if(cnt==ind2) ind2el=nums2[j];
                j++;
                cnt++;
            }
        }
        while(i<n1){
            if(cnt==ind1) ind1el=nums1[i];
            if(cnt==ind2) ind2el=nums1[i];
            i++;
            cnt++;
        }
        while(j<n2){
            if(cnt==ind1) ind1el=nums2[j];
            if(cnt==ind2) ind2el=nums2[j];
            j++;
            cnt++;
        }
        if(n%2==1) return ind2el;
        return (double)((double)(ind1el+ind2el))/2.0;
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2}, nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
}
