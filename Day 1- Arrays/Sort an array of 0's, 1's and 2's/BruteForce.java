import java.util.Arrays;

public class BruteForce {
    public static void sortColors(int[] nums) {
        Arrays.sort(nums);
    }
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        for(int i:nums) System.out.print(i+" ");
    }
}
