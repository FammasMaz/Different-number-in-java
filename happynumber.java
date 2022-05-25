import java.util.Scanner;

public class happynumber{
	public static boolean happyNumber(int num) {
	int remainder, sum = 0;
	for (int n = 1 ; num>=1 && n<=8 ; n++) {
		while (num>0) {		
			remainder = num%10;
			num = num/10;
			sum += Math.pow(remainder,2);
		}
	num = sum;
	sum = 0;
	if (num==1) {
		return true;
	} 
	}
	return false;
	}

	public static void main(String[] args) {
	Scanner read = new Scanner(System.in);
	int num, count = 0;
	System.out.print("Enter a number: ");
	num = read.nextInt();
	System.out.println("Count		Happy Numbers");
	for(count = 1 ; count<=50 ; count++){
		while (num>0) {
			boolean Happy = happyNumber(num);
			if (Happy){
				System.out.println("  "+count+"		    "+num);
			break;
			}
			else {
				num++;
				continue;
		} 
		} 
	num++;
	} 
	} 
}
 
    
        
            
              
                  
                  
                 
            
            
            
              
                
            
        
        
    

    
        
        
        
        
        
            
              
                
                 
                          
                    
                 
                    
                    
                
            
            
        
    
