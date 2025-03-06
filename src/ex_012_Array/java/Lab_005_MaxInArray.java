package ex_012_Array.java;

public class Lab_005_MaxInArray {
    public static void main(String[] args) {
        int []array={15,55,88,99,55,55,44,11};
        int max_output=give_max(array);
        System.out.println(max_output);
    }
    static int give_max(int[]array){
        int max=array[0];
        for(int i=0; i< array.length;i++){
            if(array[i]>max) {
                max = array[i];
            }
        }
        return max;
    }
}
