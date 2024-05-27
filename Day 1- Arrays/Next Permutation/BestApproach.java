import java.util.*;

public class BestApproach {
    public static void reverse(int[] nums,int i,int j){
        while (i<j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
    public static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i] = nums[j];
        nums[j]=temp;
    }
    public static void nextPermutation(int[] nums) {
        int n=nums.length;
        int i=n-2;
        while(i>=0 && nums[i]>=nums[i+1]) i--;

        if(i>=0){
            int j=n-1;
            while (j>=0 && nums[j]<=nums[i]) j--;
            swap(nums,i,j);
        }
        reverse(nums,i+1,n-1);
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums)); // Output: [1, 3, 2]
        
        int[] nums2 = {3, 2, 1};
        nextPermutation(nums2);
        System.out.println(Arrays.toString(nums2)); // Output: [1, 2, 3]
        
        int[] nums3 = {1, 1, 5};
        nextPermutation(nums3);
        System.out.println(Arrays.toString(nums3)); // Output: [1, 5, 1]
    }
}
