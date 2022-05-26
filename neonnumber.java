import java.util.Scanner;

class neonnumber {
	public static int neonnumber(int num) {
		int sum = 0;
		int sq = num * num;
		while (sq > 0) {
			int mod = sq % 10;
			sum = sum + mod;
			sq = sq / 10;
		}
		return sum;
	}// method

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number :");
		int num = input.nextInt();
		int sum = neonnumber(num);
		if (sum == num) {
			System.out.println(num + " is neon number");
		} else {
			System.out.println(num + " is not neon number");
		}
	}// main
}// class