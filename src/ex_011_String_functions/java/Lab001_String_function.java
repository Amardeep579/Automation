package ex_011_String_functions.java;

import java.sql.SQLOutput;

public class Lab001_String_function {
    public static void main(String[] args) {
        String name="Sonal";
        System.out.println(name.length());
        //1-char()
        System.out.println(name.charAt(2));
        //2-concat()
        System.out.println(name.concat(" payal "));
        //3-Contain()
        System.out.println(name.contains("a"));    //true
        System.out.println(name.contains("m"));    //false
        System.out.println(name.contains("PA"));   //false
        //4-equal()
        System.out.println(name.equals("Sonal"));
        //5-equalIgnoreCase()
        System.out.println(name.equalsIgnoreCase("sonal"));
    }
}
