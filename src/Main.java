//@author - Matthew Ernst
//@version - 1.2.1

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
            System.out.print("How many times would you like to run the gameshow simulation? To quit, enter a character or 0. ");

            if (input.hasNextInt())
            {
                enter = input.nextInt();

                if (enter != 0)
                {
                    Gameshow.slammer(enter);
                }

                else
                {
                    runFlag = false;
                    System.out.println("Goodbye!");
                }
            }

            else
            {
                System.out.println("Goodbye!");
                runFlag = false;
            }
        }

    }
}