package ex_06_if_else_condition;

import java.util.Scanner;

public class Lab_008_Grade {
    //input in int and out in char
    //code for define the score and grade
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the score");
        float score = sc.nextFloat();
        char grade= '0';
        if (score>=90 && score<=100) {
            grade = 'a';
        }else if(score>=80 && score<=89) {
            grade = 'b';
        }else if(score>=70 && score<=79) {
            grade = 'c';
        }else if (score>=60 && score<=69) {
            grade = 'd';
        }else if (score>100 || score<0){
            System.out.println("you are not in that gola");
        }else{
            //grade='f';
        }
        System.out.println("your grade="+grade);
    }
}
