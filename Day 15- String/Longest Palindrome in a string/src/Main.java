public class Main {
    public static int maxLen=0, Lo=0;
    public static String longestPalindrome(String s) {
        char[] input=s.toCharArray();
        if(s.length() < 2) return s;
        for(int i=0; i<input.length; i++){
            expandPalindrome(input,i,i);
            expandPalindrome(input,i,i+1);
        }
        return s.substring(Lo,Lo+maxLen);
    }
    public static void expandPalindrome(char[] s, int j, int k){
        while(j>=0 && k<s.length && s[j]==s[k]){
            j--;
            k++;
        }
        if(maxLen<k-j-1){
            maxLen = k-j-1;
            Lo = j+1;
        }
    }
    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }
}