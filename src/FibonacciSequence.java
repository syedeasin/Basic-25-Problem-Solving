import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements you want to see: ");
        int n = sc.nextInt();

        int[] fibonacciSeris = new int[n];
        fibonacciSeris[0] = 0;
        fibonacciSeris[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacciSeris[i] = fibonacciSeris[i-2]+fibonacciSeris[i-1];
        }
        for (int i = 0; i < n; i++) {
            System.out.println(fibonacciSeris[i]);
        }
    }
}
