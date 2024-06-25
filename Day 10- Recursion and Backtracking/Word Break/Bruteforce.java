import java.util.*;

public class Bruteforce {
    public static ArrayList<String> wordBreakHelper(String s, int idx, HashSet<String> dictSet, int size){
        if (idx == size){   
            ArrayList<String> temp = new ArrayList<>();
            temp.add("");
            return temp;
        }
        ArrayList<String> subPart = new ArrayList<>();
        ArrayList<String> completePart = new ArrayList<>();
        String word = "";
        for (int j = idx; j < size; j++){
            word += s.charAt(j);
            if (dictSet.contains(word) == false) continue;
            subPart = wordBreakHelper(s, j + 1, dictSet, size);
            for (int i = 0; i < subPart.size(); i++){  
                if (subPart.get(i).length() != 0){
                    String temp = word;
                    temp += " ";
                    temp += subPart.get(i);
                    subPart.set(i , temp);
                }
            else subPart.set(i, word);
            }
            for (int i = 0; i < subPart.size(); i++) completePart.add(subPart.get(i));
        }
        return completePart;
    }

    public static ArrayList<String> wordBreak(String s, ArrayList<String> dictionary) {
        HashSet<String> dictSet = new HashSet<String>();
        for (int i = 0; i < dictionary.size(); i++) dictSet.add(dictionary.get(i));
        return wordBreakHelper(s, 0, dictSet, s.length());
    }
    public static void main(String[] args) {
        ArrayList<String> dictionary=new ArrayList<>();
        dictionary.add("god");
        dictionary.add("is");
        dictionary.add("now");
        dictionary.add("no");
        dictionary.add("where");
        dictionary.add("here");
        String s = "godisnowherenowhere";
        System.out.println(wordBreak(s, dictionary));
    }
}
