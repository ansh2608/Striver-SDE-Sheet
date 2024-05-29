public class Bruteforce {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ans=new int[n+m];
        int left=0,right=0,idx=0;
        while (left<n && right<m) {
            if(nums1[left] <= nums2[right]) ans[idx++] = nums1[left++];
            else ans[idx++] = nums2[right++];
        }
        while (left < n) ans[idx++] = nums1[left++];
        while (right < m) ans[idx++] = nums2[right++];
        for(int i=0;i<n+m;i++){
            if (i<n) nums1[i]=ans[i];
            else nums2[i-n]=ans[idx];
        }
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0}, nums2 = {2,5,6};
        int m = 3, n = 3;
        merge(nums1, m, nums2, n);
    }
}
