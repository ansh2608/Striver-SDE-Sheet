import java.util.*;
public class Bruteforce {
    public static boolean validate(char[][] board,int row,int col){
        int dupRow=row,dupCol=col;
        while(row>=0 && col>=0){
            if(board[row][col]=='Q') return false;
            row--;
            col--;
        }
        row=dupRow;
        col=dupCol;
        while(col>=0 && row<board.length){
            if(board[row][col]=='Q') return false;
            row++;
            col--;
        }
        return true;
    } 
    public static List<String> construct(char[][] board){
        List<String> ans=new ArrayList<>();
        for(int i=0;i<board.length;i++){
            String s=new String(board[i]);
            ans.add(s);
        }
        return ans; 
    }
    public static void helper(int col,char[][] board,List<List<String>> ans){
        if(col==board.length){
            ans.add(construct(board));
            return;
        }
        for(int row=0;row<board.length;row++){
            if(validate(board,row,col)){
                board[row][col]='Q';
                helper(col+1, board, ans);
                board[row][col]='.';
            }
        }
    }
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        helper(0,board,ans);
        return ans;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(solveNQueens(n));
    }
}
