import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = {3,1,2,4,5,7,8,3};
        System.out.println(linearSearch(arr,num));

    }
    public static int linearSearch(int[] arr, int num) {
        int x = 0;
        for (int i = 0; i<arr.length;i++){
            if(arr[i] == num) {
                x = i;
            }
        }
        return x;
    }
}
