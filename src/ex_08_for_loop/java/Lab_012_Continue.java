package ex_08_for_loop.java;

public class Lab_012_Continue {
    public static void main(String[] args) {
        for(int i=0; i<10; i++){
            if(i==3){
                continue;
            }
            System.out.println(i);
        }
    }
}
