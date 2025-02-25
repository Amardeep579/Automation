package ex_010_Function.java;

public class Lab_004 {
    public static void main(String[] args) {
        //1-With Parameters with return type (multiple arguments)
        greet_with_full_name(" Pramod ", " dutta ");
    }


        static void greet_with_full_name (String firstname, String lastname){
            System.out.println("Hi, your full name->"+firstname +lastname);
        }

}

