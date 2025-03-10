package ex_012_Array.java;

import java.util.Scanner;

public class Lab_009_UserInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int size= sc.nextInt();

        int [] number=new int[size];
        for (int i=0; i<number.length; i++){
            System.out.println("enter the number");
            number[i]= sc.nextInt();
        }
        for(int i=0; i<number.length; i++){
            System.out.println(number[i]);
        }

    }
}
