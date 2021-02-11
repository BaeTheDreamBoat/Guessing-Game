
/**
 * the computer guesses what playing card the user has selected
 *
 * Ryan Brown
 * Kolton O'Neal
 * 2/9/21
 */
import java.io.*;
import java.util.*;
public class Tester
{
    public static void main(String args[])
    {
        Scanner kbReader = new Scanner(System.in);
        System.out.println("Type the color of your card (red/black)");
        String color = kbReader.nextLine();
        if (color.equalsIgnoreCase("red"))
        {
            
        }
        else if (color.equalsIgnoreCase("black"))
        {
            
        }
        else
            System.out.println("thats the wrong color");
    }
}
