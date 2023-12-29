public class DuplicateElements {
    public static void main(String[] args) {
            int[] arr = {10,12,10,12,13};
            for (int i = 0; i < arr.length; i++)
            {
                for (int j = 0; j < arr.length; j++ ) {
                    if (arr[i] == arr[j] && i!=j) {
                        System.out.println("This element is duplicate: " + arr[j]);
                        break;
                    }
                }
            }
    }
}
