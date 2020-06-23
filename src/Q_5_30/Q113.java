package Q_5_30;

public class Q113 {

    public static void main(String[] args) {


        int wd = 0;
        String days[] = {"sun", "mon", "wed", "sat"};
        for (String s: days){
            switch (s){
                case "sat":
                case "sun":
                    wd-=1;
                    break;
                case "mon":
                    wd++;
                    break; //ikinci version break var cvp 1
                case "wed":
                    wd+=2;
            }
        }
        System.out.println(wd);
//       /
    }

}
/*
* What is the result?
A. 3
B. 4
C. -1
D. Compilation fails.
*Answer: A
*
* */

/**?????Sinavda farklisi cikmis monday den sonra break varmis o da sonucu -1 
 * olarak degistiriyor yazilmis fakat ben deneyince 1 olarak degisiyor??????????????
*/

 class Q111 {

    public static void main(String[] args) {
        //line n1
    	byte x=1; //soruda bu kismi yok
      switch (x) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
        }

    }
}
//CIBSS  ==> Char, Integer, Byte, String, Short u switch te kullanabiliriz
// Boolean, long, float, double we can not use with

/*
*Which three code fragments can be independently inserted at line n1 to enable the code to print One?
(Choose three.)
A. byte x = 1;
B. short x = 1;
C. String x = "1";
D. long x = 1;
E. double x = 1;
F. Integer x = new Integer("1");
Answer: ABF
*  */





