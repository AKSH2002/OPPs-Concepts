public class Constructors {
    public static void main(String[] args) {
        Car c1 = new Car(110);  
        Car c2 = new Car(500, "Farari");
    }
}


class Car {
    static int a;                               // Static keyword use to define a class property not depend on object
    Car(){                                      // Default Constructure with no argument
        System.out.println("I am simple car");  
    };
    Car(int a){                                 // Constructure with int argument
        this();                                 // Calling the defalut constructor form another constructure
        System.out.println("Car run at the speed of " + a);
    };
    Car(int speed, String model){
       System.out.println(model + " is runing at the speed of "+ speed);
    }
}