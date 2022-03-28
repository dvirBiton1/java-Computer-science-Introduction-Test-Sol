package Aviv_2020_Moad_B;

public class q1 {
    public static int Binary2Dec(String s) {
        int len = s.length();
        int sum = 0;
        for (int i = 0; i < len; i++) {
            if (s.charAt(len - i - 1) != '1' && s.charAt(len - i - 1) != '0') {
                return -1;
            }
            if (s.charAt(len - i - 1) == '1') {
                sum += Math.pow(2, i);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String s5 = "0101";
        System.out.println(Binary2Dec(s5)); // should return 5
        String se = "abc";
        System.out.println(Binary2Dec(se)); // should return -1
        String s6 = "110";
        System.out.println(Binary2Dec(s6)); // should return 6


    }
}
