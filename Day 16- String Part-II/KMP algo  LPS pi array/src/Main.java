public class Main {
    public static int strStr(String haystack, String needle) {
        int n=haystack.length()-needle.length()+1;
        for(int i=0;i<n;i++){
            String str=haystack.substring(i,i+needle.length());
            if(needle.equals(str)) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        String haystack = "leetcode", needle = "leeto";
        System.out.println(strStr(haystack,needle));
    }
}