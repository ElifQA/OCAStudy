package Q_1_12;



public class Q01 {
	public static void doSum(Integer x, Integer y) {
		System.out.println("Integer sum is "+ (x+y));
	}
	public static void doSum(double x, double y) {
		System.out.println("double sum is "+ (x+y));
	}
	public static void doSum(int x, int y) {
		System.out.println("int sum is "+ (x+y));
	}
	
	public static void doSum(float x, float y) {
		System.out.println("float sum is "+ (x+y));
	}
//	public static void doSum(long x, long y) {
//		System.out.println("long sum is "+ (x+y));
//	}

		
	
	public static void main(String[] args) {
		doSum (10,20); // tam sayilarda tip belirlenmediginde defoult olarak int kabul edilir
		doSum(10.0 ,20.0);// ondalikli sayilarda tip belirlenmediginde defoult olarak double kabul edilir
	
	int []array=new int [2]; // olusturulacak arrayin ismi array turu int olmali
	// 
	array[0]=10;
	array[1]=20;
	
	System.out.println(array[0]+ ";"+array[1]);

}

	
}



