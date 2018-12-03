//---------------------------------------------------------------------
// Assignment 2
// Written by:
// To check a string whether it is a palindrome or not
// Input a string, store it in a variable.
// Reverse the same string, and store it in an another variable.
// If both the strings are equal, then the given string is palindrome.
//---------------------------------------------------------------------

// Algorithm:
// Step1: Ask user for input any string(word) and store that in a variable
// Step2: Reverse the string by extracting each character and store in another variable
// Step3: Check whether those two variables are equal
// Step4: If they are equal, print the word is palindrome. If they are not, print the word
//        is not palindrome
// Step5: Ask the user if he needs to check for another word
// Step6: If yes, go back to Step1
// Step7: If no, then exit


import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args)
    {
        // Printing the welcome message
        System.out.println("******Welcome******");

        // Setting the loop variable
        char choice = 'Y';
        while(choice == 'Y')
        {
            // String variable to store reversed word
            String reverse_word = "";

            // Scanner Obj to take input from the user through keyboard
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Please enter one word to see if it palindrome or not");
            // String variable to store the given word
            String word = sc.nextLine();

            // Reversing the given string
            for (int i = (word.length() - 1); i >= 0; i--)
                reverse_word = reverse_word + word.charAt(i);

            // Check if the given string is equal to the reversed string
            if (word.equalsIgnoreCase(reverse_word))
            {
                System.out.println("The word is a palindrome");
                // To repeat until user says no
                System.out.println("Would you like to continue? (Y for yes, n for no)");
                choice = sc.next().charAt(0);
            }
            else
            {
                System.out.println("The word is not a palindrome");
                // To repeat until user says no
                System.out.println("Would you like to continue? (Y for yes, n for no)");
                choice = sc.next().charAt(0);
            }
        }
    }
}