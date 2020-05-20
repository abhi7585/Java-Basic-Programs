/**

A number is called an Armstrong number if it is equal to the cube of its every digit. For example, 153 is an Armstrong number 
because of 153= 1+ 125+27, which is equal to 1^3+5^3+3^3. You need to write a program to check if the given number is Armstrong 
number or not.

*/

// Program

import java.util.Scanner;

public class Armstrong {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        int temp, sum = 0, a;
        temp = num;
        while(temp != 0){
            a = temp % 10;
            sum = sum + a * a * a;
            temp = temp / 10;
        }
        if(sum == num){
            System.out.println("Number is Armstrong.");
        }
        else{
            System.out.println("Number is not Armstrong");
        }
    }
}
