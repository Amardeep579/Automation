package ex_04_User_input_CLI;

public class Lab001_user_inputs {
    public static void main(String[] args) {
        String age= args[0];
        int age1=Integer.parseInt(age);
        System.out.println(age1);
    }
}
