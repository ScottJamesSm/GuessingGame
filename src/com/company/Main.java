package com.company;

import java.util.Scanner;

public class Main {
    /*
    Give instructions
    Pick the random number
    get guess form user
    compare huess to the number
    notify
    user
     */



        public static void main(String[] args) {
System.out.println("welcome to the guessing game! I'm thinking of a number between 1 and 100. Can you figure it out?");

int randomNumber =  (int) Math.ceil(Math.random() * 100);
System.out.println(randomNumber);

            Scanner input = new Scanner(System.in);

int guessedNumber;
System.out.println("guess a number betwwen 1 and and 100");
guessedNumber = input.nextInt();
System.out.println("you guessed the number " + guessedNumber);
// need to compare
            if (randomNumber > guessedNumber) {
                System.out.println("your guess is too low. Guess higher.");
            } else if (randomNumber < guessedNumber) {
                System.out.println("guess is to high guess lower");
            } else {
                System.out.println("Congradulations! You guessed my number " + randomNumber + "!!!");
            }
            }
        }

/*
    public static void main(String[] args) {
	// write your code here

        double randomNumber;
        randomNumber = Math.random();
        System.out.println("The Random Number is: " + randomNumber);
        double randomNumberToInteger = randomNumber * 100;

        double randomNumberTimesHundred = randomNumber * 100;
        System.out.println("The Random Number times 100 is :" + randomNumberTimesHundred);

        double randomNumberRoundedToCeil = Math.ceil(randomNumber);
        System.out.println(randomNumberRoundedToCeil);

        double randomNumberRoundedToFloor = Math.floor(randomNumberTimesHundred);
        System.out.println("the rounded to floor is; " + randomNumberRoundedToFloor);

        double randomNumberRoundedNormally = Math.round(randomNumberTimesHundred);
        System.out.println("The Rounding that we're not used to: " + randomNumberRoundedNormally);

    }
}
*/
