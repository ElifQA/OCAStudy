package OCA223_Q1_50;

public class Q_01 {
	

//public class Test{
	public static void main(String[] args) {
		int x=1;
		int y=1;
		if (x++ < ++y) {
			System.out.print("Hello ");
		}else {
			System.out.print("Welcome ");
		}
		System.out.print("Log "+x + ":"+y);
	}
	
}
//}

/*
 * What is the result?
A. Hello Log 2:2
B. Welcome Log 1:2
C. Welcome Log 2:1
D. Hello Log 1:2
Answer: A
 */


