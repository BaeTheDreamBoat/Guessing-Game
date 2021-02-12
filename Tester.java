
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
        String yesNo = ""; //use for yes/no questions
        String hORd = ""; //use for hearst or diamonds
        String sORc = ""; //use for spade or clubs
        Scanner kbReader = new Scanner(System.in);
        System.out.println("Type the color of your card (red/blue)");
        String color = kbReader.nextLine();
        if (color.equalsIgnoreCase("red")) //asks if the card is red or blue
        {
            System.out.println("Is your card a face card?\n1-yes it is a face card\n2-no it is not a face card");
            int _class = kbReader.nextInt();
            switch(_class) //determines if the card is a face or a number
            {
                case 1: //face branch
                    System.out.println("Is your card a King?");
                    yesNo = kbReader.nextLine();
                    if (yesNo.equalsIgnoreCase("yes"))
                    {
                       System.out.print("Type if the card is the card Diamonds or Hearts");
                       hORd = kbReader.nextLine();
                       if (hORd.equalsIgnoreCase("diamonds"))
                        System.out.println("Your card is the King of Diamonds");
                       else if (hORd.equalsIgnoreCase("hearts"))
                        System.out.print("Your card is the King of Hearts");
                       else
                        System.out.print("That was not hearts or diamonds");
                    }
                    else if (yesNo.equalsIgnoreCase("no"))
                    {
                       System.out.println("Is your card a Qeen?");
                    }
                    else
                        System.out.print("That was not yes or no");
                    break;
                case 2: //number branch
                    
                    break;
                default:
                    System.out.println("That was not the numbers 1 or 2");
            }
        }
        else if (color.equalsIgnoreCase("black"))
        {
            
        }
        else
            System.out.println("thats the wrong color");
    }
}
