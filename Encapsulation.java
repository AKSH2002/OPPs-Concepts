public class Encapsulation {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.setPrice(200);    //Data is not direct access but it through some behaviour
    }
}

class Laptop{
    public String Name;          //Public access modifier which allow this property to be access form anywhere
    protected String brand;     //Protected property access by only class and childer of that class
    private int price;          //Private property access within this same class only
  
   public void setPrice(int price){      //Geter and Setter mathord are use in data hiding
        this.price = price;
        //is the user is Admin
        System.out.println(price);

    } 
}