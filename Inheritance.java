public class Inheritance {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.bark();    //method return from dog class
        d1.eat();     //method return form domestic class
        d1.Walk();    //method return form animal class
    }
}


class Animal{                                     //super parent class of dog
    void Walk(){
        System.out.println("Animal is walking");
    };
}

class Domestic extends Animal{                   // parent class of dog which extend form animal class
    void eat(){
        System.out.println("Domestic anlimal is eating");
    };
}

class Dog extends Domestic{   //dog class which extend domestic class which further extended form amimal class
    void bark(){
        System.out.println("Dog is barking");
    }
}