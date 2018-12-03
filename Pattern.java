import java.util.Scanner;

public class Pattern
{
    public void printWelcomeMsg()
    {
        System.out.println("****Welcome to Triangle/Diamond Printer****");
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

    public void printPattern4(int rows)
    {
        int k = rows;
        int n = k;

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

    public void startExecution()
    {
        Pattern pt1 = new Pattern();
        
        boolean askAgain = true;
        while(askAgain)
        {
            pt1.printWelcomeMsg();
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                {
                    Scanner sc1 = new Scanner(System.in);

                    boolean again = true;
                    while(again)
                    {
                        System.out.print("How many rows would you like to print (More than 1 please):");
                        int input = sc1.nextInt();

                        if (input > 1 && input < 10)
                        {
                            pt1.printPattern1(input);
                            again = false;
                        }
                        else
                        {
                            System.out.println("Illegal entry. Try again!");
                        }
                    }
                    break;
                }
                case 2:
                {
                    Scanner sc1 = new Scanner(System.in);

                    boolean again = true;
                    while(again)
                    {
                        System.out.print("How many rows would you like to print (More than 1 please):");
                        int input = sc1.nextInt();

                        if (input > 1 && input < 10)
                        {
                            pt1.printPattern2(input);
                            again = false;
                        }
                        else
                        {
                            System.out.println("Illegal entry. Try again!");
                        }
                    }
                    break;
                }
                case 3:
                {
                    Scanner sc1 = new Scanner(System.in);

                    boolean again = true;
                    while(again)
                    {
                        System.out.print("How many rows would you like to print (More than 1 please):");
                        int input = sc1.nextInt();

                        if (input > 1 && input < 10)
                        {
                            pt1.printPattern3(input);
                            again = false;
                        }
                        else
                        {
                            System.out.println("Illegal entry. Try again!");
                        }
                    }
                    break;
                }
                case 4:
                {
                    Scanner sc1 = new Scanner(System.in);

                    boolean again = true;
                    while(again)
                    {
                        System.out.print("How many rows would you like to print (More than 1 please):");
                        int input = sc1.nextInt();

                        if (input > 1 && input < 10)
                        {
                            pt1.printPattern4(input);
                            again = false;
                        }
                        else
                        {
                            System.out.println("Illegal entry. Try again!");
                        }
                    }
                    break;
                }
                case 5:
                {
                    System.out.println("Thank you! Hope you enjoyed...");
                    askAgain = false;
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
    
    public static void main(String args[])
    {
        Pattern pt = new Pattern();
        pt.startExecution();
    }
}
