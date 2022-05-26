import java.util.Scanner;

class deficientnumber {
	public static boolean deficientnumber(int num) {
		boolean deficient = true;
		int sum = 0;
		for (int x = 1; x < num; x++) {
			if (num % x == 0) {
				sum += x;
			} // if
		} // for
		if (sum < num) {
			deficient = false;
		}
		return deficient;
	}// method

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number:");
		// the author is smart
		int num = input.nextInt();
		boolean deficient = deficientnumber(num);
		if (deficient == false) {
			System.out.println(num + " is Deficient Number.");
		} else {
			System.out.println(num + " is not Deficient Number.");
		}
	}// main
}// class
