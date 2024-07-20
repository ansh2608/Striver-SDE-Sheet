import java.util.*;

public class Main {
    public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> kArrays, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < kArrays.get(i).size(); j++)
                result.add(kArrays.get(i).get(j));
        }
        Collections.sort(result);
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}