public class Better {
    public static long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        int el=-1,count=0,i=0,j=0;
        while(i<n && j<m){
            if(arr1[i] < arr2[j]){
                if(count==k-1) el=arr1[i];
                i++;
                count++;
            }
            else{
                if(count==k-1) el=arr2[j];
                j++;
                count++;
            }
        }
        while(i<n){
            if(count==k-1) el=arr1[i];
            i++;
            count++;
        }
        while(j<m){
            if(count==k-1) el=arr2[j];
            j++;
            count++;
        }
        return el;
    }
    public static void main(String[] args) {
        int[] arr1 = {100, 112, 256, 349, 770}, arr2 = {72, 86, 113, 119, 265, 445, 892};
        int k = 7;
        System.out.println(kthElement(arr1, arr2, arr1.length, arr2.length, k));
    }
}
