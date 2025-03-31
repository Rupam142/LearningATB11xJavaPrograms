package Daily_Task_March14;

public class Task_March14_03_ID_Operator {
    public static void main(String[] args) {

        int a = 20;
        System.out.println(--a + a++ + a--);   // 19 + 19 + 20 = 58(Output)


//        Step 1: Initialization
//                a = 20
//
//        Step 2: Evaluate --a (Pre-Decrement)
//                --a means "decrement a first, then use the new value."
//
//        a = 19 (decreased by 1)
//
//        The expression now holds 19.
//
//        Step 3: Evaluate a++ (Post-Increment)
//        a++ means "use the current value of a, then increment it."
//
//        Current a = 19, so a++ returns 19.
//
//        After evaluation, a = 20 (incremented by 1).
//
//        Step 4: Evaluate a-- (Post-Decrement)
//        a-- means "use the current value of a, then decrement it."
//
//        Current a = 20, so a-- returns 20.
//
//        After evaluation, a = 19 (decremented by 1).



    }
}
