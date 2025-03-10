package ex_012_Array.java;

public class Lab_008_SumOfArray {
    public static void main(String[] args) {
        int[] array={10,5,15};
        int sum=0;
        for(int i=0; i< array.length; i++) {
            sum = sum + array[i];
         }
        System.out.println(sum);
    }
}
