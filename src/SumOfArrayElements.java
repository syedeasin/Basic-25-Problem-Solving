public class SumOfArrayElements {
    public static void main(String[] args) {
        int[] arr = {12,23,45,12,15};
        System.out.println("Sum of Array Elements Are: " + totalSum(arr));
    }
    public static int totalSum(int[] arr){
        int total = 0;
        for (int i = 0; i<arr.length; i++) {
            total = total + arr[i];
        }
        return total;
    }
}
