package Q_1_12;

public class sumOfDigits {

	public static void main(String[] args) {
		// mer(8);
		int number=342;
		int sum=0;
		while(number>0) {
			sum+=number%10;
			number=number/10;
		}
		System.out.println(sum);
		
		int num=256;
		int sm=0;
		while (num> 0) {
			sm=sm+num%10;
			num=num/10;
		}
		System.out.println(sm);

		// merdiven
		
		

		System.out.println();

		for (int i = 0; i <= 5; i++) {
			for (int x = 0; x <= i; x++) {
				System.out.print(x + "");
			}
			System.out.println();
		}

		try {

			int a = 10;
			int b = 0;

			int c = a / b;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		// System.out.println(c);
		
	
	
	
	
	}

	}


