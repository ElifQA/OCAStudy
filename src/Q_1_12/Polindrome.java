package Q_1_12;

public class Polindrome {
	
	public static void pol(String str) {
	
		String rev="";
		
		for (int i=str.length()-1; i>=0; i--) {
			rev+=str.charAt(i);
		}if( str.equals(rev)) {
			System.out.println(str+" polindrome");
		}else {
			System.out.println(str+" not ");
		}
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		//Polindrome po=new Polindrome();
		//po.pol("racecar");
		pol("racecar");

//		
		String s="kayak";
		String reverse="";
		
		for (int i=s.length()-1; i>=0; i--) {
			reverse+=s.charAt(i);
			
		}if (s.equals(reverse)) {
			System.out.println(s+ " polindrome");
		}else {
			System.out.println(s+ " not");
		}
		
		
	}

}
