package OCA223_Q1_50;

public class Q_04 {

	public static void main(String[] args) {
		int [] stack= {10, 20,30};
		int size=3;
		int idx=0;
		//line n1 
		
		do {
			idx++;
		}	while(idx < size-1);
		
		
		System.out.print("The Top element: "+ stack[idx]);

	}

}

/*Answer C
 * 
 * A 
 * do {
			idx++;
		}	while(idx >= size-1);
 
 * 
 * 
 * C
 * do {
			idx++;
		}	while(idx < size-1);
		

E
		while(idx <= size-1) {
				idx++;
			}
		
		
*/
