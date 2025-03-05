package ex_011_String_functions.java;

public class Lab002_String_Create_String {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("sonal");
        stringBuilder.append("patel");
        System.out.println(stringBuilder);
        // another example:-
        StringBuilder sb = new StringBuilder("hi");
        sb.append(" its my number");
        System.out.println(sb.toString());
    }
}
