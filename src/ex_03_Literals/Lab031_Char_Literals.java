package ex_03_Literals;

public class Lab031_Char_Literals {
    public static void main(String[] args) {
        char c1 = 'A';  // These are also characters (A to Z, a-z, !@#$%^&*()_+)
        //char c2 = "A";  //This is not a char, it is string. because in ""(double quotes) it is String whereas in ''(Single quotes) it is char.
        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' ';  //blank space is also a char.

        //Escape char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("RupamSingh");
        //System.out.println("Rupam"+new_line+"Singh");  //or we can use
        //System.out.println("Rupam\nSingh");  //we can use both the syntax for print in separate line/new line.
        System.out.println("Rupam"+tab_line+"Singh");
        System.out.println("Rupam"+back_space+"Singh");  //--->Back_space will delete one character.
                                                        //According to the syntax it will print "RupaSingh"
        System.out.println("Welcome hello world"+carriage_return+"Java hello world");  //carriage_return will delete every thing which is written previous word/sentence.
        System.out.println("Hi,This is first line\n This is second line\n This is third line"); //--> It will also print in new line using \n.
        System.out.println("Hi,This is first line"+new_line+"This is second line\"+new_line+\" This is third line");  //-->//--> It will also print in new line using "+new_line+".

        char c11 = '\u1F60';  //-->This is Unicode

    }
}
