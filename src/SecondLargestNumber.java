import java.util.Arrays;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] arr = {12,23,434,12,456,435,876,32,23};
        Arrays.sort(arr);
        System.out.println("Second Largest Element: " + arr[arr.length - 2]);
    }
}
