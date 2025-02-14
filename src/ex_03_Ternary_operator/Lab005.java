package ex_03_Ternary_operator;

public class Lab005 {
    public static void main(String[] args) {
        int age=25;
        //minor,adult,senior
        //minor<18
        //senior>65
        //adult>18
        String result=(age<18)?"minor":((age<65)?"adult":"senior");
        System.out.println(result);
    }
}
