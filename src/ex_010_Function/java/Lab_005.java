package ex_010_Function.java;

import java.util.Scanner;

public class Lab_005 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value of a");
        int a =sc.nextInt();
        System.out.println("enter the value of b");
        int b=sc.nextInt();

        int result=sum(a,b);
        System.out.println("Sum=" +result);

        int result1=sub(a,b);
        System.out.println("sub="+result1);

        int result2=div(a,b);
        System.out.println("devision="+result2);

    }
    static int sum (int a, int b){
        return a+b;
    }
    static int sub (int a, int b) {
        return a-b;
    }
    static int div (int a,int b){
        return a/b;
    }
}
