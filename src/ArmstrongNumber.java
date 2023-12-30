import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String x = Integer.toString(num);
        int total = 0, len = x.length();

        for (int i = 0; i < len; i++) {
            int singleNum = Integer.parseInt(String.valueOf(x.charAt(i)));
            total = (int) (total + Math.pow(singleNum,len));
        }
        if (total == num) System.out.println("This number is an Armstrong Number");
        else System.out.println("Not an Armstrong Number");
    }
}