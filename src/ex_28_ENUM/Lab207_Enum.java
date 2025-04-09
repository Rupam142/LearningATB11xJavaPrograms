package ex_28_ENUM;

public class Lab207_Enum {
    public static void main(String[] args) {
        System.out.println(Locators.page_button.getLocators());   // this is referred from Locators.java
        System.out.println(Locators.page_input.getLocators());


        System.out.println("-----");
        System.out.println(Colors.BLUE.getHexCode());      // this is referred from Colors.java
        System.out.println(Colors.GREEN.getHexCode());


        System.out.println("-----");
        System.out.println(APIURLs.google.getUrl());      // this is referred from APIURLs.java
        System.out.println(APIURLs.vwo.getUrl());
        System.out.println(APIURLs.katalon.getUrl());


    }


}
