import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (B > A.size()) return ans;
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < B; i++) mp.put(A.get(i), mp.getOrDefault(A.get(i), 0) + 1);
        ans.add(mp.size());
        for (int i = B; i < A.size(); i++) {
            int removeElement = A.get(i - B);
            if (mp.get(removeElement) == 1) mp.remove(removeElement);
            else mp.put(removeElement, mp.get(removeElement) - 1);
            mp.put(A.get(i), mp.getOrDefault(A.get(i), 0) + 1);
            ans.add(mp.size());
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> A1 = new ArrayList<>();
        A1.add(1);
        A1.add(2);
        A1.add(1);
        A1.add(3);
        A1.add(4);
        A1.add(3);
        int B1 = 3;
        System.out.println(dNums(A1, B1)); // Output: [2, 3, 3, 2]

        ArrayList<Integer> A2 = new ArrayList<>();
        A2.add(1);
        A2.add(1);
        A2.add(2);
        A2.add(2);
        int B2 = 1;
        System.out.println(dNums(A2, B2)); // Output: [1, 1, 1, 1]
    }
}
