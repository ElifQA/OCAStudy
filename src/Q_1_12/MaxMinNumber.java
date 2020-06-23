package Q_1_12;

import java.util.Arrays;

public class MaxMinNumber {

	public static void main(String[] args) {
//		int[] arr= {56,8,96,2,7,659};
//		
//		Arrays.sort(arr);
//		
////		int a=arr[arr.length-1];
////		System.out.println(a);
//		System.out.println(arr[arr.length-1]);
//		
//		
//		int max=arr[0];
//		int min=arr[0];
//		int second=arr[0];
//		
//		for (int i=0; i<arr.length ; i++) {
//			
//			if (arr[i]>max) {
//				second=max;
//				max=arr[i];
//				
//			}else if(arr[i]<min) {
//				min=arr[i];
//			}
//		}
//		System.out.println(max);
//		System.out.println(min);
//		System.out.println(second);
//		System.out.println("_________________-");
//		
//		
		
		int []array= {7, 90, 4, 21, 1};
		
		int mx=array[0];
		int mn=array[0];
		int snumber=array[0];
		
		for (int i=0; i<array.length; i++) {
			if(array[i]>mx) {
				snumber=mx;
				mx=array[i];
				
			}
			if(array[i]<mn) {
				mn=array[i];
			}
		}
		System.out.println(mx);
		System.out.println(mn);
		System.out.println(snumber);

	}

}



