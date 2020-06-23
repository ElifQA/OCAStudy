package Q_5_30;

public class Q115 {

//soru buradan basliyor

    public static void main(String[] args) {
        String str1 = "Java";
      String[] str2 = {"J", "a", "v", "a"};
        String str3 = "Java";
        for (String str : str2) {
            str3 = str3 + str;
        }
       // str3 = str1; Boyle yaptigimizda ayni yere point yapar.
        boolean b1 = (str1.equals(str3));
        boolean b2 = (str1 == str3);
    
       System.out.println(b1 + ", " + b2);
    }}
        /*
        What is the result?
        A.false,false
        B.false,true
        C.true,false
        D.true,true
        Answer:C
         */
    //cikti
