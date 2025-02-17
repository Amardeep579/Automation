package ex_07_Switch_basics.java;

public class Lab003_Switch_JDK_13_Concept {
    public static void main(String[] args) {
        int itemcode=003;
        switch (itemcode){
            case 001,002,005:      //multiple condition check-it is applicable in after JDK13
                System.out.println("all of the them are electronic gadget");
                break;
            case 004,006,007:
                System.out.println("this is mech");
                break;
            default:
                System.out.println("none");
        }
    }
}
