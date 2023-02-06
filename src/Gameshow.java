//@author - Matthew Ernst
//@version - 1.0

import java.util.*;

public class Gameshow
{
    static Random rand = new Random();

    /*
    @Goal - I need to generate a number that defines the percentage of liklihood of winning if you change numbers.
    once given the oppurtunity.*/

    static double totalRuns = 0;
    static double totalWins = 0;

    static public void slammer(int runtime)
    {
        int selectedDoor = 0; // -> Denotes the door that the player selected.
        int generatedDoor = 0; // -> Denotes the door that is holding the car.
        int goatDoor = 0; // -> Denotes the door that is revealed to be a goat.
        int switchDoor = 0; // -> Denotes the door that will be swapped to.

        for(int i = 0; i < runtime; i++)
        {
            //Generates a number that selects the door which has the car and sets a slot in the array to 1, representing the car.
            generatedDoor = rand.nextInt(3) + 1;

            //Program players door choice
            selectedDoor = rand.nextInt(3) + 1;

            //Reveal that one of the doors that isnt the selected door AND generated door
            while((goatDoor != selectedDoor) && (goatDoor != generatedDoor))
                goatDoor = rand.nextInt(3) + 1;

            //Calculate the chances of winning if swapping
            while((switchDoor != selectedDoor) && (switchDoor != goatDoor))
            {
                switchDoor = rand.nextInt(3) + 1;
            }

            if(switchDoor == generatedDoor)
                totalWins++;

            totalRuns++;
        }

        System.out.println("\nTotal Runs: " + totalRuns);
        System.out.println("Total Wins: " + totalWins);

        System.out.println("Percentage of Winning: " + ((totalWins/totalRuns))*100);
    }
}
