package ex_010_Function.java;

public class Lab_002 {
    public static void main(String[] args) {
        //1-Without Parameters with return type
        //  OR without argument with return type
        String s= greet_with_hello();
        System.out.println(s);

    }
    static String greet_with_hello(){
        return "Hi,How are you,example2";
    }
}
