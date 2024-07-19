import java.util.PriorityQueue;

class KthLargest {
    PriorityQueue<Integer> heap=new PriorityQueue<>();
    int k;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        for(int n:nums) add(n);
    }
    public int add(int val) {
        heap.offer(val);
        if (heap.size()>k) heap.poll();
        return heap.peek();
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}