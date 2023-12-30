import java.util.Scanner;

public class ElementChecking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char element = sc.next().charAt(0);

        if (Character.isUpperCase(element)) System.out.println("This is a Uppercase Letter");
        else if (Character.isLowerCase(element)) System.out.println("This is a Lowercase Letter");
        else if (Character.isDigit(element)) System.out.println("This is a Digit");
        else System.out.println("This is a special character");
    }
}
