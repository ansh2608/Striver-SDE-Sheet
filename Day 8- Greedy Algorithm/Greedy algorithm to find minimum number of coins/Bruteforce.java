public class Bruteforce {
    public static int minCoins(int coins[], int M, int V) {
        int count=0;
        for(int i=0;i<M;i++){
            while(V>=coins[i]){
                V -= coins[i];
                count++;
            }
        }
        return count;
    }    
    public static void main(String[] args) {
        int V = 11, M = 4, coins[] = {9,6,5,1};
        System.out.println(minCoins(coins, M, V));
    }
}
