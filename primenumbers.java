import java.util.Scanner;

public class primenumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int x = input.nextInt();
        boolean isPrime = true;
        for (int n = 2; n < x; n++) {
            if (x % n == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println(x + " is a prime number.");
        } else {
            System.out.println(x + " is not a prime number.");
        }
    }
}