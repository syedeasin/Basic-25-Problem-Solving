public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {12,23,45,12,15};
        int[] reverseArr = reverseArray(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(reverseArr[i]);
        }
    }
    public static int[] reverseArray(int[] arr) {
        int[] reverseArr = new int[arr.length];
        for (int i = arr.length-1; i >= 0; i--) {
            int x = arr.length-(i+1);
            reverseArr[x] = arr[i];

        }
        return reverseArr;
    }
}