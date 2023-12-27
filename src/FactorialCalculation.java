import java.util.Scanner;

public class FactorialCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(factorialCalc(num));
    }
    public static long factorialCalc(int num) {
        long totalValue = 1l;
        for (int i =0; i < num; i++) {
            totalValue = totalValue*(num-i);
        }
        return totalValue;
    }
}
