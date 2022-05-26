import java.util.Scanner;
class uglynumber{
	public static boolean uglynumber(int num){		
		boolean rev=true;
		while(num>1){
			if(num%2==0){
				num=num/2;
			}
			else if(num%3==0){
				num=num/3;
			}
			else if(num%5==0){
				num=num/5;
			}
			else{
				return rev=false;
			}
		}
		return rev;		
	}// method

	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Number :");
		int num=input.nextInt();
		boolean rev=uglynumber(num);
		if (rev) {
			System.out.println(num+" is ugly number");
		}
		else {
			System.out.println(num+" is not ugly number");
		}				
	}//main
}//class