public class LargestElementOfArray {
    public static void main(String[] args) {
        int[] arr = {12,23,45,12,15};
        System.out.println(largeElement(arr));
    }
    public static int largeElement(int[] arr) {
        int largeElement = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (largeElement<arr[i]){
                largeElement = arr[i];
            }
        }
        return largeElement;
    }
}
