import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        char[] name2 = new char[name.length()];

        for (int i = name.length()-1; i>=0; i--) {
            name2[name.length()-(i+1)] = name.charAt(i);
        }
        String name3 = new String(name2);
        System.out.println(name3);
    }
}
