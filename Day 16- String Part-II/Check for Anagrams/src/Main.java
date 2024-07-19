import java.util.HashMap;

public class Main {
    public static boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()) return false;
        HashMap<Character,Integer> mp=new HashMap<>();
        for(Character str:s.toCharArray()) mp.put(str,mp.getOrDefault(str,0)+1);
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if (!mp.containsKey(ch)) return false;
            int curr=mp.get(ch);
            mp.put(ch,curr-1);
        }
        for(Integer i:mp.values()) if(i!=0) return false;
        return true;
    }
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s,t));
    }
}