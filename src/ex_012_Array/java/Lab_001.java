package ex_012_Array.java;

public class Lab_001 {
    public static void main(String[] args) {
        int[] marks={90,88,78,99};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[-1]);  //ArrayIndexOutOfBoundsException
        System.out.println(marks[10]);  //ArrayIndexOutOfBoundsException
    }
}
