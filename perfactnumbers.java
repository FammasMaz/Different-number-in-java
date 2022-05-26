import java.util.Scanner;

class perfactnumber {
    public static boolean perfectnumber(int num) {
        boolean perfect = true;
        int sum = 0;
        for (int x = 1; x < num; x++) {
            if (num % x == 0) {
                sum += x;
            } // if
        } // for
        if (sum == num) {
            perfect = false;
        }
        return perfect;
    }// method

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number :");
        int num = input.nextInt();
        boolean perfect = perfectnumber(num);
        if (perfect == false) {
            System.out.println(num + " is Perfect Number.");
        } else {
            System.out.println(num + " is not Perfect Number.");
        }
    }// main
}// class