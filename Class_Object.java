public class Class_Object {
    public static void main(String[] args){
        Person p1 = new Person();  // This is the object of person class
        p1.age = 22;
        p1.name = "Aksh"; 
        System.out.println(p1.age + " " + p1.name);
    }
}

class Person {     // This is the person class or we can say blue print from which we can make many objects
    String name;   // This is the state of the class
    int age;
}