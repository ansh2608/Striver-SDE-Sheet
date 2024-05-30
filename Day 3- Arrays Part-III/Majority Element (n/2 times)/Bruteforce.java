public class Bruteforce {
    public static int majorityElement(int[] nums) {
        int n=nums.length,cnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(nums[i]==nums[j]) cnt++;
            }
            if(cnt>(n/2)) return nums[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }
}
