package ex_06_if_else_condition;

public class Lab_001_if_condition {
    public static void main(String[] args) {
        //or we can pass the input form CLI
        String age=args[0];
        int age1=Integer.parseInt(age);
        //int age=19;
        if (age1>=18){
            System.out.println("you are eligible for vote beacause your age=" +age1);
        }

    }
}
