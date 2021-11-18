package com.example.randomguess2;

import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Welcome to Random Guesser!");
        System.out.println("What is your name?");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        System.out.println("Hello " + name + "!");

        System.out.println("Do you want to start the game?");
        System.out.println("\t1. Yes");
        System.out.println("\t2. No");

        int play = scanner.nextInt();

        while (play != 1) {
            System.out.println("Do you want to start the game?");
            System.out.println("\t1. Yes");
            System.out.println("\t2. No");

            play = scanner.nextInt();
        }

        Random random = new Random();
        int number = random.nextInt(11);

        System.out.println("Guess a number.");
        int guess = scanner.nextInt();

        int timesTried = 0;
        boolean hasWon = false;
        boolean endGame = false;

        while (!endGame) {
            timesTried ++;

            if (timesTried < 5) {

                if (guess == number){
                    hasWon = true;
                    endGame = true;
                }else if (guess > number) {
                    System.out.println("Guess a number lower than " + guess);
                    guess = scanner.nextInt();
                } else {
                    System.out.println("Guess a number higher than " + guess);
                    guess = scanner.nextInt();
                }
            }else {
                endGame = true;
            }
        }

        if (hasWon) {
            System.out.println("Congratulations. You won in " + timesTried + " guesses!");
        } else {
            System.out.println("Game over");
            System.out.println("The number was: " + number);
        }


    }
}
