package ex_010_Function.java;

import java.util.Scanner;

public class Lab_006 {
    //1-With Parameters with return type(user input)
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name");
        String name= sc.next();
        System.out.println("enter the age");
        int age= sc.nextInt();
        System.out.println("enter your salary");
        double salary=sc.nextDouble();
        greet_with_details(name,age,salary);
    }
    static void greet_with_details(String name, int age, double salary){
        System.out.println("your name is "+ name + "\nyour age is "+age+ "\nyour salary is" +salary);
    }
}
