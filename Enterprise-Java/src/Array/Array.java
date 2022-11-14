package Array;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        Creating an Array
        int[] a = new int[5];
//        Assigning Values
//        a[0] = 10;
//        a[1] = 20;
//        a[2] = 5;
//        a[3] = 1;
//        a[4] = 6;

        for (int i = 0; i < a.length; i++) {
            System.out.print("Please enter the marks of " + i + ": ");
            a[i] = scan.nextInt();
        }
//        Displaying output
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }


    }
}
