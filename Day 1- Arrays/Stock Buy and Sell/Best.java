public class Best {
    public static int maxProfit(int[] prices) {
        int maxPro=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            min=Math.min(min,prices[i]);
            maxPro=Math.max(maxPro,prices[i]-min);
        }
        return maxPro;
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
