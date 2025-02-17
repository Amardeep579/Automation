package ex_08_for_loop.java;

public class Lab_013_Even_with_continue {
    public static void main(String[] args) {
        for(int i=0; i<=50; i++){
            if(i%2==0){
                System.out.println("even="+i);
                continue;
            }
            System.out.println("i");
        }
    }
}
