package ex_06_if_else_condition;

import java.util.Scanner;

public class Lab_007_Grade_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the score");
        float score = sc.nextFloat();
        if (score >= 90 && score <= 100) {
            System.out.println("you got the A grade");
        } else if (score <= 89 && score >= 80) {
            System.out.println("you got the B grade");
        } else if (score <= 79 && score >= 70) {
            System.out.println("you got the C grade");
        } else if (score <= 69 && score >= 60) {
            System.out.println("you got the D grade");
        } else {
            System.out.println("you are fail");
        }


    }
}
