/**

An integer is called palindrome if it's equal to its reverse, e.g. 1001 is a palindrome, but 1234 is not because the reverse 
of 1234 is 4321 which is not equal to 1234.

*/

import java.util.Scanner;

public class IntegerPalindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter : ");
        int number = sc.nextInt();
        int temp, unit, reverse = 0;
        temp = number;
        while(temp != 0){
            unit = temp % 10;
            reverse = reverse * 10 + unit;
            temp = temp / 10;
        }
        if (reverse == number){
            System.out.println("It is Palindrome");
        }
        else{
            System.out.println("It is not Palindrome");
        }
    }
}
