import java.util.*;
public class Code {
    public static boolean isPalindrome(String s,int st,int end){
        while(st<end){
            if(s.charAt(st++)!=s.charAt(end--)) return false;
        }
        return true;
    }
    public static void helper(int idx,String s,List<String> ds,List<List<String>> ans){
        if(idx==s.length()){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=idx;i<s.length();i++){
            if(isPalindrome(s,idx,i)){
                ds.add(s.substring(idx, i+1));
                helper(i+1, s, ds, ans);
                ds.remove(ds.size()-1);
            }
        }
    }
    public static List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        helper(0,s,new ArrayList<>(),ans);
        return ans;
    }
    public static void main(String[] args) {
        String s = "aab";
        System.out.println(partition(s));
    }
}
