package Q_1_12;

public class Q1 {
//1
	public static void main(String[] args) {
		Boolean []bool=new Boolean[2];
		bool[0]=new Boolean(Boolean.parseBoolean("true"));
		bool[1]=new Boolean(null);
		System.out.println(bool[0]+" "+bool[1]);
		
		//2---------
		
//		int [][]arr=new int[1][3];
//		
//		for (int i=0; i<arr.length; i++) {
//			for (int j=0; j<arr[i].length ; j++) {
//				System.out.println(arr[i][j]=10);
//				
//			}
//		}
//		
//		System.out.println("5 + 2 =" +3+4);
//		System.out.println("5 + 2 =" +(3+4));
//		System.out.println(+6+5);
//		
//		//public static void main(String[] args) {
//			// write your code here
//		        System.out.println("Result A " + 0 +1);
//		        System.out.println("Result B " + (1) + (2));
////		        
////		        
////		        if (args[0].equals("Hello") ? true : false){
////		            System.out.println("Success");
////		        }else {
////		            System.out.println("Failure");
////		        }
//		       //16
//		        String[][] arr1 = {{"A", "B", "C"}, {"D", "E"}};
//		        for (int i = 0; i < arr1.length; i++) {
//		            for (int j = 0; j < arr1[i].length; j++) {
//		                System.out.print(arr1[i][j] + " ");
//		                if (arr1[i][j].equals("B")) {
//		                    continue;                  //continue nun altina bisey yazamayiz yazarsak compile error verir
//		                }
//		            }
//		            continue;
//		        } 
		        
		     // Given the code fragment
				String[] strs=new String[2];
				int idx=0;
//				strs[0] = "A";
//				strs[1]="B";
			//	System.out.println(strs[0].concat("element "));  //we can not concat if array is null


				for (String s : strs) {
					strs[idx].concat("element "+idx);
					idx++;
				}

				for (idx = 0; idx < strs.length; idx++) {
					System.out.println(strs[idx]);
				}
		        
		        
		        
		    }
	}
	


