package ex_27_Static;

public class Lab204_REAL_Example {
    public static void main(String[] args) {

        System.out.println(ATB.mentorName);
        System.out.println(ATB.courseName);


        ATB.doAssignment();
        ATB.joinZoomForClass();

        ATB amit = new ATB();
        amit.setName("amit");
        amit.setPhone("9867473487");

        ATB lucky = new ATB();
        amit.setName("lucky");
        amit.setPhone("9554634746");

    }
}


class ATB{
    static {
        System.out.println("Load the class?, I will execute");
    }


    {
        System.out.println("IIB - this is called when object is created!");
        // What is the purpose? -
        // Here you can write code related to start a website or anything
        // before starting the automation or API automation
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;  // Non-static
    private String phone;
    static String courseName = "atb11x";
    static String mentorName = "pramod";

    static void doAssignment(){
        // System.out.println(phone);  // Static method can't access the non static
        System.out.println("Do Assignment");
    }

    static void joinZoomForClass(){
        // System.out.println(phone);  // Static method can't access the non static
        System.out.println("Class joined");
    }

    void howTheyAssignment(){
        System.out.println("It is different");
    }


}
