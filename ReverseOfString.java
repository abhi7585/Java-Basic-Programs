/**

Print the reverse of the input String

*/

// Program

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseOfString {
    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any String: ");
        String input = reader.readLine();
        int l, i;
        String reverse;
        reverse = "";
        l = input.length();
        for (i = l - 1; i >= 0; i--) {
            reverse = reverse + input.charAt(i);
        }
        System.out.println("Reverse string is: " + reverse);
    }
}
