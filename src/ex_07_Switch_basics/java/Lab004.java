package ex_07_Switch_basics.java;

public class Lab004 {
    public static void main(String[] args) {
        int itemcode=004;
        switch (itemcode){
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            default -> System.out.println("none");
        }
    }
}
