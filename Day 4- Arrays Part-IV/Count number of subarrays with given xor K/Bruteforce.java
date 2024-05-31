import java.util.*;
public class Bruteforce {
    public static int solve(ArrayList<Integer> A, int B) {
        int n=A.size(),cnt=0;;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int xor=0;
                for(int k=i;k<=j;k++){
                    xor = xor^A.get(k);
                }
                if(xor==B) cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A=new ArrayList<>();
        A.add(4);
        A.add(2);
        A.add(2);
        A.add(6);
        A.add(4);
        int B = 6;
        System.out.println(solve(A, B));
    }
}