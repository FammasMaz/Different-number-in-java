import java.util.Scanner;

public class abunduntnumber {
    public static int abunduntNumber(int num) {
        int i = 1, sum = 0;

        while (i < num) {

            if (num % i == 0) {
                sum += i;
            }

            i++;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int num, remain;

        System.out.print("Enter a num: ");
        num = read.nextInt();

        remain = num;

        int divisor = abunduntNumber(num);

        num = remain;

        if (divisor > num) {

            System.out.println(num + " is an abundant num");

        } else {
            System.out.println(num + " is not an abundant num");
        }
    }
}