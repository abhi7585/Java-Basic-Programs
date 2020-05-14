/**

Write a Java program to check if a given number is prime or not. Remember, a prime number is a number which is not divisible by 
any other number, e.g. 3, 5, 7, 11, 13, 17, etc. Be prepared for cross, e.g. checking till the square root of a number, etc.

*/

// Program:-

import java.util.Scanner;

public class Prime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int i, flag = 0;
        for(i = 2; i <= number/2; i++){
            if(number % i == 0){
                System.out.println("Number "+ number +" is not Prime");
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            System.out.println("Number "+ number +" is Prime");
        }
    }
}

