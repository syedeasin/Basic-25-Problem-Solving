import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        char[] ch = new char[name.length()];


        int len = name.length();
        for (int i = name.length()-1, j = 0; i >= 0; j++,i--) {
            ch[j] = name.charAt(i);
        }
        String reverseString = new String(ch);
        System.out.println(reverseString);
    }
}
