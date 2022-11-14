package Array;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        /**
         *    CLASS             students
         *    0                 4
         *    1                 4
         *    2                 4
         *
         *
         *    here we have to use 2D array
         */

        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[3][4];
//Regular Array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("Enter marks of class : " + i + "Student : " + j);
                arr[i][j] = scan.nextInt();

            }
        }

        System.out.println("Marks of students are: ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("  " + arr[i][j]);
            }
            System.out.println();
        }

//        JAGGED ARRAY
        int[][] arr2 = new int[3][];
        arr2[0] = new int[3];
        arr2[1] = new int[2];
        arr2[2] = new int[3];

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.printf("Enter marks of class : " + i + "Student : " + j);
                arr[i][j] = scan.nextInt();

            }
        }

        System.out.println("Marks of students are: ");

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.printf("  " + arr2[i][j]);
            }
            System.out.println();
        }
    }
}
