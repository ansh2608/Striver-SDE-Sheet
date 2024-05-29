public class Better {
    public static int findDuplicate(int[] nums) {
        int n=nums.length;
        int[] freq=new int[n+1];
        for(int i=0;i<n;i++){
            if (freq[nums[i]]==0) freq[nums[i]]++;
            else return nums[i];
        }
        return 0;
    }    
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }
}
