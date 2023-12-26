public class EvenOddOfArray {
    public static void main(String[] args) {
        int[] arr = {12,23,45,12,15};
        evenOrOdd(arr);
    }
    public static int evenOrOdd(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                System.out.println("Array Index: " + i + " And Value is: " + arr[i] + " is Even");
            }
            else System.out.println("Array Index: " + i + " And Value is: " + arr[i] + " is Odd");
        }
        return 0;
    }
}