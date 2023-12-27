public class PrimeNumber {
    public static void main(String[] args) {
        int x = 230;
        boolean isPrime = true;

        //Solution 01
        //if (x%2 != 0 && x%3 != 0 && x%5 != 0 && x%7 != 0) System.out.println("This is a prime Number");
        //else System.out.println("Not Prime");

        //Solution 02
        for (int i = 2; i <Math.sqrt(x); i++) {
            if(x%i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("This is a prime number");
        } else {
            System.out.println("Not Prime");
        }
    }
}
