package Q_1_12;

public class isPrime {
	
	
	public static void prm(int number) {
		boolean isprm=true;
		
		if (number<1) {
			isprm=false;
		} 
		else {
			for (int i=2; i<number; i++) {
				if(number%i==0) {
					isprm=false;
					break;
				}
			}
		}
		if(isprm) {
				System.out.println(number +" is prime");
			}else {
				System.out.println(number+ "not");
			}
		}
		
			
	
	
	
	
	
	
	
	
	
	
	
public static void main(String[] args) {
		
		prm(-5);
		
		int num=14;
		 boolean isPrime=true;
		 if(num<=1) {
			 isPrime=false;
		 }else {
		 for (int i=2; i<num; i++) {
			 if (num%i==0) {
				 isPrime=false;
				 break;
			 }
		 }
		 }if(isPrime) {
			 System.out.println(num+ " is prime");
		 }else {
			 System.out.println(num+ " is not prime");
		 }
		 
		 
		
		
		 
		

	}

}
