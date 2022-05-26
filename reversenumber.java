import java.util.Scanner;

class reversenumber {
    public static int reversenumber(int num) {
        int reverse = 0;
        int rem;
        while (num != 0) {
            rem = num % 10;
            reverse = reverse * 10 + rem;
            num = num / 10;
        }
        return reverse;
    }// method

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number :");
        int num = input.nextInt();
        int reverse = reversenumber(num);
        System.out.println("Reverse of " + num + " is " + reverse);
    }// main
}// class