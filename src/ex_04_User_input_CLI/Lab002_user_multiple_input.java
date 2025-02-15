package ex_04_User_input_CLI;

public class Lab002_user_multiple_input {
    public static void main(String[] args) {
        String age=args[0]; //as of now age value is string
        System.out.println(age); //this age value is in string
        int age1=Integer.parseInt(age);  //now age convert into int
        System.out.println(age);  //this age value is in int



    }
}
