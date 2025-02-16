package ex_06_if_else_condition;

import java.util.Scanner;

public class Lab_006_if_elseif_else {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of num1");
        int num1=sc.nextInt();
        System.out.println("enter th value of num2");
        int num2=sc.nextInt();
        if(num1>num2) {
            System.out.println("num1 is the greater");
        }else if(num2>num1) {
            System.out.println("num2 is the greater");
        }else{
            System.out.println("num1 should be equal to num2");
        }
    }
}
