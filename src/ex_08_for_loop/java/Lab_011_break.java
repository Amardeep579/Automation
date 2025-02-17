package ex_08_for_loop.java;

public class Lab_011_break {
    public static void main(String[] args) {
        for(int i=0; i<50; i++){
            if(i==3){
                break;
            }
            System.out.println(i);
        }
    }
}
