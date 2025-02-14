package ex_03_Ternary_operator;

public class Lab004 {
    public static void main(String[] args) {
        int i=15;
        String result=(i>10)?(i>20?"g>20":"b is 10 to 20"):"b";
        System.out.println(result);
    }
}
