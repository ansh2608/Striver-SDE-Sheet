public class Bruteforce {
    public static boolean linearSearch(int[] nums,int a){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==a) return true;
        }
        return false;
    }
    public static int longestConsecutive(int[] nums) {
        int n=nums.length,longest=1;
        for(int i=0;i<n;i++){
            int x=nums[i],cnt=1;
            while (linearSearch(nums,x+1)) {
                x++;
                cnt++;
            }
            longest=Math.max(longest, cnt);
        }
        return longest;
    }
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));
    }
}
