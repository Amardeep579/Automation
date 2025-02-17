package ex_08_for_loop.java;

public class Lab_010 {
    //to find the even odd value from 0 to 50
    public static void main(String[] args) {
        for (int i=0; i<=50; i++){
            if (i%2==0){
                System.out.println("even number=" +i);
            }
            else{
                System.out.println("odd number="+i);
            }
        }
    }
}
