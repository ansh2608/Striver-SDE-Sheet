public class Main {
    public static int compareVersion(String version1, String version2) {
        int i=0,j=0;
        while(i<version1.length() || j<version2.length()){
            int nums1=0,num2=0;
            while(i<version1.length() && version1.charAt(i)!='.'){
                nums1 = nums1*10 + (version1.charAt(i++)-'0');
            }
            while(j<version2.length() && version2.charAt(j)!='.'){
                num2 = num2*10 + (version2.charAt(j++)-'0');
            }
            if(nums1<num2) return -1;
            if(nums1>num2) return 1;
            i++;
            j++;
        }
        return 0;
    }
    public static void main(String[] args) {
        String version1 = "1.2", version2 = "1.10";
        System.out.println(compareVersion(version1,version2));
    }
}