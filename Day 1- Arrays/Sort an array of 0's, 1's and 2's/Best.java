public class Best {
    public static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void sortColors(int[] nums) {
        int low=0,mid=0,hi=nums.length-1;
        while(mid<=hi){
            if(nums[mid]==0){
                swap(nums,low,mid);
                low++;
                mid++;
            }
            else if(nums[mid]==1) mid++;
            else{
                swap(nums,mid,hi);
                hi--;
            }
        }
    }    
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0,1};
        sortColors(nums);
        for(int i:nums) System.out.print(i+" ");
    }
}
