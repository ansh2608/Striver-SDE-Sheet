public class Better {
    public static void sortColors(int[] nums) {
        int count0=0,count1=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) count0++;
            if(nums[i]==1) count1++;
        }
        for(int i=0;i<count0;i++) nums[i]=0;
        for(int i=count0;i<count0+count1;i++) nums[i]=1;
        for(int i=count0+count1;i<nums.length;i++) nums[i]=2;
    }
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0,1};
        sortColors(nums);
        for(int i:nums) System.out.print(i+" ");
    }
}
