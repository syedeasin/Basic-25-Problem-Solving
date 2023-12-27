import java.util.Scanner;

public class PalindromNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char ch;
        boolean x = true;

        input = input.toLowerCase(); //Full String is in a Same Case

        for (int i = 0; i < input.length(); i++){
            x = palindromFunc(i, input,input.charAt(i));
            if (x==false) {
                System.out.println("This is Not Palindrom");
                break;
            }
        }
        if (x==true) System.out.println("This is Palindrom");
    }

    public static boolean palindromFunc(int i, String input, char ch) {
        boolean result = false;
        if(input.charAt(input.length()-(i+1)) == ch) {
            result = true;
        }
        return result;
    }
}