package Q_5_30;

public class AlphaCha {

	public static void main(String[] args) {
		//Find out how many alpha characters are present in a string?
		
		String given="#@E(&^456L)IF";
		String st=given.replaceAll("[^a-zA-Z]", "");
		System.out.println(st.length());
		
		//How to find out the part of the string from a string? What is substring? 
		//Find number of words in string?
		
		String str="Today is a beatiful day";
		
		String as=str.substring(2, 6);
		System.out.println(as);
		
		String []ch=str.split("");
		System.out.println(ch.length);
		
		for (String string:ch) {
			System.out.print(string);
		}
			//reverse string
			System.out.println("----------------");
		
			
			StringBuffer ss=new StringBuffer(str);
			System.out.println(ss.reverse());
			
			String rev="Saturday";
			
			String reverse="";
			for (int i=rev.length()-1; i>=0; i--) {
				reverse+=rev.charAt(i);
			}
			
			System.out.println(" char at = "+reverse);
		
		String toChar="Today is sunny";
		String reversed="";
		char []cc=toChar.toCharArray();
		
		for (int i=cc.length-1; i>=0; i--){
			reversed+=cc[i]+"";
			
		}
		System.out.println(reversed);
		
		//word by word
		String word="Sevda dedim bilirmisin";
		String rvr="";
		
		String []w=word.split(" ");
		for (int i=w.length-1; i>=0; i--) {
			rvr+=w[i]+" ";
		}
		System.out.println(rvr);
		
		
			
		

	}

}
