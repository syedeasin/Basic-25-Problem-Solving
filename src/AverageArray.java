public class AverageArray {
    public static void main(String[] args) {
        int[] arr = {12,2,3,23,4,5,12};
        int total = 0;

        for(int i = 0; i<arr.length; i++) {
            total = total + arr[i];
        }
        System.out.println("Array avarage is: " + (total/2));
    }
}
