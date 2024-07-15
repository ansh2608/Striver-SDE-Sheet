public class Main {
    public static int myAtoi(String s) {
        if (s.isEmpty()) return 0;
        s = s.trim();
        int count = 0, sign = 1, i = 0;
        if (s.charAt(0) == '-') {
            sign = -1;
            i = 1;
        }
        else if (s.charAt(0) == '+') i = 1;
        for (; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) break;
            int n = s.charAt(i) - '0';
            if (count > (Integer.MAX_VALUE - n) / 10)
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            count = count * 10 + n;
        }
        count = count * sign;
        return count;
    }
    public static void main(String[] args) {
        String s = "-042";
        System.out.println(myAtoi(s));
    }
}