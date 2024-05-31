import java.util.*;
public class Best {
    public static int lengthOfLongestSubstring(String s) {
        HashMap < Character, Integer > mpp = new HashMap < Character, Integer > ();
        int left = 0, right = 0, n = s.length(), len = 0;
        while (right < n) {
            if (mpp.containsKey(s.charAt(right))) left = Math.max(mpp.get(s.charAt(right)) + 1, left);
            mpp.put(s.charAt(right), right);
            len = Math.max(len, right - left + 1);
            right++;
        }
        return len;
    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
