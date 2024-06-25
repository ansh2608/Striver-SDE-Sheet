public class Best {
    public static boolean isValid(char[][] board,int row,int col,char c){
        for(int i=0;i<9;i++){
            if(board[row][i]==c) return false;
            if(board[i][col]==c) return false;
            if(board[3*(row/3)+i/3][3*(col/3)+i%3]==c) return false;
        }
        return true;
    }
    public static boolean solve(char[][] board,int count){
        if(count==9*9) return true;
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    for(char c='1';c<='9';c++){
                        if(isValid(board,i,j,c)){
                            board[i][j]=c;
                            if(solve(board, count+1)) return true;
                            else board[i][j]='.';
                        }
                    }
                    return false;
                }
            }
        }
        return false;
    }
    public static void solveSudoku(char[][] board) {
        int count=0;
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.') count++;
            }
        }
        solve(board,count);
    }
    public static void main(String[] args) {
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        solveSudoku(board);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) System.out.print(board[i][j] + " ");
            System.out.println();
        }
    }
}
