import java.util.Arrays;

public class Best {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int l=m-1,r=0;
        while (l>=0 && r<n) {
            if(nums1[l]>nums2[r]){
                int temp=nums1[l];
                nums1[l]=nums2[r];
                nums2[r]=temp;
                l--;
                r++;
            }
            else break;
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3}, nums2 = {2,5,6};
        int m = 3, n = 3;
        merge(nums1, m, nums2, n);
        System.out.println("The merged arrays are:");
        System.out.print("arr1[] = ");
        for (int i = 0; i < n; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.print("\narr2[] = ");
        for (int i = 0; i < m; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println();
    }
}
