// @author - Matthew Ernst
// @version - 1.2.1

import java.util.*;
import java.lang.*;

public class Gameshow
{
    static Random rand = new Random();



    static public void slammer(int runtime)
    {
        int selectedDoor; // -> Denotes the door that the player selected.
        int generatedDoor; // -> Denotes the door that is holding the car.
        int goatDoor = 0; // -> Denotes the door that is revealed to be a goat.
        int switchDoor = 0; // -> Denotes the door that will be swapped to.

        double totalRuns = 0;
        double totalWinsDoorSwitch = 0;
        double totalWinsDoorStay = 0;

        //Generates data in regards too switching the door.
        for(int i = 0; i < runtime; i++)
        {
            //Generates a number (1 to 3) which denotes a door choice.
            generatedDoor = rand.nextInt(3) + 1;
            selectedDoor = rand.nextInt(3) + 1;

            //Generates the 'goat' door, cant be selectedDoor or generatedDoor
            while((goatDoor != selectedDoor) && (goatDoor != generatedDoor))
                goatDoor = rand.nextInt(3) + 1; //

            //If you didn't switch doors, this would decide whether you win or lose.
            if(selectedDoor == generatedDoor)
                totalWinsDoorStay++;

            //Generates the door to switch too
            while((switchDoor != selectedDoor) && (switchDoor != goatDoor))
                switchDoor = rand.nextInt(3) + 1;

            //If you did switch doors, this would decide whether you win or lose.
            if(switchDoor == generatedDoor)
                totalWinsDoorSwitch++;

            //increment the run (for stat calculations towards the end.)
            totalRuns++;
        }

        //Outputs the statistics of the runtime calculations
        System.out.println((int)totalRuns + " runs...");
        System.out.println("\nTotal wins when switching door choice: " + (int)(totalWinsDoorSwitch));
        System.out.println("Total wins when keeping door choice: " + (int)totalWinsDoorStay);
        System.out.printf("\nChance of winning when switching door choice: %.2f%%", (totalWinsDoorSwitch/totalRuns)*100);
        System.out.printf("\nChance of winning when keeping choice: %.2f%%\n\n", (totalWinsDoorStay/totalRuns)*100);
    }
}
