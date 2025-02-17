package ex_07_Switch_basics.java;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab002_Default_browser {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the Browser");
        String Browser=sc.next();
        switch (Browser){
            case "Chrome":
                System.out.println("Start Chrome Browser");
                break;
            case "firefox":
                System.out.println("start firefox");
                break;
            case "edge":
                System.out.println("start edge");
            default:
                System.out.println("i does not have idea which is the browser");
        }
    }
}
