package ex_012_Array.java;

public class Lab_002 {
    public static void main(String[] args) {
        //first way to create Array
        int [] marks={11,55,88,77};
        System.out.println(marks[2]);

        //2nd way to create Array
        int[] marks2=new int[5]; //now arrary size 5 is fix
        System.out.println(marks2.length);
        marks2[0]=55;
        marks2[1]=51;
        marks2[2]=14;
        marks2[3]=88;
        marks2[4]=22;
        System.out.println(marks2[1]);
    }
}
