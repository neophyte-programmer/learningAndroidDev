package com.example.randomNumberGuesser;

import java.util.Random;
import java.util.Scanner;

public class Main {

    /*
    * We are going to make a game
    * This concept is: Generate a random number and ask the user to guess the number
    * Continue asking until you receive the number
    * After 5 times of guessing show a game over message
    *
    * Here is how it works:
    * Show a welcome message
    * Ask the user for his or her name and say hello to them
    * Ask if we should start the game
    * After receiving a positive answer, generate a random number and ask for the user's guess
    * If the user's guess is correct, show a congratulation message and quit the game
    * If the number is incorrect, ask again until you receive the correct number
    * As a hint beside the first time, everytime that you are asking for a number, tell the user to guess higher or lower
    * If the user fails 5 times, show a game over message and quit the game
    * */


    public static void main(String[] args) {
        System.out.println("Welcome to the Random Number Guesser!\nWhat is your name?");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        System.out.println("Hello " + name + "!");
        System.out.println("Do you want to continue the game?");
        System.out.println("\t1. Yes");
        System.out.println("\t2. No");

        int play = scanner.nextInt();

        if (play == 1){
            System.out.println("Guess a number between 0 and 10");
            Random random = new Random();
            int number = random.nextInt(11);



            for (int i = 0; i < 5; i++) {

                int guess = scanner.nextInt();

                if (guess == number) {
                    System.out.println("Congratulations. You won!");
                    break;
                }
                else if (guess > number) {
                    System.out.println("Guess a number lower than " + guess);
                }

                else if (guess < number) {
                    System.out.println("Guess a number higher than " + guess);
                }
            }

            System.out.println("Oops. You entered a wrong number 5 times. You lose!");
        }



    }
}
