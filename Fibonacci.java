/**

Write a Java program to print the Fibonacci series up to a given number or create a simple Java program to calculate Fibonacci 
number is common Java questions on fresher interview and homework. Fibonacci series is also a popular topic on various programming 
exercises in schools and colleges. Fibonacci series is a series of natural numbers where the next number is equivalent to the 
sum of the previous two numbers like fn = fn-1 + fn-2. The first two numbers of the Fibonacci series are always 1, 1. 
In this Java program example for the Fibonacci series, we create a function to calculate Fibonacci number and then print those
numbers on Java console.

*/

import java.util.Scanner;

public class Fibonacci {
    public static void main(String args[] ){
        System.out.println("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int previous = 0, next = 1, i, sum = 0;
        System.out.println(next);
        for(i = 1; i < n; i++){
            sum = previous + next;
            previous = next ;
            next = sum;
            System.out.println(sum);

        }
    }
}
