package ex_07_Switch_basics.java;

public class Lab006 {
    public static void main(String[] args) {
        char code= 'c';
        switch (code){
            case 'A':
                System.out.println("98");
                break;
            default:
                System.out.println("hello");
                break;
            case 'B':
                System.out.println("88");
                break;
        }
    }
}
