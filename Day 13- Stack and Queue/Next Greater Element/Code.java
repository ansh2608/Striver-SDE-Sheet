import java.util.*;

public class Code {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st=new Stack<>();
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            if(st.isEmpty()) st.push(nums2[i]);
            while (!st.isEmpty() && st.peek()<nums2[i]) mp.put(st.pop(),nums2[i]);
            st.push(nums2[i]);
        }
        while (!st.isEmpty()) mp.put(st.pop(), -1);
        for(int i=0;i<nums1.length;i++) nums1[i]=mp.get(nums1[i]);
        return nums1;
    }
    public static void main(String[] args) {
        int[] nums1 = {4,1,2}, nums2 = {1,3,4,2};
        int[] ans=nextGreaterElement(nums1, nums2);
        for(int i:ans) System.out.println(i);
    }
}
