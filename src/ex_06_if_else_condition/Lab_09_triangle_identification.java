package ex_06_if_else_condition;

import javax.swing.*;
import java.util.Scanner;

public class Lab_09_triangle_identification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the side 1");
        double side1 = sc.nextDouble();
        System.out.println("enter the side 2");
        double side2 = sc.nextDouble();
        System.out.println("enter the side 3");
        double side3 = sc.nextDouble();
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.out.println("give me only positive value");
        }
        else {
            if (side1 == side2 && side1 == side3) {
                System.out.println("acute");
            } else if (side1 == side2 || side1 == side3) {
                System.out.println("Isoscele");
            } else {
                System.out.println("Scalenes");
            }
        }

    }
}