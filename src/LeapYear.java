import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if(year%4 == 0) {
            if (year%100 == 0){
                if (year%400 == 0){
                    System.out.println("This Year Is A Leap Year: " + year);
                }
                else System.out.println("This Year is not a Leap Year");
            }
            else System.out.println("This Year Is A Leap Year: " + year);
        }
        else System.out.println("This Year is not a Leap Year");
    }
}
