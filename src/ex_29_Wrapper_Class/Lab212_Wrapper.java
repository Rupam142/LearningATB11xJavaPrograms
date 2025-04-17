package ex_29_Wrapper_Class;

public class Lab212_Wrapper {

    // Below examples has, **wrapper class, Method override, overload,
    // encapsulation, static, inheritance. abstraction, DC, PC also**

    public static void main(String[] args) {
        Mobile iphone = new Mobile("iphone 16", 1, 120000.00);
        Mobile samsung = new Mobile("ultra 24",2, 135000.00);

            // if we want to update the mobile price
        iphone.setPrice(200000.89);
        //samsung.setPrice(165000.45);
        iphone.display();
        samsung.display();

        System.out.println(Mobile.mobile_carrier);
        Mobile.switchOnAirplaneMode();

    }
}
        // using extends keyword old phone to smart phone
class Mobile extends OldPhone{         // Single inheritance
    private Integer phone;
    private String name;
    private Double price;
    static String mobile_carrier = "airtel";


//class Mobile {                         // Single inheritance
//    private Integer phone;
//    private String name;
//    private Double price;
//    static String mobile_carrier = "airtel";

    // Default Constructor
    Mobile() {
        System.out.println("DC");    // Default constructor
    }

    // Constructor
    public Mobile(String name, Integer phone, Double price) {      // parameterized constructor
        this.phone = phone;
        this.name = name;
        this.price = price;
    }

    void display() {      // Display function  , Normal instance function
        System.out.println(this.name + this.phone + this.price);
    }

    // Getter and Setter
    public Integer getPhone() {     // getter setter encapsulation
        return phone;
    }

    public void setPhone(Integer phone) {      // getter setter encapsulation
        this.phone = phone;
    }

    public String getName() {          // getter setter encapsulation
        return name;
    }

    public void setName(String name) {       // getter setter encapsulation
        this.name = name;
    }

    public Double getPrice() {       // getter setter encapsulation
        return price;
    }

    public void setPrice(Double price) {      // getter setter encapsulation
        this.price = price;
    }

    static void switchOnAirplaneMode() {    // Static function
        System.out.println("Common Airplane Mode");
    }

    void priceChange(Integer price){
        System.out.println("Change price in Integers");  // Method Overloading concept
    }
    void priceChange(Double price){
        System.out.println("Change price in Decimal");
    }


    // to override the old phone
    @Override
    void calling(){                             // Method Overriding
        System.out.println("dialed -> touch dial pad now!!");
    }

}

//class OldPhone{
//    void calling(){
//        System.out.println("dailpad");
//    }
//}

// Interface
class OldPhone implements SIMCard{
    void calling(){
        System.out.println("dailpad");
    }

    @Override
    public void enterCard(){                             // Method Overriding
        System.out.println("Card Entered");
    }
}

interface SIMCard{          // Abstraction
    void enterCard();
} // Abstraction
