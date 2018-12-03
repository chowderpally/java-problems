//------------------------------------------------------
// Assignment 2
// Written by: 
// Initially take the choice of input from the user to 
// choose from the patterns or to exit. We can achieve
// using while loop.
// Once after entering the while loop ask the user again
// for the input to enter the number of rows to print the
// pattern. 
//------------------------------------------------------



import java.util.Scanner;

public class Pattern
{
    // Method to print the welcome message
    public void printWelcomeMsg()
    {
        
        System.out.println("Which Pattern do yout want to print?");
        System.out.println();
        System.out.println("1) 54321    2)     1    3) 12345    4)   1");
        System.out.println("   5432           12        2345        123");
        System.out.println("   543           123         345       12345");
        System.out.println("   54           1234          45        123");
        System.out.println("   5           12345           5         1 ");
        System.out.println();
        System.out.print("Choose the Pattern(1-4 & 5 to quit):");
    }

    // Method to print the pattern1
    public void printPattern1(int rows)
    {
        for (int i = 1; i <= rows; i++) 
        { 
            for (int j = rows; j >= i; j--)
            {
                System.out.print(j);
            }
             
            System.out.println();
        }
    }

    // Method to print the pattern2
    public void printPattern2(int rows)
    {
        for (int i = 1; i <= rows; i++)
        {
            // To print required spaces before a number
            for (int j = rows; j > i; j--)
            {
                System.out.print(" ");
            }

            // To print a number
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // Method to print the pattern3
    public void printPattern3(int rows)
    {
        for (int i = 1; i <= rows; i++)
        {
            // To print required spaces before a number
            for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }

            // To print a number
            for (int j = i; j <= rows; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // Method to print the pattern4
    public void printPattern4(int rows)
    {
        int k = rows;
        int n = k;

		// To print 1st half rows of the Pattern
        for (int i = 1; i < n + 1; i++)
		{
			if (i % 2 != 0)
			{
				for (int j = 0; j < (k/2); j++)
					System.out.print(" ");
				for (int j = 1; j < (i+1); j++)
					System.out.print(j);
				System.out.println();
			}
			k = k - 1;
		}
		
        // To print 2nd half rows of the Pattern
        for (int i = (n - 1); i > 0; i--)
		{
			if (i % 2 != 0)
			{
				for (int j = 0; j <= (k/2); j++)
					System.out.print(" ");
				for (int j = 1; j < (i+1); j++)
					System.out.print(j);
				System.out.println();
			}
			k = k + 1;
		}
    }
    
    public static void main(String args[])
    {
        // Display the Title of the Program
        System.out.println("****Welcome to Triangle/Diamond Printer****");
        System.out.println();

        // Object of the Class 'Pattern'
        Pattern pt = new Pattern();

        // A variable to break the while loop after a given condition is met
        boolean askAgain = true;
        while(askAgain)
        {
            // Calling the Welcome Message
            pt.printWelcomeMsg();

            // Creation object to take input from the user through keyboard
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            // Directing the execution flow based on the choice that has entered by the user
            switch(choice)
            {
                // To print the pattern1
                case 1:
                {
                    // Creation object to take input from the user through keyboard
                    Scanner sc1 = new Scanner(System.in);

                    // A variable to break the while loop after a given condition is met
                    boolean again = true;
                    while(again)
                    {
                        System.out.print("How many rows would you like to print (More than 1 please):");
                        int input = sc1.nextInt();

                        if (input > 1 && input < 10)
                        {
                            pt.printPattern1(input);
                            again = false;
                        }
                        else
                        {
                            System.out.println("Illegal entry. Try again!");
                        }
                    }
                    // To get out of the case statement
                    break;
                }
                // To print the pattern2
                case 2:
                {
                    // Creation object to take input from the user through keyboard
                    Scanner sc1 = new Scanner(System.in);

                    // A variable to break the while loop after a given condition is met
                    boolean again = true;
                    while(again)
                    {
                        System.out.print("How many rows would you like to print (More than 1 please):");
                        int input = sc1.nextInt();

                        if (input > 1 && input < 10)
                        {
                            pt.printPattern2(input);
                            again = false;
                        }
                        else
                        {
                            System.out.println("Illegal entry. Try again!");
                        }
                    }
                    // To get out of the case statement
                    break;
                }
                // To print the pattern3
                case 3:
                {
                    // Creation object to take input from the user through keyboard
                    Scanner sc1 = new Scanner(System.in);

                    // A variable to break the while loop after a given condition is met
                    boolean again = true;
                    while(again)
                    {
                        System.out.print("How many rows would you like to print (More than 1 please):");
                        int input = sc1.nextInt();

                        if (input > 1 && input < 10)
                        {
                            pt.printPattern3(input);
                            again = false;
                        }
                        else
                        {
                            System.out.println("Illegal entry. Try again!");
                        }
                    }
                    // To get out of the case statement
                    break;
                }
                // To print the pattern4
                case 4:
                {
                    // Creation object to take input from the user through keyboard
                    Scanner sc1 = new Scanner(System.in);

                    // A variable to break the while loop after a given condition is met
                    boolean again = true;
                    while(again)
                    {
                        System.out.print("How many rows would you like to print (More than 1 please):");
                        int input = sc1.nextInt();

                        if (input > 1 && input < 10)
                        {
                            pt.printPattern4(input);
                            again = false;
                        }
                        else
                        {
                            System.out.println("Illegal entry. Try again!");
                        }
                    }
                    // To get out of the case statement
                    break;
                }

                // To exit out of the program
                case 5:
                {
                    System.out.println("Thank you! Hope you enjoyed...");
                    askAgain = false;
                    break;
                }
                // For invalid entry
                default:
                {
                    System.out.println("Illegal entry. Try again!");
                    break;
                }
            }

        }
    }
}
