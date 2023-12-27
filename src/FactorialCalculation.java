import java.util.Scanner;

public class FactorialCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(factorialCalc(num));
    }
    public static long factorialCalc(int num) {
        int totalValue = 1;
        for(int i = 1; i <= num; i++) {
            totalValue = totalValue*i;
        }
        return totalValue;
    }
}
