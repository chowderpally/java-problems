import java.util.Scanner;

public class Pattern
{
    public void printWelcomeMsg()
    {
        System.out.println("****Welcome to Triangle/Diamond Printer****");
        System.out.println("Which Pattern do yout want to print?");
        System.out.println("1) 54321    2)     1    3) 12345    4)   1");
        System.out.println("   5432           12        2345        123");
        System.out.println("   543           123         345       12345");
        System.out.println("   54           1234          45        123");
        System.out.println("   5           12345           5         1 ");
    }

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

    public void printPattern2(int rows)
    {
        for (int i = 1; i <= rows; i++)
        {
            for (int j = rows; j > i; j--)
            {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void printPattern3(int rows)
    {
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }

            for (int j = i; j <= rows; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
    public static void main(String args[])
    {
        Pattern pt = new Pattern();
        pt.printWelcomeMsg();
        
        System.out.print("Choose the Pattern(1-4 & 5 to quit):");
        
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        System.out.println(choice);

        switch(choice)
        {
            case 1:
            {
                Scanner sc1 = new Scanner(System.in);
                System.out.print("How many rows would you like to print (More than 1 please):");
                int input = sc1.nextInt();
                if (input > 1 && input <= 10)
                {
                    pt.printPattern1(input);
                    break;
                }
                else
                {
                    System.out.println("Illegal entry. Try again!");
                    break;
                }
            }
            case 2:
            {
                Scanner sc1 = new Scanner(System.in);
                System.out.print("How many rows would you like to print (More than 1 please):");
                int input = sc1.nextInt();
                if (input > 1 && input <= 10)
                {
                    pt.printPattern2(input);
                    break;
                }
                else
                {
                    System.out.println("Illegal entry. Try again!");
                    break;
                }
            }
            case 3:
            {
                Scanner sc1 = new Scanner(System.in);
                System.out.print("How many rows would you like to print (More than 1 please):");
                int input = sc1.nextInt();
                if (input > 1 && input <= 10)
                {
                    pt.printPattern3(input);
                    break;
                }
                else
                {
                    System.out.println("Illegal entry. Try again!");
                    break;
                }
            }
            case 4:
            {
                Scanner sc1 = new Scanner(System.in);
                System.out.print("How many rows would you like to print (More than 1 please):");
                int input = sc1.nextInt();
                if (input > 1 && input <= 10)
                {
                    System.out.println("Pattern4");
                    break;
                }
                else
                {
                    System.out.println("Illegal entry. Try again!");
                    break;
                }
            }
            case 5:
            {
                System.out.println("Thank you! Hope you enjoyed...");
                break;
            }
            default:
            {
                System.out.println("Illegal entry. Try again!");
                break;
            }
        }
    }
}
