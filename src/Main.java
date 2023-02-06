import java.util.Scanner;

public class Main
{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("How many times would you like to run the gameshow simulation? ");
        Gameshow.slammer(input.nextInt());
    }
}