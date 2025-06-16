package day9;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        String normalizedString = s.replaceAll("[\\W_]", "").toLowerCase();
        String reversedString = new StringBuilder(normalizedString).reverse().toString();
   
        System.out.println("Reversed string: " + reversedString);
 
        if (normalizedString.equals(reversedString)) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
        
        sc.close();
    }
}
