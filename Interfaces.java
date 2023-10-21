public class Interfaces {
    public static void main(String[] args) {
        Device D = new Device();
        D.start();
    }
}

class Device implements Computer{    //Use implements keyword to inherit class and do override of behaviour of parent class

    @Override
    public void start() {
        System.out.println("Computer started");
    }  
}

interface Computer{    //Interface class which having all the method default - public abstract 
    void start();      //all the property abstarct without body
} 