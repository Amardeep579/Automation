package ex_012_Array.java;

import java.lang.reflect.Array;

public class Lab_006_MinInArray {
    public static void main(String[]args){
        int [] array={11,55,10,41,88,66};
        int min_value=give_min(array);
        System.out.println(min_value);

    }
    static int give_min(int[]array){
        int min= array[0];
        for(int i=0; i< array.length; i++){
            if (array[i]<min){
                min=array[i];
            }
        }
        return min;
    }
}
