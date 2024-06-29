import java.util.*;
public class Best {
    public static int countStudents(ArrayList<Integer> arr, int pages) {
        int n = arr.size();
        int students = 1;
        long pagesStudent = 0;
        for (int i = 0; i < n; i++) {
            if (pagesStudent + arr.get(i) <= pages) pagesStudent += arr.get(i);
            else {
                students++;
                pagesStudent = arr.get(i);
            }
        }
        return students;
    }
    public static int books(ArrayList<Integer> A, int B) {
        if (B > A.size()) return -1;
        int low = Collections.max(A);
        int high = A.stream().mapToInt(Integer::intValue).sum();
        while (low <= high) {
            int mid = (low + high) / 2;
            int students = countStudents(A, mid);
            if (students > B) low = mid + 1;
            else high = mid - 1;
        }
        return low;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A=new ArrayList<>();
        A.add(12);
        A.add(34);
        A.add(67);
        A.add(90);
        int B = 2;
        System.out.println(books(A, B));
    }
}