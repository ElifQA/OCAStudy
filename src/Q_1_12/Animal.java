package Q_1_12;

   public class Animal{
	   
	 void eat() {
		   System.out.println("eating");
	   }
	   
	   
   }
   class Dog extends Animal{
	   void eat() {
		   System.out.println("eating fruits");}
		   }
		    class BabyDog extends Dog {
		   void eat() {
		   System.out.println("drinking milk");
		   }
		   public static void main(String args[]) {
		  
			   Animal a1, a2, a3;
		   a1 = new Animal();
		   a2 = new Dog();
		   a3 = new BabyDog();
		   a1.eat(); // prints “eating”
		   a2.eat(); // prints “eating fruits”
		   a3.eat();
		   } } // prints “drinking milk”
		  



