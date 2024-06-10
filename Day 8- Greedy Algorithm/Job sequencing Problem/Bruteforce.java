import java.util.Arrays;

public class Bruteforce {
    public static class Job {
        int id, profit, deadline;
        Job(int x, int y, int z){
            this.id = x;
            this.deadline = y;
            this.profit = z; 
        }
    }
    public static int[] JobScheduling(Job arr[], int n){
        Arrays.sort(arr, (a, b) -> (b.profit - a.profit));
        int maxi = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i].deadline > maxi) maxi = arr[i].deadline;
        }
        int result[] = new int[maxi + 1];
        for (int i = 1; i <= maxi; i++) result[i] = -1;
        int countJobs = 0, jobProfit = 0;
        for (int i = 0; i < n; i++) {
            for (int j = arr[i].deadline; j > 0; j--) {
                if (result[j] == -1) {
                    result[j] = i;
                    countJobs++;
                    jobProfit += arr[i].profit;
                    break;
                }
            }
        }
        return new int[]{countJobs,jobProfit};
    }
    public static void main(String[] args) {
        int N = 4;
        Job[] arr = new Job[N];
        arr[0] = new Job(1, 4, 20);
        arr[1] = new Job(2, 1, 10);
        arr[2] = new Job(3, 1, 40);
        arr[3] = new Job(4, 1, 30);
        int[] ans=JobScheduling(arr, N);
        System.out.println(ans[0]);
        System.out.println(ans[1]);
    }
}
