public class Best {
    public static int majorityElement(int[] nums) {
        int n=nums.length,cnt=0,el=0;
        for(int i=0;i<n;i++){
            if(cnt==0){
                cnt=1;
                el=nums[i];
            }
            else if(el==nums[i]) cnt++;
            else cnt--;
        }
        int cnt1=0;
        for(int i=0;i<n;i++) if(nums[i]==el) cnt1++;
        if(cnt1>(n/2)) return el;
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }
}
