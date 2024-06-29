import java.util.*;
public class Bruteforce {
    public static int countStudents(ArrayList<Integer> A, int pages){
        int n=A.size(), student=1,pagesStudent=0;
        for(int i=0;i<n;i++){
            if(pagesStudent+A.get(i) <= pages) pagesStudent+=A.get(i);
            else {
                student++;
                pagesStudent = A.get(i);
            }
        }
        return student;
    }
    public static int books(ArrayList<Integer> A, int B) {
        if(B>A.size()) return -1;
        int low=Collections.max(A);
        int high=A.stream().mapToInt(Integer::intValue).sum();
        for(int pages=low;pages<=high;pages++){
            if(countStudents(A,pages)==B) return pages;
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