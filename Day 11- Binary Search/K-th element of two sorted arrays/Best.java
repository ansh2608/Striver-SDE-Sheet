public class Best {
    public static long kthElement( int a[], int b[], int m, int n, int k) {
        if (m > n) return kthElement(b, a, n, m, k);
        int left = k;
        int low = Math.max(0, k - n), high = Math.min(k, m);
        while (low <= high) {
            int mid1 = (low + high) >> 1;
            int mid2 = left - mid1;
            int l1 = Integer.MIN_VALUE, l2 = Integer.MIN_VALUE;
            int r1 = Integer.MAX_VALUE, r2 = Integer.MAX_VALUE;
            if (mid1 < m) r1 = a[mid1];
            if (mid2 < n) r2 = b[mid2];
            if (mid1 - 1 >= 0) l1 = a[mid1 - 1];
            if (mid2 - 1 >= 0) l2 = b[mid2 - 1];
            if (l1 <= r2 && l2 <= r1) return Math.max(l1, l2);
            else if (l1 > r2) high = mid1 - 1;
            else low = mid1 + 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr1 = {100, 112, 256, 349, 770}, arr2 = {72, 86, 113, 119, 265, 445, 892};
        int k = 7;
        System.out.println(kthElement(arr1, arr2, arr1.length, arr2.length, k));
    }
}
