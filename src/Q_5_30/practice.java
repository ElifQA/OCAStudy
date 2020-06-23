package Q_5_30;

public class practice {

	public static void main(String[] args) {
		String str="I just applied the job this week";
		
		StringBuffer s=new StringBuffer(str);
		System.out.println(s.reverse());
		
		//Find number of words in string?
		System.out.println(str.substring(5, 12));
		
		String []word=str.split(" ");
		int a=word.length;
		System.out.println("word number in the string "+ a);
		
		//char at
		String ss= "I am so exciting";
		
		String reverse="";
		for (int i=ss.length()-1; i>=0; i--) {
			reverse+=ss.charAt(i);
		}
		
		System.out.println(reverse);
		//word by word
	String rev="";
	String []array=ss.split(" ");
	for (int i=array.length-1; i>=0; i--) {
		rev+=array[i]+" ";
	}
	System.out.println(rev);
	
	String given= "#@$%^E)(L*If";
	String rep=given.replaceAll("[^a-zA-Z]", "");
	System.out.println(rep);
	System.out.println(rep.length());
	
	String name="melek";
	String name1= name.concat("melek");
	System.out.println(name1);
	
	name.concat("suzan");
	name=name.concat("seda");
	System.out.println(name);
	
	}

}
