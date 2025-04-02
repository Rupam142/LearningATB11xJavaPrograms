package ex_09_Switch_Statement;

import java.util.Scanner;

public class Lab084_Real_Switch_Automation {
    public static void main(String[] args) {

        // Web Automation
        // I will ask the user to give me the input from browser which they
        // want to use to i will start the automation in that browser.

       // String browser = args[0];     --> This code is used for CLI.
        //System.out.println(browser);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser = scanner.next();

        switch (browser) {

            case "chrome":
                System.out.println("Starting the chrome");
                System.out.println("......");
                System.out.println("TC1");
                System.out.println("TC2");
                break;

            case "firefox":
                System.out.println("Starting the firefox browser");
                // Further code to start the Firefox
                // Webdriver drive = new Firefox();   // Selenium code
                break;

            case "edge":
                System.out.println("Starting the Edge Code");
                break;

            default:
                System.out.println("I have no idea which browser is this");
                break;

        }






    }
}
