package ex_012_Array.java;

public class Lab_012 {

        public static void main(String[] args) {
            int[][] array_2d = new int[3][3];
            array_2d[0][0] = 90;
            array_2d[0][1] = 91;
            array_2d[0][2] = 92;

            array_2d[1][0] = 1;
            array_2d[1][1] = 3;
            array_2d[1][2] = 5;

            array_2d[2][0] = 2;
            array_2d[2][1] = 4;
            array_2d[2][2] = 6;

            // Corrected loop
            for (int i = 0; i < array_2d.length; i++) {
                for (int j = 0; j < array_2d[i].length; j++) { // Fixed increment variable
                    System.out.println(array_2d[i][j]);
                }
            }
        }


}
