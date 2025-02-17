package ex_07_Switch_basics.java;

public class Lab005 {
    public static void main(String[] args) {
        int a=11;
        switch(-1){
            default:
                System.out.println("default");
                break;
            case -1:
                System.out.println("10");
                break;
            case 9:
                System.out.println("9");
                break;
        }
    }
}
