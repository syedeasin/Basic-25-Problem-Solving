import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double f = sc.nextDouble();
        double c = sc.nextDouble();

        System.out.println(fahrenheit(c));
        System.out.println(celsius(f));
    }
    public static double fahrenheit(double c) {
        double f = (c*1.8)+32;
        return f;
    }

    public static double celsius(double f) {
        double c = 0.555556*(f-32);

        return c;
    }
}
