package ex37;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

/*
 *  UCF COP3330 Fall 2021 Assignment 37 Solution
 *  Copyright 2021 first_name last_name
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String setOfCharacters = "abcdefghxyz-$/#@";

        int numCounter = 0;
        int charCounter = 0;


        System.out.println( "What's the minimum length?" );
        int minLen = sc.nextInt();
        String[] password = new String[minLen];
        System.out.println( "How many special characters?" );
        int numChar = sc.nextInt();
        System.out.println( "How many numbers?" );
        int numbers =  sc.nextInt();

        for(int i = 0; i < minLen; i++)
        {
            int tmp = (int) ( Math.random() * 2 + 1);

            if(tmp == 1 && charCounter != numChar) {
                int randomInt = random.nextInt(setOfCharacters.length());
                char randomChar = setOfCharacters.charAt(randomInt);
                password[i] = Character.toString(randomChar);
                charCounter++;
            }
            else if (tmp == 2 && numCounter != numbers)
            {
                int int_random = random.nextInt(9);
                password[i] = Integer.toString(int_random);
                numCounter++;
            }

        }

        System.out.println( "Your password is" + password);

    }
}
