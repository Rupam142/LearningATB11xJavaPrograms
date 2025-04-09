package ex_28_ENUM;

public enum Locators {

    page_button("#btn"),   // this the complex value(#btn) and page_button is 'key'
    page_input("%input1");

    private String Locators;

    Locators(String locators){
        this.Locators = locators;
    }

    String getLocators(){
        return this.Locators;
    }


}
