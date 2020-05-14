/**

You need to write a simple Java program to check if a given String is palindrome or not. A Palindrome is a String which is equal 
to the reverse of itself, e.g., "Bob" is a palindrome because of the reverse of "Bob" is also "Bob."


*/

import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String word = sc.nextLine();
        int l , i;
        String reverse = "";
        l = word.length();
        for (i = l-1; i >= 0; i--){
            reverse = reverse + word.charAt(i);
        }
        if (reverse.equals(word)){
            System.out.println("String is Palindrome");
        }
        else{
            System.out.println("Sting is not Palindrome");
        }
    }
}
