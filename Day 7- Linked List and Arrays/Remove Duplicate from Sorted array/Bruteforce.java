import java.util.*;

public class Bruteforce {
    public static int removeDuplicates(int[] nums) {
        HashSet < Integer > set = new HashSet < > ();
        for (int i : nums) set.add(i);
        int j = 0;
        for (int x: set) nums[j++] = x;
        return set.size();
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }
}
