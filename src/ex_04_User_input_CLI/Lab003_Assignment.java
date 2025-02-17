package ex_04_User_input_CLI;

public class Lab003_Assignment {
    //CLI option->take a user input-name age and salary and print them in a end
    public static void main(String[] args) {
        String name= args[0];
        int age = Integer.parseInt(args[1]);
        double salary = Double.parseDouble(args[2]);
        System.out.println("name="+args[0]);
        System.out.println("age="+args[1]);
        System.out.println("salary="+args[2]);



    }
}
