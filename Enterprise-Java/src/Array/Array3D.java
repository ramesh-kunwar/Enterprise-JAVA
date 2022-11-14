package Array;

import java.util.Scanner;

public class Array3D {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /**
         *      School      Class       Students
         *      0              2            3
         *      1               2            3
         *      2               2            3
         *
         */

        int[][][] arr = new int[3][2][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.println("Enter marks of school " + i + " class " + j + " student " + k);
                    arr[i][j][k] = scan.nextInt();
                }
            }
        }
//      output
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
            }
            System.out.println();
        }

    }
}
