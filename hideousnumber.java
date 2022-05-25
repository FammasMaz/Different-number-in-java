import java.util.Scanner;

public class hideousnumber {
    public static void hideousNumber(int num) {
        int remain = num;
        while (num >= 1) {
            if (num % 2 == 0) {
                num = num / 2;
                continue;
            }
            if (num % 3 == 0) {
                num = num / 3;
                continue;
            }
            if (num % 5 == 0) {
                num = num / 5;
                continue;
            }
            if (num == 1) {
                break;
            } else if (num % 2 != 0 || num % 3 != 0 || num % 5 != 0) {
                break;
            }
        }
        if (num == 1) {
            System.out.println(remain + " is a hideous number");
        } else {
            System.out.println(remain + " is not a hideos number");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num = input.nextInt();
        hideousNumber(num);
    }
}
