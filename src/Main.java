import java.util.Scanner;

public class Main
{
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        boolean runFlag = true; // -> generic run loop to decide whether the player is to stay in the game or not.
        int enter; // -> the value the user will enter for the run loop.

        while(runFlag)
        {
            System.out.print("How many times would you like to run the gameshow simulation? Enter '0' to quit. ");

            if(input.hasNextInt())
            {
                enter = input.nextInt();

                if(enter == 0)
                {
                    System.out.print("Goodbye!");
                    runFlag = false; // -> cancels the loop and exits.
                }

                else
                {
                    Gameshow.slammer(enter);
                }
            }

            else
                System.out.println("Please enter an integer.");
        }

    }
}