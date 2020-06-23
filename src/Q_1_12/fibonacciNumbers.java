package Q_1_12;

public class fibonacciNumbers {
	
	public static void fib(int num) {
		int a=0;
		int b=1;
		int c=1;
		for (int i=0; i<num ; i++) {
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
	}
	
	 
	
	
	
	 
 public static void main(String[] args) {
		//0 1 1 2 3 5 8 13 21
		//a
	fib(8);
//		fibonacciNumbers f=new fibonacciNumbers();
//		f.fib(5);
		
		
		int a=0; 
		int b=1;
		int c=1;
		int number=6;
		for (int i=0; i<number; i++) {
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
		
	
	}

		
		//second way
//		int [] arr= {0,1,1,2,3,5,8,13};
//		for (int fib:arr) {
//			System.out.println(fib);
//		}
				

	}


