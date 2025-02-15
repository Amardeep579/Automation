package ex_06_if_else_condition;

import java.util.Scanner;

public class Lab_002_if_else {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your age");
        int age=sc.nextInt();
        if(age>18) {
            System.out.println("yes you are eligible for vote because your age=" + age);
        }else{
            System.out.println("no you are not eligible for vote because your age=" +age);
        }
    }
}
