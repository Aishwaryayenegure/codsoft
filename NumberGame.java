package com.question;
import java.util.Random;
import java.util.Scanner;
  
public class NumberGame{
    public static void main(String[] args)
    {
  
        // stores actual and guess number
        int answer, guess;
  
          // maximum value is 100
        final int MAX = 100;
  
        // takes input using scanner
        Scanner in = new Scanner(System.in);
  
        // Random instance
        Random rand = new Random();
  
        boolean correct = false;
  
        // correct answer
        answer = rand.nextInt(MAX) + 1;
  
        // loop until the guess is correct
        while (!correct) {
  
            System.out.println("\nI have generated a number between 1 and 100, can you guess it ? ");
  
            // guess value
            guess = in.nextInt();
  
            // if guess is greater than actual
            if (guess > answer) {
                System.out.println("Too high,Try once again!");
            }
  
            // if guess is less than actual
            else if (guess < answer) {
                System.out.println("Too low,Try once again!");
            }
  
            // guess is equal to actual value
            else {
  
                System.out.println(
                    "\nCongratulations! you guessed the correct number!");
  
                correct = true;
            }
        }
        System.exit(0);
    }
}