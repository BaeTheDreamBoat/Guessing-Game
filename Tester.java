/**
 * the computer guesses what playing card the user has selected
 *
 * Ryan Brown
 * Kolton O'Neal
 * 2/9/21
 * 
 * 
 * System.out.println("Is your (Name of of card)? (Yes/No)");
 * yesNo = kbReader.next();
 * if (yesNo.equalsIgnoreCase("yes"))
 * {
 *      System.out.print("Neat");
 *      picture.loadImage("monkeyhaircut.jpeg");
 *      picture.show();
 * }
 * else if (yesNo.equalsIgnoreCase("no"))
 *      System.out.print("I blame the user");
 * else
 *      System.out.print("that was not yes or no");
 */
import java.io.*;
import java.util.*;
import csteutils.myro.*;
import csteutils.*;
import java.util.Scanner;
public class Tester
{
    public static void main(String args[])
    {
        String yesNo = ""; //use for yes/no questions
        String hORd = ""; //use for hearts or diamonds
        String sORc = ""; //use for spades or clubs
        MyroColorImage picture = new MyroColorImage(200, 200);
        Scanner kbReader = new Scanner(System.in);
        System.out.println("Type the color of your card (red/black)");
        String color = kbReader.next();
        if (color.equalsIgnoreCase("red")) //asks if the card is red or blue
        {
            System.out.println("Is your card a face card?\n1-yes it is a face card\n2-no it is not a face card");
            int _class = kbReader.nextInt();
            switch(_class) //determines if the card is a face or a number
            {
                case 1: //face branch
                System.out.println("Is your card a King? (Yes/No)");
                yesNo = kbReader.next();
                if (yesNo.equalsIgnoreCase("yes"))
                {
                    boolean chkKing = true; //this will help determine if card is joker
                    System.out.println("Is the card Hearts or Diamonds? (Hearts/Diamonds)");
                    hORd = kbReader.next();
                    if (hORd.equalsIgnoreCase("diamonds"))
                    {
                        System.out.println("Is your card the King of Diamonds? (Yes/No)");
                        yesNo = kbReader.next();
                        if (yesNo.equalsIgnoreCase("yes"))
                        {
                            System.out.print("Neat");
                            picture.loadImage("monkeyhaircut.jpeg");
                            picture.show();
                        }
                        else if (yesNo.equalsIgnoreCase("no"))
                            System.out.print("I blame the user");
                        else
                            System.out.print("that was not yes or no");
                    }
                    else if (hORd.equalsIgnoreCase("hearts"))
                    {
                        System.out.println("Is your the King of Hearts? (Yes/No)");
                        yesNo = kbReader.next();
                        if (yesNo.equalsIgnoreCase("yes"))
                        {
                            System.out.print("Neat");
                            picture.loadImage("monkeyhaircut.jpeg");
                            picture.show();
                        }
                        else if (yesNo.equalsIgnoreCase("no"))
                            System.out.print("I blame the user");
                        else
                            System.out.print("that was not yes or no");
                    }
                    else
                        System.out.print("That was not hearts or diamonds");
                }
                else if (yesNo.equalsIgnoreCase("no"))
                {
                    boolean chkKing = false;
                    System.out.println("Is your card a Queen? (Yes/No)");
                    yesNo = kbReader.next();
                    if (yesNo.equalsIgnoreCase("yes"))
                    {
                        boolean chkQueen = true;
                        System.out.println("Is the card Hearts or Diamonds? (Hearts/Diamonds)");
                        hORd = kbReader.next();
                        if (hORd.equalsIgnoreCase("diamonds"))
                        {
                            System.out.println("Is your card the Queen of Diamonds? (Yes/no)");
                            yesNo = kbReader.next();
                            if (yesNo.equalsIgnoreCase("yes"))
                            {
                                System.out.print("Neat");
                                picture.loadImage("monkeyhaircut.jpeg");
                                picture.show();
                            }
                            else if (yesNo.equalsIgnoreCase("no"))
                                System.out.print("I blame the user");
                            else
                                System.out.print("that was not yes or no");
                        }
                        else if (hORd.equalsIgnoreCase("hearts"))
                        {
                            System.out.println("Is yor card the Queen of Hearts? (Yes/No)");
                            yesNo = kbReader.next();
                            if (yesNo.equalsIgnoreCase("yes"))
                            {
                                System.out.print("Neat");
                                picture.loadImage("monkeyhaircut.jpeg");
                                picture.show();
                            }
                            else if (yesNo.equalsIgnoreCase("no"))
                                System.out.print("I blame the user");
                            else
                                System.out.print("that was not yes or no");
                        }
                        else
                            System.out.print("That was not hearts or diamonds");
                    }
                    else if (yesNo.equalsIgnoreCase("no"))
                    {
                        boolean chkQueen = false;
                        System.out.println("Is your card a Jack? (Yes/No)");
                        yesNo = kbReader.next();
                        if (yesNo.equalsIgnoreCase("yes"))
                        {
                            boolean chkJack = true;
                            System.out.println("Is the card Hearts or Diamonds? (Hearts/Diamonds)");
                            hORd = kbReader.next();
                            if (hORd.equalsIgnoreCase("diamonds"))
                            {
                                System.out.println("Is your card the Jack of Diamonds? (Yes/No)");
                                yesNo = kbReader.next();
                                if (yesNo.equalsIgnoreCase("yes"))
                                {
                                    System.out.print("Neat");
                                    picture.loadImage("monkeyhaircut.jpeg");
                                    picture.show();
                                }
                                else if (yesNo.equalsIgnoreCase("no"))
                                    System.out.print("I blame the user");
                                else
                                    System.out.print("that was not yes or no");
                            }
                            else if (hORd.equalsIgnoreCase("hearts"))
                            {
                                System.out.println("Is your card the Jack of Hearts? (Yes/No)");
                                yesNo = kbReader.next();
                                if (yesNo.equalsIgnoreCase("yes"))
                                {
                                    System.out.print("Neat");
                                    picture.loadImage("monkeyhaircut.jpeg");
                                    picture.show();
                                }
                                else if (yesNo.equalsIgnoreCase("no"))
                                    System.out.print("I blame the user");
                                else
                                    System.out.print("that was not yes or no");
                            }
                            else
                                System.out.print("That was not hearts or diamonds");
                        }
                        else if (yesNo.equalsIgnoreCase("no"))
                        {
                            boolean chkJack = false;
                            if (chkKing&&chkQueen&&chkJack==true)
                                System.out.println("I dont know how you got here, as this outcome is not possible");
                            else
                            {
                                System.out.println("Is your card the Joker? (Yes/No)");
                                yesNo = kbReader.next();
                                if (yesNo.equalsIgnoreCase("yes"))
                                {
                                    System.out.print("Neat");
                                    picture.loadImage("monkeyhaircut.jpeg");
                                    picture.show();
                                }
                                else if (yesNo.equalsIgnoreCase("no"))
                                    System.out.print("I blame the user");
                                else
                                    System.out.print("that was not yes or no");
                            }
                        }
                        else
                            System.out.print("That was not yes or no");
                    }
                    else
                        System.out.print("That was not yes or no");
                }
                else
                    System.out.print("That was not yes or no");
                break;
                case 2: //number branch
                System.out.println("Is your card even or odd? (Even/Odd)");
                String evenOdd = kbReader.next();
                if (evenOdd.equalsIgnoreCase("even"))
                {
                    System.out.println("is the number...\n1-greater than 6\n2-less than 6\n3-equal to 6");
                    int gle = kbReader.nextInt();
                    switch (gle) // gle = greater than, less than, or equal
                    {
                        case 1:
                        System.out.println("Is the number 8, or greater than 8 (=/>)");
                        String eg = kbReader.next();
                        if (eg.equals("="))
                        {
                            System.out.println("Is the card Hearts or Diamonds? (Hearts/Diamonds)");
                            hORd = kbReader.next();
                            if (hORd.equalsIgnoreCase("diamonds"))
                            {
                                System.out.println("Is your card the Eight of Diamonds? (Yes/No)");
                                yesNo = kbReader.next();
                                if (yesNo.equalsIgnoreCase("yes"))
                                {
                                    System.out.print("Neat");
                                    picture.loadImage("monkeyhaircut.jpeg");
                                    picture.show();
                                }
                                else if (yesNo.equalsIgnoreCase("no"))
                                    System.out.print("I blame the user");
                                else
                                    System.out.print("that was not yes or no");
                            }
                            else if (hORd.equalsIgnoreCase("hearts"))
                            {
                                System.out.println("Is your card the Eight of Hearts? (Yes/No)");
                                yesNo = kbReader.next();
                                if (yesNo.equalsIgnoreCase("yes"))
                                {
                                    System.out.print("Neat");
                                    picture.loadImage("monkeyhaircut.jpeg");
                                    picture.show();
                                }
                                else if (yesNo.equalsIgnoreCase("no"))
                                    System.out.print("I blame the user");
                                else
                                    System.out.print("that was not yes or no");
                            }
                        }
                        else if (eg.equals(">"))
                        {
                            System.out.println("Is the card Hearts or Diamonds? (Hearts/Diamonds)");
                            hORd = kbReader.next();
                            if (hORd.equalsIgnoreCase("diamonds"))
                            {
                                System.out.println("Is your card the Ten of Diamonds? (Yes/No)");
                                yesNo = kbReader.next();
                                if (yesNo.equalsIgnoreCase("yes"))
                                {
                                    System.out.print("Neat");
                                    picture.loadImage("monkeyhaircut.jpeg");
                                    picture.show();
                                }
                                else if (yesNo.equalsIgnoreCase("no"))
                                    System.out.print("I blame the user");
                                else
                                    System.out.print("that was not yes or no");
                            }
                            else if (hORd.equalsIgnoreCase("hearts"))
                            {
                                System.out.println("Is your card the Ten of Hearts? (Yes/No)");
                                yesNo = kbReader.next();
                                if (yesNo.equalsIgnoreCase("yes"))
                                {
                                    System.out.print("Neat");
                                    picture.loadImage("monkeyhaircut.jpeg");
                                    picture.show();
                                }
                                else if (yesNo.equalsIgnoreCase("no"))
                                    System.out.print("I blame the user");
                                else
                                    System.out.print("that was not yes or no");
                            }
                        }
                        else
                            System.out.print("that was not a = symbol or a > symbol");
                        break;
                        case 2:
                        System.out.println("Is the number 4, or less than 4 (=/<)");
                        String el = kbReader.next();
                        if (el.equals("="))
                        {
                            System.out.println("Is the card Hearts or Diamonds? (Hearts/Diamonds)");
                            hORd = kbReader.next();
                            if (hORd.equalsIgnoreCase("diamonds"))
                            {
                                System.out.println("Is your card the Four of Diamonds? (Yes/No)");
                                yesNo = kbReader.next();
                                if (yesNo.equalsIgnoreCase("yes"))
                                {
                                    System.out.print("Neat");
                                    picture.loadImage("monkeyhaircut.jpeg");
                                    picture.show();
                                }
                                else if (yesNo.equalsIgnoreCase("no"))
                                    System.out.print("I blame the user");
                                else
                                    System.out.print("that was not yes or no");
                            }
                            else if (hORd.equalsIgnoreCase("hearts"))
                            {
                                System.out.println("Is your card the Four of Hearts? (Yes/No)");
                                yesNo = kbReader.next();
                                if (yesNo.equalsIgnoreCase("yes"))
                                {
                                    System.out.print("Neat");
                                    picture.loadImage("monkeyhaircut.jpeg");
                                    picture.show();
                                }
                                else if (yesNo.equalsIgnoreCase("no"))
                                    System.out.print("I blame the user");
                                else
                                    System.out.print("that was not yes or no");
                            }
                        }
                        else if (el.equals("<"))
                        {
                            System.out.println("Is the card Hearts or Diamonds? (Hearts/Diamonds)");
                            hORd = kbReader.next();
                            if (hORd.equalsIgnoreCase("diamonds"))
                            {
                                System.out.println("Is your card the Two of Diamonds? (Yes/No)");
                                yesNo = kbReader.next();
                                if (yesNo.equalsIgnoreCase("yes"))
                                {
                                    System.out.print("Neat");
                                    picture.loadImage("monkeyhaircut.jpeg");
                                    picture.show();
                                }
                                else if (yesNo.equalsIgnoreCase("no"))
                                    System.out.print("I blame the user");
                                else
                                    System.out.print("that was not yes or no");
                            }
                            else if (hORd.equalsIgnoreCase("hearts"))
                            {
                                System.out.println("Is your card the Two of Hearts? (Yes/No)");
                                yesNo = kbReader.next();
                                if (yesNo.equalsIgnoreCase("yes"))
                                {
                                    System.out.print("Neat");
                                    picture.loadImage("monkeyhaircut.jpeg");
                                    picture.show();
                                }
                                else if (yesNo.equalsIgnoreCase("no"))
                                    System.out.print("I blame the user");
                                else
                                    System.out.print("that was not yes or no");
                            }
                        }
                        else
                            System.out.print("that was not a = symbol or a > symbol");
                        break;
                        case 3:
                        System.out.println("Is the card Hearts or Diamonds? (Hearts/Diamonds)");
                        hORd = kbReader.next();
                        if (hORd.equalsIgnoreCase("diamonds"))
                        {
                            System.out.println("Is your card the Six of Diamonds? (Yes/No)");
                            yesNo = kbReader.next();
                            if (yesNo.equalsIgnoreCase("yes"))
                            {
                                System.out.print("Neat");
                                picture.loadImage("monkeyhaircut.jpeg");
                                picture.show();
                            }
                            else if (yesNo.equalsIgnoreCase("no"))
                                System.out.print("I blame the user");
                            else
                                System.out.print("that was not yes or no");
                        }
                        else if (hORd.equalsIgnoreCase("hearts"))
                        {
                            System.out.println("Is your card the Six of Hearts? (Yes/No)");
                            yesNo = kbReader.next();
                            if (yesNo.equalsIgnoreCase("yes"))
                            {
                                System.out.print("Neat");
                                picture.loadImage("monkeyhaircut.jpeg");
                                picture.show();
                            }
                            else if (yesNo.equalsIgnoreCase("no"))
                                System.out.print("I blame the user");
                            else
                                System.out.print("that was not yes or no");
                        }
                        break;
                        default:
                        System.out.print("that wan not a number 1 to 3");
                    }
                }
                else if (evenOdd.equalsIgnoreCase("odd"))
                {
                    System.out.println("is the number...\n1-greater than 5\n2-less than 5\n3-equal to 5");
                    int gle = kbReader.nextInt();
                    switch (gle)
                    {
                        case 1:
                        System.out.println("Is the number 7, or greater than 7 (=/>)");
                        String eg = kbReader.next();
                        if (eg.equals("="))
                        {
                            System.out.println("Is the card Hearts or Diamonds? (Hearts/Diamonds)");
                            hORd = kbReader.next();
                            if (hORd.equalsIgnoreCase("diamonds"))
                            {
                                System.out.println("Is your card the Seven of Diamonds? (Yes/No)");
                                yesNo = kbReader.next();
                                if (yesNo.equalsIgnoreCase("yes"))
                                {
                                    System.out.print("Neat");
                                    picture.loadImage("monkeyhaircut.jpeg");
                                    picture.show();
                                }
                                else if (yesNo.equalsIgnoreCase("no"))
                                    System.out.print("I blame the user");
                                else
                                    System.out.print("that was not yes or no");
                            }
                            else if (hORd.equalsIgnoreCase("hearts"))
                            {
                                System.out.println("Is your card the Seven of Hearts? (Yes/No)");
                                yesNo = kbReader.next();
                                if (yesNo.equalsIgnoreCase("yes"))
                                {
                                    System.out.print("Neat");
                                    picture.loadImage("monkeyhaircut.jpeg");
                                    picture.show();
                                }
                                else if (yesNo.equalsIgnoreCase("no"))
                                    System.out.print("I blame the user");
                                else
                                    System.out.print("that was not yes or no");
                            }
                        }
                        else if (eg.equals(">"))
                        {
                            System.out.println("Is the card Hearts or Diamonds? (Hearts/Diamonds)");
                            hORd = kbReader.next();
                            if (hORd.equalsIgnoreCase("diamonds"))
                            {
                                System.out.println("Is your card the Nine of Diamonds? (Yes/No)");
                                yesNo = kbReader.next();
                                if (yesNo.equalsIgnoreCase("yes"))
                                {
                                    System.out.print("Neat");
                                    picture.loadImage("monkeyhaircut.jpeg");
                                    picture.show();
                                }
                                else if (yesNo.equalsIgnoreCase("no"))
                                    System.out.print("I blame the user");
                                else
                                    System.out.print("that was not yes or no");
                            }
                            else if (hORd.equalsIgnoreCase("hearts"))
                            {
                                System.out.println("Is your card the Nine of Hearts? (Yes/No)");
                                yesNo = kbReader.next();
                                if (yesNo.equalsIgnoreCase("yes"))
                                {
                                    System.out.print("Neat");
                                    picture.loadImage("monkeyhaircut.jpeg");
                                    picture.show();
                                }
                                else if (yesNo.equalsIgnoreCase("no"))
                                    System.out.print("I blame the user");
                                else
                                    System.out.print("that was not yes or no");
                            }
                        }
                        else
                            System.out.print("that was not a = symbol or a > symbol");
                        break;
                        case 2:
                        System.out.println("Is the number 3, or less than 3 (=/<)");
                        String el = kbReader.next();
                        if (el.equals("="))
                        {
                            System.out.println("Is the card Hearts or Diamonds? (Hearts/Diamonds)");
                            hORd = kbReader.next();
                            if (hORd.equalsIgnoreCase("diamonds"))
                            {
                                System.out.println("Is your card the Three of Diamonds? (Yes/No)");
                                yesNo = kbReader.next();
                                if (yesNo.equalsIgnoreCase("yes"))
                                {
                                    System.out.print("Neat");
                                    picture.loadImage("monkeyhaircut.jpeg");
                                    picture.show();
                                }
                                else if (yesNo.equalsIgnoreCase("no"))
                                    System.out.print("I blame the user");
                                else
                                    System.out.print("that was not yes or no");
                            }
                            else if (hORd.equalsIgnoreCase("hearts"))
                            {
                                System.out.println("Is your card the Three of Hearts? (Yes/No)");
                                yesNo = kbReader.next();
                                if (yesNo.equalsIgnoreCase("yes"))
                                {
                                    System.out.print("Neat");
                                    picture.loadImage("monkeyhaircut.jpeg");
                                    picture.show();
                                }
                                else if (yesNo.equalsIgnoreCase("no"))
                                    System.out.print("I blame the user");
                                else
                                    System.out.print("that was not yes or no");
                            }
                        }
                        else if (el.equals("<"))
                        {
                            System.out.println("Is the card Hearts or Diamonds? (Hearts/Diamonds)");
                            hORd = kbReader.next();
                            if (hORd.equalsIgnoreCase("diamonds"))
                            {
                                System.out.println("Is your card the Ace of Diamonds? (Yes/No)");
                                yesNo = kbReader.next();
                                if (yesNo.equalsIgnoreCase("yes"))
                                {
                                    System.out.print("Neat");
                                    picture.loadImage("monkeyhaircut.jpeg");
                                    picture.show();
                                }
                                else if (yesNo.equalsIgnoreCase("no"))
                                    System.out.print("I blame the user");
                                else
                                    System.out.print("that was not yes or no");
                            }
                            else if (hORd.equalsIgnoreCase("hearts"))
                            {
                                System.out.println("Is your card the Ace of Hearts? (Yes/No)");
                                yesNo = kbReader.next();
                                if (yesNo.equalsIgnoreCase("yes"))
                                {
                                    System.out.print("Neat");
                                    picture.loadImage("monkeyhaircut.jpeg");
                                    picture.show();
                                }
                                else if (yesNo.equalsIgnoreCase("no"))
                                    System.out.print("I blame the user");
                                else
                                    System.out.print("that was not yes or no");
                            }
                        }
                        else
                            System.out.print("that was not a = symbol or a > symbol");
                        break;
                        case 3:
                        System.out.println("Is the card Hearts or Diamonds? (Hearts/Diamonds)");
                        hORd = kbReader.next();
                        if (hORd.equalsIgnoreCase("diamonds"))
                        {
                            System.out.println("Is your card the Five of Diamonds? (Yes/No)");
                            yesNo = kbReader.next();
                            if (yesNo.equalsIgnoreCase("yes"))
                            {
                                System.out.print("Neat");
                                picture.loadImage("monkeyhaircut.jpeg");
                                picture.show();
                            }
                            else if (yesNo.equalsIgnoreCase("no"))
                                System.out.print("I blame the user");
                            else
                                System.out.print("that was not yes or no");
                        }
                        else if (hORd.equalsIgnoreCase("hearts"))
                        {
                            System.out.println("Is your card the Five of Hearts? (Yes/No)");
                            yesNo = kbReader.next();
                            if (yesNo.equalsIgnoreCase("yes"))
                            {
                                System.out.print("Neat");
                                picture.loadImage("monkeyhaircut.jpeg");
                                picture.show();
                            }
                            else if (yesNo.equalsIgnoreCase("no"))
                                System.out.print("I blame the user");
                            else
                                System.out.print("that was not yes or no");
                        }
                        break;
                        default:
                        System.out.print("that wan not a number 1 to 3");
                    }
                }
                else
                    System.out.print("that was not \"even\" or \"odd\"");

                break;
                default:
                System.out.println("That was not the numbers 1 or 2");
            }
        }
        else if (color.equalsIgnoreCase("black"))
        {
            System.out.println("Is your card a face card?\n1-yes it is a face card\n2-no it is not a face card");
            int _class = kbReader.nextInt();
            switch(_class) //determines if the card is a face or a number
            {
                case 1: //face branch
                System.out.println("Is your card a King? (Yes/No)");
                yesNo = kbReader.next();
                if (yesNo.equalsIgnoreCase("yes"))
                {
                    boolean chkKing = true; //this will help determine if card is joker
                    System.out.println("Is the card Spades or Clubs? (Spades/Clubs)");
                    sORc = kbReader.next();
                    if (sORc.equalsIgnoreCase("spades"))
                    {
                        System.out.println("Is your card the King of Spades? (Yes/No)");
                        yesNo = kbReader.next();
                        if (yesNo.equalsIgnoreCase("yes"))
                        {
                            System.out.print("Neat");
                            picture.loadImage("monkeyhaircut.jpeg");
                            picture.show();
                        }
                        else if (yesNo.equalsIgnoreCase("no"))
                            System.out.print("I blame the user");
                        else
                            System.out.print("that was not yes or no");
                    }
                    else if (sORc.equalsIgnoreCase("clubs"))
                    {
                        System.out.println("Is your the King of Clubs? (Yes/No)");
                        yesNo = kbReader.next();
                        if (yesNo.equalsIgnoreCase("yes"))
                        {
                            System.out.print("Neat");
                            picture.loadImage("monkeyhaircut.jpeg");
                            picture.show();
                        }
                        else if (yesNo.equalsIgnoreCase("no"))
                            System.out.print("I blame the user");
                        else
                            System.out.print("that was not yes or no");
                    }
                    else
                        System.out.print("That was not clubs or spades");
                }
                else if (yesNo.equalsIgnoreCase("no"))
                {
                    boolean chkKing = false;
                    System.out.println("Is your card a Queen? (Yes/No)");
                    yesNo = kbReader.next();
                    if (yesNo.equalsIgnoreCase("yes"))
                    {
                        boolean chkQueen = true;
                        System.out.println("Is the card Clubs or Spades? (Clubs/Spades)");
                        sORc = kbReader.next();
                        if (sORc.equalsIgnoreCase("spades"))
                        {
                            System.out.println("Is your card the Queen of Spades? (Yes/no)");
                            yesNo = kbReader.next();
                            if (yesNo.equalsIgnoreCase("yes"))
                            {
                                System.out.print("Neat");
                                picture.loadImage("monkeyhaircut.jpeg");
                                picture.show();
                            }
                            else if (yesNo.equalsIgnoreCase("no"))
                                System.out.print("I blame the user");
                            else
                                System.out.print("that was not yes or no");
                        }
                        else if (sORc.equalsIgnoreCase("clubs"))
                        {
                            System.out.println("Is yor card the Queen of Clubs? (Yes/No)");
                            yesNo = kbReader.next();
                            if (yesNo.equalsIgnoreCase("yes"))
                            {
                                System.out.print("Neat");
                                picture.loadImage("monkeyhaircut.jpeg");
                                picture.show();
                            }
                            else if (yesNo.equalsIgnoreCase("no"))
                                System.out.print("I blame the user");
                            else
                                System.out.print("that was not yes or no");
                        }
                        else
                            System.out.print("That was not clubs or spades");
                    }
                    else if (yesNo.equalsIgnoreCase("no"))
                    {
                        boolean chkQueen = false;
                        System.out.println("Is your card a Jack? (Yes/No)");
                        yesNo = kbReader.next();
                        if (yesNo.equalsIgnoreCase("yes"))
                        {
                            boolean chkJack = true;
                            System.out.println("Is the card Clubs or Spades? (Clubs/Spades)");
                            sORc = kbReader.next();
                            if (sORc.equalsIgnoreCase("spades"))
                            {
                                System.out.println("Is your card the Jack of Spades? (Yes/No)");
                                yesNo = kbReader.next();
                                if (yesNo.equalsIgnoreCase("yes"))
                                {
                                    System.out.print("Neat");
                                    picture.loadImage("monkeyhaircut.jpeg");
                                    picture.show();
                                }
                                else if (yesNo.equalsIgnoreCase("no"))
                                    System.out.print("I blame the user");
                                else
                                    System.out.print("that was not yes or no");
                            }
                            else if (sORc.equalsIgnoreCase("clubs"))
                            {
                                System.out.println("Is your card the Jack of Clubs? (Yes/No)");
                                yesNo = kbReader.next();
                                if (yesNo.equalsIgnoreCase("yes"))
                                {
                                    System.out.print("Neat");
                                    picture.loadImage("monkeyhaircut.jpeg");
                                    picture.show();
                                }
                                else if (yesNo.equalsIgnoreCase("no"))
                                    System.out.print("I blame the user");
                                else
                                    System.out.print("that was not yes or no");
                            }
                            else
                                System.out.print("That was not clubs or spades");
                        }
                        else if (yesNo.equalsIgnoreCase("no"))
                        {
                            boolean chkJack = false;
                            if (chkKing&&chkQueen&&chkJack==true)
                                System.out.println("I dont know how you got here, as this outcome is not possible");
                            else
                            {
                                System.out.println("Is your card the Joker? (Yes/No)");
                                yesNo = kbReader.next();
                                if (yesNo.equalsIgnoreCase("yes"))
                                {
                                    System.out.print("Neat");
                                    picture.loadImage("monkeyhaircut.jpeg");
                                    picture.show();
                                }
                                else if (yesNo.equalsIgnoreCase("no"))
                                    System.out.print("I blame the user");
                                else
                                    System.out.print("that was not yes or no");
                            }
                        }
                        else
                            System.out.print("That was not yes or no");
                    }
                    else
                        System.out.print("That was not yes or no");
                }
                else
                    System.out.print("That was not yes or no");
                break;
                case 2: //number branch
                System.out.println("Is your card even or odd? (Even/Odd)");
                String evenOdd = kbReader.next();
                if (evenOdd.equalsIgnoreCase("even"))
                {
                    System.out.println("is the number...\n1-greater than 6\n2-less than 6\n3-equal to 6");
                    int gle = kbReader.nextInt();
                    switch (gle) // gle = greater than, less than, or equal
                    {
                        case 1:
                        System.out.println("Is the number 8, or greater than 8 (=/>)");
                        String eg = kbReader.next();
                        if (eg.equals("="))
                        {
                            System.out.println("Is the card clubs or spades? (clubs/spades)");
                            sORc = kbReader.next();
                            if (sORc.equalsIgnoreCase("spades"))
                            {
                                System.out.println("Is your card the Eight of Spades? (Yes/No)");
                                yesNo = kbReader.next();
                                if (yesNo.equalsIgnoreCase("yes"))
                                {
                                    System.out.print("Neat");
                                    picture.loadImage("monkeyhaircut.jpeg");
                                    picture.show();
                                }
                                else if (yesNo.equalsIgnoreCase("no"))
                                    System.out.print("I blame the user");
                                else
                                    System.out.print("that was not yes or no");
                            }
                            else if (sORc.equalsIgnoreCase("clubs"))
                            {
                                System.out.println("Is your card the Eight of Clubs? (Yes/No)");
                                yesNo = kbReader.next();
                                if (yesNo.equalsIgnoreCase("yes"))
                                {
                                    System.out.print("Neat");
                                    picture.loadImage("monkeyhaircut.jpeg");
                                    picture.show();
                                }
                                else if (yesNo.equalsIgnoreCase("no"))
                                    System.out.print("I blame the user");
                                else
                                    System.out.print("that was not yes or no");
                            }
                        }
                        else if (eg.equals(">"))
                        {
                            System.out.println("Is the card clubs or spades? (clubs/spades)");
                            sORc = kbReader.next();
                            if (sORc.equalsIgnoreCase("spades"))
                            {
                                System.out.println("Is your card the Ten of spades? (Yes/No)");
                                yesNo = kbReader.next();
                                if (yesNo.equalsIgnoreCase("yes"))
                                {
                                    System.out.print("Neat");
                                    picture.loadImage("monkeyhaircut.jpeg");
                                    picture.show();
                                }
                                else if (yesNo.equalsIgnoreCase("no"))
                                    System.out.print("I blame the user");
                                else
                                    System.out.print("that was not yes or no");
                            }
                            else if (sORc.equalsIgnoreCase("clubs"))
                            {
                                System.out.println("Is your card the Ten of clubs? (Yes/No)");
                                yesNo = kbReader.next();
                                if (yesNo.equalsIgnoreCase("yes"))
                                {
                                    System.out.print("Neat");
                                    picture.loadImage("monkeyhaircut.jpeg");
                                    picture.show();
                                }
                                else if (yesNo.equalsIgnoreCase("no"))
                                    System.out.print("I blame the user");
                                else
                                    System.out.print("that was not yes or no");
                            }
                        }
                        else
                            System.out.print("that was not a = symbol or a > symbol");
                        break;
                        case 2:
                        System.out.println("Is the number 4, or less than 4 (=/<)");
                        String el = kbReader.next();
                        if (el.equals("="))
                        {
                            System.out.println("Is the card clubs or spades? (clubs/spades)");
                            sORc = kbReader.next();
                            if (sORc.equalsIgnoreCase("spades"))
                            {
                                System.out.println("Is your card the Four of Spades? (Yes/No)");
                                yesNo = kbReader.next();
                                if (yesNo.equalsIgnoreCase("yes"))
                                {
                                    System.out.print("Neat");
                                    picture.loadImage("monkeyhaircut.jpeg");
                                    picture.show();
                                }
                                else if (yesNo.equalsIgnoreCase("no"))
                                    System.out.print("I blame the user");
                                else
                                    System.out.print("that was not yes or no");
                            }
                            else if (sORc.equalsIgnoreCase("clubs"))
                            {
                                System.out.println("Is your card the Four of Clubs? (Yes/No)");
                                yesNo = kbReader.next();
                                if (yesNo.equalsIgnoreCase("yes"))
                                {
                                    System.out.print("Neat");
                                    picture.loadImage("monkeyhaircut.jpeg");
                                    picture.show();
                                }
                                else if (yesNo.equalsIgnoreCase("no"))
                                    System.out.print("I blame the user");
                                else
                                    System.out.print("that was not yes or no");
                            }
                        }
                        else if (el.equals("<"))
                        {
                            System.out.println("Is the card clubs or spades? (clubs/spades)");
                            sORc = kbReader.next();
                            if (sORc.equalsIgnoreCase("spades"))
                            {
                                System.out.println("Is your card the Two of spades? (Yes/No)");
                                yesNo = kbReader.next();
                                if (yesNo.equalsIgnoreCase("yes"))
                                {
                                    System.out.print("Neat");
                                    picture.loadImage("monkeyhaircut.jpeg");
                                    picture.show();
                                }
                                else if (yesNo.equalsIgnoreCase("no"))
                                    System.out.print("I blame the user");
                                else
                                    System.out.print("that was not yes or no");
                            }
                            else if (sORc.equalsIgnoreCase("hearts"))
                            {
                                System.out.println("Is your card the Two of Clubs? (Yes/No)");
                                yesNo = kbReader.next();
                                if (yesNo.equalsIgnoreCase("yes"))
                                {
                                    System.out.print("Neat");
                                    picture.loadImage("monkeyhaircut.jpeg");
                                    picture.show();
                                }
                                else if (yesNo.equalsIgnoreCase("no"))
                                    System.out.print("I blame the user");
                                else
                                    System.out.print("that was not yes or no");
                            }
                        }
                        else
                            System.out.print("that was not a = symbol or a > symbol");
                        break;
                        case 3:
                        System.out.println("Is the card Clubs or Spades? (Clubs/Spades)");
                        sORc = kbReader.next();
                        if (sORc.equalsIgnoreCase("spades"))
                        {
                            System.out.println("Is your card the Six of Spades? (Yes/No)");
                            yesNo = kbReader.next();
                            if (yesNo.equalsIgnoreCase("yes"))
                            {
                                System.out.print("Neat");
                                picture.loadImage("monkeyhaircut.jpeg");
                                picture.show();
                            }
                            else if (yesNo.equalsIgnoreCase("no"))
                                System.out.print("I blame the user");
                            else
                                System.out.print("that was not yes or no");
                        }
                        else if (sORc.equalsIgnoreCase("clubs"))
                        {
                            System.out.println("Is your card the Six of Clubs? (Yes/No)");
                            yesNo = kbReader.next();
                            if (yesNo.equalsIgnoreCase("yes"))
                            {
                                System.out.print("Neat");
                                picture.loadImage("monkeyhaircut.jpeg");
                                picture.show();
                            }
                            else if (yesNo.equalsIgnoreCase("no"))
                                System.out.print("I blame the user");
                            else
                                System.out.print("that was not yes or no");
                        }
                        break;
                        default:
                        System.out.print("that wan not a number 1 to 3");
                    }
                }
                else if (evenOdd.equalsIgnoreCase("odd"))
                {
                    System.out.println("is the number...\n1-greater than 5\n2-less than 5\n3-equal to 5");
                    int gle = kbReader.nextInt();
                    switch (gle)
                    {
                        case 1:
                        System.out.println("Is the number 7, or greater than 7 (=/>)");
                        String eg = kbReader.next();
                        if (eg.equals("="))
                        {
                            System.out.println("Is the card clubs or spades? (clubs/spades)");
                            sORc = kbReader.next();
                            if (sORc.equalsIgnoreCase("spades"))
                            {
                                System.out.println("Is your card the Seven of Spades? (Yes/No)");
                                yesNo = kbReader.next();
                                if (yesNo.equalsIgnoreCase("yes"))
                                {
                                    System.out.print("Neat");
                                    picture.loadImage("monkeyhaircut.jpeg");
                                    picture.show();
                                }
                                else if (yesNo.equalsIgnoreCase("no"))
                                    System.out.print("I blame the user");
                                else
                                    System.out.print("that was not yes or no");
                            }
                            else if (sORc.equalsIgnoreCase("clubs"))
                            {
                                System.out.println("Is your card the Seven of Clubs? (Yes/No)");
                                yesNo = kbReader.next();
                                if (yesNo.equalsIgnoreCase("yes"))
                                {
                                    System.out.print("Neat");
                                    picture.loadImage("monkeyhaircut.jpeg");
                                    picture.show();
                                }
                                else if (yesNo.equalsIgnoreCase("no"))
                                    System.out.print("I blame the user");
                                else
                                    System.out.print("that was not yes or no");
                            }
                        }
                        else if (eg.equals(">"))
                        {
                            System.out.println("Is the card clubs or spades? (clubs/spades)");
                            sORc = kbReader.next();
                            if (sORc.equalsIgnoreCase("spades"))
                            {
                                System.out.println("Is your card the Nine of Spades? (Yes/No)");
                                yesNo = kbReader.next();
                                if (yesNo.equalsIgnoreCase("yes"))
                                {
                                    System.out.print("Neat");
                                    picture.loadImage("monkeyhaircut.jpeg");
                                    picture.show();
                                }
                                else if (yesNo.equalsIgnoreCase("no"))
                                    System.out.print("I blame the user");
                                else
                                    System.out.print("that was not yes or no");
                            }
                            else if (sORc.equalsIgnoreCase("clubs"))
                            {
                                System.out.println("Is your card the Nine of Clubs? (Yes/No)");
                                yesNo = kbReader.next();
                                if (yesNo.equalsIgnoreCase("yes"))
                                {
                                    System.out.print("Neat");
                                    picture.loadImage("monkeyhaircut.jpeg");
                                    picture.show();
                                }
                                else if (yesNo.equalsIgnoreCase("no"))
                                    System.out.print("I blame the user");
                                else
                                    System.out.print("that was not yes or no");
                            }
                        }
                        else
                            System.out.print("that was not a = symbol or a > symbol");
                        break;
                        case 2:
                        System.out.println("Is the number 3, or less than 3 (=/<)");
                        String el = kbReader.next();
                        if (el.equals("="))
                        {
                            System.out.println("Is the card clubs or spades? (clubs/spades)");
                            sORc = kbReader.next();
                            if (sORc.equalsIgnoreCase("spades"))
                            {
                                System.out.println("Is your card the Three of Spades? (Yes/No)");
                                yesNo = kbReader.next();
                                if (yesNo.equalsIgnoreCase("yes"))
                                {
                                    System.out.print("Neat");
                                    picture.loadImage("monkeyhaircut.jpeg");
                                    picture.show();
                                }
                                else if (yesNo.equalsIgnoreCase("no"))
                                    System.out.print("I blame the user");
                                else
                                    System.out.print("that was not yes or no");
                            }
                            else if (sORc.equalsIgnoreCase("clubs"))
                            {
                                System.out.println("Is your card the Three of Clubs? (Yes/No)");
                                yesNo = kbReader.next();
                                if (yesNo.equalsIgnoreCase("yes"))
                                {
                                    System.out.print("Neat");
                                    picture.loadImage("monkeyhaircut.jpeg");
                                    picture.show();
                                }
                                else if (yesNo.equalsIgnoreCase("no"))
                                    System.out.print("I blame the user");
                                else
                                    System.out.print("that was not yes or no");
                            }
                        }
                        else if (el.equals("<"))
                        {
                            System.out.println("Is the card clubs or spades? (clubs/spades)");
                            sORc = kbReader.next();
                            if (sORc.equalsIgnoreCase("spades"))
                            {
                                System.out.println("Is your card the Ace of Spades? (Yes/No)");
                                yesNo = kbReader.next();
                                if (yesNo.equalsIgnoreCase("yes"))
                                {
                                    System.out.print("Neat");
                                    picture.loadImage("monkeyhaircut.jpeg");
                                    picture.show();
                                }
                                else if (yesNo.equalsIgnoreCase("no"))
                                    System.out.print("I blame the user");
                                else
                                    System.out.print("that was not yes or no");
                            }
                            else if (sORc.equalsIgnoreCase("clubs"))
                            {
                                System.out.println("Is your card the Ace of Clubs? (Yes/No)");
                                yesNo = kbReader.next();
                                if (yesNo.equalsIgnoreCase("yes"))
                                {
                                    System.out.print("Neat");
                                    picture.loadImage("monkeyhaircut.jpeg");
                                    picture.show();
                                }
                                else if (yesNo.equalsIgnoreCase("no"))
                                    System.out.print("I blame the user");
                                else
                                    System.out.print("that was not yes or no");
                            }
                        }
                        else
                            System.out.print("that was not a = symbol or a > symbol");
                        break;
                        case 3:
                        System.out.println("Is the card clubs or spades? (clubs/spades)");
                        sORc = kbReader.next();
                        if (sORc.equalsIgnoreCase("spades"))
                        {
                            System.out.println("Is your card the Five of Spades? (Yes/No)");
                            yesNo = kbReader.next();
                            if (yesNo.equalsIgnoreCase("yes"))
                            {
                                System.out.print("Neat");
                                picture.loadImage("monkeyhaircut.jpeg");
                                picture.show();
                            }
                            else if (yesNo.equalsIgnoreCase("no"))
                                System.out.print("I blame the user");
                            else
                                System.out.print("that was not yes or no");
                        }
                        else if (sORc.equalsIgnoreCase("hearts"))
                        {
                            System.out.println("Is your card the Five of Clubs? (Yes/No)");
                            yesNo = kbReader.next();
                            if (yesNo.equalsIgnoreCase("yes"))
                            {
                                System.out.print("Neat");
                                picture.loadImage("monkeyhaircut.jpeg");
                                picture.show();
                            }
                            else if (yesNo.equalsIgnoreCase("no"))
                                System.out.print("I blame the user");
                            else
                                System.out.print("that was not yes or no");
                        }
                        break;
                        default:
                        System.out.print("that wan not a number 1 to 3");
                    }
                }
                else
                    System.out.print("that was not \"even\" or \"odd\"");

                default:
                System.out.println("That was not the numbers 1 or 2");
            }
        }   
    }
}