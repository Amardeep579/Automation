package ex_06_if_else_condition;

import java.util.Scanner;

public class Lab_005_eve_odd_interview {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        if(num%2==0) {
            System.out.println("its a even number");
        }else{
            System.out.println("its a odd number");
        }
        sc.close(); //stop taking input now
    }
}
//edge case-large int. -ve handle ,zero, other input like non int value
