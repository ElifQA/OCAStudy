package Q_5_30;

import java.util.Arrays;

public class Swapnumbers {

	
	public static void main(String[] args) {
		int a=5;
		int b=10;
		
		a=a+b;//15
		b=a-b;//5
		a=a-b;
		System.out.println("a = "+a+" and b = "+b);
		
		//swap string 
		
		String str="Meleksila";
		String str1="Asimcan";
		
		str=str+str1;
		str1=str.substring(0, str.length()-str1.length());
		str=str.substring(str1.length());
		
		System.out.println(str);
		System.out.println("--------------------------");
		//second largest
		
		int [] array= {45,2,12,67,3498,-1};
		
		Arrays.sort(array);
		
		System.out.println(array[array.length-2]);
		
		int max=array[0];
		int min=array[0];
		int second=array[0];
		
		for (int i=0; i<array.length; i++) {
			if (array[i]>max) {
				second =max;
				max=array[i];
			}
//			if(array[i]<min) {
//				min=array[i];
//			}
		}
		System.out.println(max);
		//System.out.println(min);
		System.out.println(second);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
