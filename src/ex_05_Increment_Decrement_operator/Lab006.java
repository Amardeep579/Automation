package ex_05_Increment_Decrement_operator;

public class Lab006 {
    public static void main(String[] args) {
        String a=args[0];
        int a1= Integer.parseInt(a);
        System.out.println(a1++ + ++a1);
    }
}
