package OCA223_Q1_50;

public class Q_18 {

}
//17 5
class Vehicle {
    String type = "4W'";
    int maxSpeed = 100;

    Vehicle(String type, int maxSpeed) {
        this.type = type;
        this.maxSpeed = maxSpeed;
    }

    Vehicle() {
    }
}
class Car extends Vehicle {
    String trans; //Auto

    Car(String trans) { //line n1  //parent class ta default constractor olmasaydi hata verirdi
        super();
        this.trans = trans;
    }

    Car(String type, int maxSpeed, String trans) {
        super(type, maxSpeed); // line n2
        this.trans = trans;
       // this(trans);this must be first this methodu cagiramiyoruz super() den sonra
        //ayni anda iki constr cagiramassin super()-this()

    }

    public static void main(String[] args) {
        //  And given the code fragment:
        Car c1 = new Car("Auto");//tek parametreli constructora gidicek
        Car c2 = new Car("4W", 150, "Manual ");
        //Her object kendi copysini tasir
        System.out.println(c1.type + " " + c1.maxSpeed + " " + c1.trans);
        System.out.println(c2.type + " " + c2.maxSpeed + " " + c2.trans);
    }
}

