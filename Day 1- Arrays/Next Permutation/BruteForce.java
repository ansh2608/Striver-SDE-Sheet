import java.util.*;

public class BruteForce {
    public static void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void helper(int[] nums, List<List<Integer>> ans, int idx) {
        if (idx == nums.length - 1) {
            List<Integer> list = new ArrayList<>();
            for (int num : nums) list.add(num);
            ans.add(list);
        } else {
            for (int i = idx; i < nums.length; i++) {
                swap(i, idx, nums);
                helper(nums, ans, idx + 1);  // use idx + 1 instead of 0
                swap(i, idx, nums);
            }
        }
    }

    public static List<List<Integer>> permutation(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums, ans, 0);
        return ans;
    }

    public static void nextPermutation(int[] nums) {
        List<List<Integer>> allPermutations = permutation(nums);

        // Sort the permutations to ensure they are in lexicographical order
        allPermutations.sort((a, b) -> {
            for (int i = 0; i < a.size(); i++) {
                if (!a.get(i).equals(b.get(i))) {
                    return a.get(i) - b.get(i);
                }
            }
            return 0;
        });

        // Find the index of the current permutation
        int idx = -1;
        for (int i = 0; i < allPermutations.size(); i++) {
            List<Integer> perm = allPermutations.get(i);
            boolean match = true;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] != perm.get(j)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                idx = i;
                break;
            }
        }

        // Get the next permutation
        if (idx != -1) {
            List<Integer> nextPerm;
            if (idx == allPermutations.size() - 1) {
                nextPerm = allPermutations.get(0);  // Wrap around to the first permutation
            } else {
                nextPerm = allPermutations.get(idx + 1);
            }

            // Copy the next permutation back to the original array
            for (int i = 0; i < nums.length; i++) {
                nums[i] = nextPerm.get(i);
            }
        }
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