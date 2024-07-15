public class Main {
    public static String reverseWords(String s) {
        String ans="";
        String[] str=s.trim().split("\\s+");
        for(int i=str.length-1;i>0;i--) ans+=str[i]+" ";
        return ans+str[0];
    }
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }
}