package ex_28_ENUM;

public class Lab206_ENUM {
    public static void main(String[] args) {
        System.out.println(Day.FRIDAY);    // this is Dot operator

        System.out.println(PROJECT_URLs.google);
        System.out.println(PROJECT_URLs.katalon);
        System.out.println(PROJECT_URLs.restassured);

//        A a = new A();
//        System.out.println(a.days[4]);
    }
}


//class A{
//    String[] days = {"Mon" , "Tue" , "Wed" , "Thurs" , "Fri" , "Sat" , "Sun"};
//}
                                                                // Both we can use but only one at once
enum Day{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THRUSDAY, FRIDAY, SATURDAY
}

//enum URLs{
//    "https:\\google.com"
//}

enum PROJECT_URLs{
    google, restassured, katalon, vwo   // for multiple reference.
    //google.com, restassured, katalon, vwo  // .com or _ will not support , it will get error.


}
