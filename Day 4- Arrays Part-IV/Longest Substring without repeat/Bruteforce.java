import java.util.*;
public class Bruteforce {
    public static int lengthOfLongestSubstring(String s) {
        int n=s.length(),maxans = Integer.MIN_VALUE;
        if(n == 0) return 0;
        for (int i = 0; i < n; i++) {
            Set < Character > se = new HashSet < > ();
            for (int j = i; j < n; j++){
                if (se.contains(s.charAt(j))) {
                    maxans = Math.max(maxans, j - i);
                    break;
                }
                se.add(s.charAt(j));
            }
        }
        return maxans;
    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
