import java.util.*;
public class Bruteforce {
    public static int median(int matrix[][], int R, int C){
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                arr.add(matrix[i][j]);
            }
        }
        Collections.sort(arr);
        return arr.get((R*C)/2);
    }
    public static void main(String[] args) {
        int R = 3, C = 3;
        int[][] M = {{1, 3, 5}, {2, 6, 9}, {3, 6, 9}};
        System.out.println(median(M, R, C));
    }
}
