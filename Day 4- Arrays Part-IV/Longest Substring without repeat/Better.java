import java.util.*;
public class Better {
    public static int lengthOfLongestSubstring(String s) {
        int n=s.length(),maxans = Integer.MIN_VALUE,l = 0;
        if(n==0) return 0;
        Set < Character > set = new HashSet < > ();
        for (int r = 0; r < n; r++) {
            if (set.contains(s.charAt(r))) {
                while (l < r && set.contains(s.charAt(r))) {
                    set.remove(s.charAt(l));
                    l++;
                }
            }
            set.add(s.charAt(r));
            maxans = Math.max(maxans, r - l + 1);
        }
        return maxans;
    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
