/**

Simple Java program to find the factorial of a number using recursion and iteration.
Iteration will use for loop while recursion will call method itself

*/

// Program

import java.util.Scanner;

public class Factorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        System.out.println(fact(num));

    }

    private static int fact(int num) {
        if (num >= 1) {
            return num * fact(num - 1);  // Recursive function 
        } else {
            return 1;
        }
    }
}
