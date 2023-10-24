public class Method {
    public static void main(String[] args){
        Man m1 = new Man();
        m1.eat();                     //calling method
        m1.walk();
        m1.walk(20);
    }
}

class Man{
    void eat(){                                    // method or behaviour
        System.out.println("I am eating.");
    }

    void walk(){ 
        System.out.println("I am walking.");
    }

    void walk(int steps){
        System.out.println("I am walking " + steps + " steps");
    }
}